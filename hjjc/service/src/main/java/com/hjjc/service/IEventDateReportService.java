package com.hjjc.service;

import java.util.List;

import com.hjjc.model.EventDateReport;

public interface IEventDateReportService {

	public List<EventDateReport> queryAlarmInfoByDevice(String deviceId,String day);
}
