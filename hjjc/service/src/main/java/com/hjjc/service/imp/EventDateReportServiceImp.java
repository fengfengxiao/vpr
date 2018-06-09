package com.hjjc.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjjc.dao.mapper.EventDateReportMapper;
import com.hjjc.model.EventDateReport;
import com.hjjc.service.IEventDateReportService;

@Service
public class EventDateReportServiceImp implements IEventDateReportService {

	@Autowired
	private EventDateReportMapper eventDateReportMapper;
	@Override
	public List<EventDateReport> queryAlarmInfoByDevice(String deviceId, String day) {
		return eventDateReportMapper.selectDeviceAlarmInfo(day, deviceId);
	}

}
