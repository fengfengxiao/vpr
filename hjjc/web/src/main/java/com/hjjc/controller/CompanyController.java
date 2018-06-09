package com.hjjc.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.hjjc.model.Company;
import com.hjjc.service.ICompanyService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private ICompanyService companyService;
	
	@RequestMapping("/queryAllCompany")
	@ResponseBody
	public String queryAllCompany(String structCode){
		List<Company> ls =  companyService.queryAllCompany();
		//查询每个公司的生产设备数量
		List<Map<String,Object>> companyDevices = companyService.queryAllCompanyDeviceCount();
		//离线设备汇总
		List<Map<String,Object>> offileLineDevices = companyService.queryCompanyOfflineDeviceCount();
		//异常设备汇总
		List<Map<String,Object>> exceptDevices = companyService.queryCompanyExceptDeviceCount(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		Map<String,Integer> companyDeviceCountMap = new HashMap<String,Integer>();
		Map<String,Integer> offileLineMap = new HashMap<String,Integer>();
		Map<String,Integer> exceptMap = new HashMap<String,Integer>();
		for (Map<String, Object> map : companyDevices) {
			companyDeviceCountMap.put(map.get("CompanyID")+"", (Integer)(map.get("deviceCount")));
		}
		for (Map<String, Object> map : offileLineDevices) {
			offileLineMap.put(map.get("CompanyID")+"", (Integer)(map.get("offlineDeviceCount")));
		}
		for (Map<String, Object> map : exceptDevices) {
			exceptMap.put(map.get("CompanyID")+"", (Integer)(map.get("exceptionDeviceCount")));
		}
		//
		JSONArray array = new JSONArray();
		for (Company company : ls) {
			String companyId = company.getCompanyID();
			Object totalDeviceCount = companyDeviceCountMap.get(companyId);
			Object offlineCount = offileLineMap.get(companyId);
			Object exceptCount = exceptMap.get(companyId);
			//公司没有设备直接跳出
			if(totalDeviceCount == null){
				continue;
			}
			JSONObject obj = new JSONObject();
			obj.put("id", companyId);
			obj.put("companyName", company.getCompanyName());
			obj.put("lat", company.getWd());
			obj.put("lng", company.getJd());
			obj.put("totalDeviceCount",totalDeviceCount==null?0:totalDeviceCount);
			obj.put("offlineDeviceCount",offlineCount==null?0:offlineCount);
			obj.put("exceptDeviceCount",exceptCount==null?0:exceptCount);
			array.add(obj);
		}
		return array.toString();
	}
	
	@RequestMapping(value="/queryCompany",method=RequestMethod.GET)
	@ResponseBody
	public String queryCompanyByName(@RequestParam(value="companyName",defaultValue="") String companyName,
			                         String structCode) throws UnsupportedEncodingException{
//		System.out.println("before decode companyname:"+companyName);
//		if(!StringUtils.isEmpty(companyName)){
//			System.out.println("companyName 1:" + URLDecoder.decode(companyName, "utf-8"));
//		    companyName=new String(companyName.getBytes("ISO-8859-1"),"UTF-8");
//		    System.out.println("company2 :"+companyName);
//		}
		List<Company> ls =  companyService.queryAllCompany();
		//查询每个公司的生产设备数量
		List<Map<String,Object>> companyDevices = companyService.queryAllCompanyDeviceCount();
		
		Map<String,Integer> companyDeviceCountMap = new HashMap<String,Integer>();
		for (Map<String, Object> map : companyDevices) {
			companyDeviceCountMap.put(map.get("CompanyID")+"", (Integer)(map.get("deviceCount")));
		}
		JSONArray array = new JSONArray();
		for (Company company : ls) {
			String companyId = company.getCompanyID();
			if(StringUtils.isEmpty(companyName)||company.getCompanyName().indexOf(companyName) != -1){
				Object totalDeviceCount = companyDeviceCountMap.get(companyId);
				JSONObject obj = new JSONObject();
				obj.put("id", companyId);
				obj.put("companyName", company.getCompanyName());
				obj.put("totalDeviceCount",totalDeviceCount==null?0:totalDeviceCount);
				array.add(obj);
			}
			
		}
		return array.toString();
	}
}
