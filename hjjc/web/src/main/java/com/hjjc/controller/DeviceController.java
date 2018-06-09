package com.hjjc.controller;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.hjjc.model.DeviceRelations;
import com.hjjc.model.Devices;
import com.hjjc.model.EventDateReport;
import com.hjjc.model.HistoryData;
import com.hjjc.service.IDeviceRelationService;
import com.hjjc.service.IDeviceService;
import com.hjjc.service.IEventDateReportService;
import com.hjjc.service.IHistoryDataService;
import com.hjjc.utils.ConstantsConfig;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/device")
public class DeviceController {

	@Autowired
	private IDeviceService deviceService;
	
	@Autowired
	private IDeviceRelationService deviceRelationService;
	
	@Autowired
	private IHistoryDataService historyDataService;
	
	@Autowired
	private IEventDateReportService eventDateReportService;
	
	@RequestMapping(value="/queryDevicesByCompany",method=RequestMethod.GET)
	@ResponseBody
	public String allCompanyDevice(String companyId){
		List<Devices> devices = deviceService.queryByCompanyId(companyId);
		List<Devices> exceptDevices = deviceService.queryCompanyExceptDevices(new SimpleDateFormat("yyyy-MM-dd").format(new Date()), companyId);
		Set<String> exceptDeviceSet = new HashSet<String>();
		for (Devices device : exceptDevices) {
			exceptDeviceSet.add(device.getDeviceID());
		}
		JSONArray array = new JSONArray();
		for (Devices device : devices) {
			JSONObject obj = JSONObject.fromObject(device);
			Date now = new Date();
			long minuteDiff = 0l;
			if(device.getLastDataTime() == null){
				obj.put("lastDataTime", "");
				minuteDiff = Long.MAX_VALUE;
			}
			else{
				obj.put("lastDataTime", new SimpleDateFormat("yyyy-MM-dd HH:mm").format(device.getLastDataTime()));
				minuteDiff = now.getTime() - device.getLastDataTime().getTime();
			}
			
			
			if(minuteDiff > 1000 * 60 * 60){
				obj.put("inlineState", ConstantsConfig.OFFLINE_STATE_OFFILE);
			}
			else{
				obj.put("inlineState", ConstantsConfig.OFFLINE_STATE_ONLINE);
			}
			if(exceptDeviceSet.contains(device.getDeviceID())){
				obj.put("exceptState", ConstantsConfig.EXCEPT_STATE_UNNORMAL);
			}
			else{
				obj.put("exceptState", ConstantsConfig.EXCEPT_STATE_NORMAL);
			}
			
			array.add(obj);
		}
		return array.toString();
	}
	
	@RequestMapping(value="/queryExceptDevices",method=RequestMethod.GET)
	@ResponseBody
	public String queryExceptDevices(long day,String structCode){
		Date date = new Date(day);
		String day1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
		List<Devices> devices = deviceService.queryExceptDevices(day1);
		JSONArray array = new JSONArray();
		for (Devices device : devices) {
			JSONObject obj = JSONObject.fromObject(device);
			if(device.getLastDataTime() == null){
				obj.put("lastDataTime", "");
			}
			else{
				obj.put("lastDataTime", new SimpleDateFormat("yyyy-MM-dd HH:mm").format(device.getLastDataTime()));	
			}
			
			Date now = new Date();
			long minuteDiff = now.getTime() - device.getLastDataTime().getTime();
			if(minuteDiff > 1000 * 60 * 60){
				obj.put("inlineState", ConstantsConfig.OFFLINE_STATE_OFFILE);
			}
			else{
				obj.put("inlineState", ConstantsConfig.OFFLINE_STATE_ONLINE);
			}
			obj.put("exceptState", ConstantsConfig.EXCEPT_STATE_UNNORMAL);
			array.add(obj);
		}
		return array.toString();
	}
	
	@RequestMapping(value="/queryDeviceHistoryData",method=RequestMethod.GET)
	@ResponseBody
	public String queryDeviceHistoryData(long day,String deviceId){
		Date date = new Date(day);
		String day1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
		List<DeviceRelations> relations = deviceRelationService.queryEnvironmentDevices(deviceId);
		List<String> environmentDids = new ArrayList<String>();
		if(relations != null && relations.size() > 0){
			for (DeviceRelations relation : relations) {
				if(!StringUtils.isEmpty(relation.getHBDeviceID())){
					environmentDids.addAll(Arrays.asList(relation.getHBDeviceID().split(";")));
				}
			}
		}
		environmentDids.add(deviceId);
		//查询获取设备信息
		List<Devices> devices = deviceService.queryDevicesByIds(environmentDids);
		//查询设备历史数据
		List<HistoryData> historyData = historyDataService.queryDevicesHistoryData(environmentDids, day1);
		List<EventDateReport> eventDateReportLs = new ArrayList<EventDateReport>();
		for (String str : environmentDids) {
			List<EventDateReport> edr = eventDateReportService.queryAlarmInfoByDevice(str, day1);
			if(edr != null && edr.size() > 0){
				eventDateReportLs.addAll(edr);
			}
		}
		
		//报警信息创建索引
		HashSet<String> alarmSet = new HashSet<String>();
		for (EventDateReport eventDateReport : eventDateReportLs) {
			String time = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(eventDateReport.getDateTime());
			alarmSet.add(eventDateReport.getDeviceID()+time);
		}
		
		
		JSONObject rs = new JSONObject();
		
		JSONObject productJson = new JSONObject();
		JSONObject environmentJson = new JSONObject();
		Map<String,List<HistoryData>> deviceHsDtMp = new HashMap<String,List<HistoryData>>();
		Map<String,List<HistoryData>> deviceHsDtMpNew = new HashMap<String,List<HistoryData>>();
		
		for (HistoryData data : historyData) {
			List<HistoryData> hsLs = deviceHsDtMp.get(data.getDeviceID());
			if(hsLs == null){
				hsLs = new ArrayList<HistoryData>();
				deviceHsDtMp.put(data.getDeviceID(), hsLs);
			}
			hsLs.add(data);
		}
		
		//多设备的时候，填充某个设备没有数据的时间段
		if(devices != null && devices.size() >= 1){
			long beginTime = Long.MAX_VALUE;
			long endTime = Long.MIN_VALUE;
			for (Entry<String,List<HistoryData>> entry : deviceHsDtMp.entrySet()) {
				List<HistoryData> hdLs = entry.getValue();
				if(hdLs == null || hdLs.size() == 0){
					continue;
				}
				long start = hdLs.get(0).getDataTime_Hour().getTime();
				long end = hdLs.get(hdLs.size() -1).getDataTime_Hour().getTime();
				if(beginTime > start){
					beginTime = start;
				}
				if(endTime < end){
					endTime = end;
				}
			}
			
			//补数据
			
			for (Entry<String,List<HistoryData>> entry : deviceHsDtMp.entrySet()) {
				List<HistoryData> preLs = new ArrayList<HistoryData>();
				List<HistoryData> afterLs = new ArrayList<HistoryData>();
				List<HistoryData> hdLs = entry.getValue();
				long start = hdLs.get(0).getDataTime_Hour().getTime();
				long end = hdLs.get(hdLs.size() -1).getDataTime_Hour().getTime();
				if(beginTime < start){
					for(long i = beginTime ; i < start ;  i =i + 15*60*1000){
						preLs.add(initHistoryData(hdLs.get(0).getDeviceID(), i));
					}
				}
				if(endTime > end){
					for(long i = (end+15*60*1000) ; i <= endTime ;  i =i + 15*60*1000){
						afterLs.add(initHistoryData(hdLs.get(0).getDeviceID(), i));
					}
				}
				int index = 0 ;
				boolean flag = false;
				List<HistoryData> middleLs = new ArrayList<HistoryData>();
				for(long i = start ; i <= end ; i = i + 15*60*1000){
					boolean isFind = false;
					for(int j = index ;  j < hdLs.size();j ++ ){
						if(hdLs.get(j).getDataTime_Hour().getTime() == i){
							isFind = true;
							index = j;
						}
					}
					if(isFind){
						continue;
					}
					if(!flag){
						flag = true;
					}
					middleLs.add(initHistoryData(hdLs.get(index).getDeviceID(), i));
				}
				hdLs.addAll(middleLs);
				//插入了元素排序
				if(flag){
					Collections.sort(hdLs, new Comparator<HistoryData>() {

						@Override
						public int compare(HistoryData o1, HistoryData o2) {
							long time1 = o1.getDataTime_Hour().getTime();
							long time2 = o2.getDataTime_Hour().getTime();
							if(time1 < time2)
								return -1;
							else if(time1 > time2)
								return 1;
							return 0;
						}
					});
				}
				
				//重组
				if(preLs.size() != 0 || afterLs.size() != 0){
					List<HistoryData> mergLs = new ArrayList<HistoryData>();
					mergLs.addAll(preLs);
					mergLs.addAll(hdLs);
					mergLs.addAll(afterLs);
					hdLs = mergLs;
				}
				deviceHsDtMpNew.put(entry.getKey(), hdLs);
			}
		}
		
		Devices productDevice = null;
		for (Devices device : devices) {
			if(device.getDeviceID().equals(deviceId)){
				productDevice = device;
				break;
			}
		}
		
		//生产设备数据
		JSONObject productDeviceInfo = JSONObject.fromObject(productDevice);
		if(productDevice.getLastDataTime() == null){
			productDeviceInfo.put("lastDataTime", "");
		}
		else{
			productDeviceInfo.put("lastDataTime", new SimpleDateFormat("yyyy-MM-dd HH:mm").format(productDevice.getLastDataTime()));
		}
		productDeviceInfo.put("ratedCurrent",calculateRatedCurrent(productDevice));
		
		productJson.put("deviceInfo", productDeviceInfo);
		List<HistoryData> data = deviceHsDtMpNew.get(productDevice.getDeviceID());
		productJson.put("data", historyDataToJArray(data,alarmSet));
		//环保设备数据
		JSONArray environmentArray = new JSONArray();
		for (Devices device : devices) {
			if(device.getDeviceID().equals(deviceId)){
				continue;
			}
			JSONObject objEnviron = new JSONObject();
			JSONObject obj = JSONObject.fromObject(device);
			if(device.getLastDataTime() == null){
				obj.put("lastDataTime", "");
			}
			else{
				obj.put("lastDataTime", new SimpleDateFormat("yyyy-MM-dd HH:mm").format(device.getLastDataTime()));
			}
			obj.put("ratedCurrent", calculateRatedCurrent(device));
			objEnviron.put("deviceInfo", obj);
			data = deviceHsDtMpNew.get(device.getDeviceID());
			objEnviron.put("data", historyDataToJArray(data,alarmSet));
			environmentArray.add(objEnviron);
		}
		rs.put("productDevice", productJson);
		rs.put("environmentDevice", environmentArray);
		
		return rs.toString();
	}
	
	private double  calculateRatedCurrent(Devices device){
		double rs = 0d;
		double sum = 0d;
		double number = 0;
		if(device.getPhaseACurrent() != null && device.getPhaseACurrent() != -1d){
			sum += device.getPhaseACurrent();
			number ++;
		}
		if(device.getPhaseBCurrent() != null && device.getPhaseBCurrent() != -1d){
			sum += device.getPhaseBCurrent();
			number ++;
		}
		if(device.getPhaseCCurrent() != null && device.getPhaseCCurrent() != -1d){
			sum += device.getPhaseCCurrent();
			number ++;
		}
		DecimalFormat decimalFormat1 =new DecimalFormat(".0");
		if(number != 0){
			return Double.parseDouble(decimalFormat1.format(sum/(double)number));
		}
		return rs;
	}
	
	private HistoryData initHistoryData(String deviceId,long time){
		HistoryData data = new HistoryData();
		data.setDeviceID(deviceId);
		data.setCurrentA(0f);
		data.setCurrentB(0f);
		data.setCurrentC(0f);
		data.setVoltA(0f);
		data.setVoltB(0f);
		data.setVoltC(0f);
		data.setEnergyA(0f);
		data.setEnergyB(0f);
		data.setEnergyC(0f);
		data.setDataTime_Hour(new Date(time));
		return data;
	}
	private JSONArray historyDataToJArray(List<HistoryData> ls,Set<String> alarmSet){
		JSONArray array = new JSONArray();
		DecimalFormat decimalFormat =new DecimalFormat(".000");
		DecimalFormat decimalFormat1 =new DecimalFormat(".0");
		DecimalFormat decimalFormat2 =new DecimalFormat(".000");
		if(ls == null){
			return array;
		}
		for (HistoryData data : ls) {
			JSONObject obj = new JSONObject();
			String datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data.getDataTime_Hour());
			obj.put("datatime",datetime );
			float curentA = data.getCurrentA() == -1|| data.getCurrentA() == null?0:data.getCurrentA();
			float curentB = data.getCurrentB() == -1|| data.getCurrentB() == null?0:data.getCurrentB();
			float curentC = data.getCurrentC() == -1|| data.getCurrentC() == null?0:data.getCurrentC();
			
			float current = (curentA + curentB + curentC)/3;
			current = Float.parseFloat(decimalFormat.format(current));
			
			float voltA = data.getVoltA() == -1 || data.getVoltA() == null?0:data.getVoltA();
			float voltB = data.getVoltB() == -1 || data.getVoltB() == null?0:data.getVoltB();
			float voltC = data.getVoltC() == -1 || data.getVoltC() == null?0:data.getVoltC();
			
			float volt = (voltA + voltB + voltC)/3;
			
			volt = Float.parseFloat(decimalFormat1.format(volt));
			
			float energyA = data.getEnergyA() == -1|| data.getEnergyA() == null?0:data.getEnergyA();
			float energyB = data.getEnergyB() == -1|| data.getEnergyB() == null?0:data.getEnergyB();
			float energyC = data.getEnergyC() == -1|| data.getEnergyC() == null?0:data.getEnergyC();
			
			float energy = energyA + energyB + energyC;
			obj.put("current", current);
			obj.put("volt", volt);
			obj.put("energy", Float.parseFloat(decimalFormat2.format(energy)));
			if(alarmSet.contains(data.getDeviceID()+datetime)){
				obj.put("alarm", "关联环保设备异常关停");
			}
			else{
				obj.put("alarm", "");
			}
			array.add(obj);
		}
		return array;
	}
}
