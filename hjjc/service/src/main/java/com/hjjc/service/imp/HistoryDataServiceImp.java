package com.hjjc.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjjc.dao.mapper.HistoryDataMapper;
import com.hjjc.model.HistoryData;
import com.hjjc.model.HistoryDataCriteria;
import com.hjjc.service.IHistoryDataService;

@Service
public class HistoryDataServiceImp implements IHistoryDataService {

	@Autowired
	private HistoryDataMapper historyDataMapper;
	
	@Override
	public List<HistoryData> queryDevicesHistoryData(List<String> deviceIds,String day) {
		List<HistoryData> ls = new ArrayList<HistoryData>();
		try{
			HistoryDataCriteria criteria = new HistoryDataCriteria();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date startTime = format.parse(day + " 00:00:00");
			Date endTime = format.parse(day + " 23:59:59");
			criteria.createCriteria().andDeviceIDIn(deviceIds).andDataTime_HourBetween(startTime, endTime);
			criteria.setOrderByClause("DataTime_Hour asc");
			ls = historyDataMapper.selectByExample(criteria);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return ls;
	}

}
