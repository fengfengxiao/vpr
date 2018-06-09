package com.hjjc.service;

import java.util.List;

import com.hjjc.model.HistoryData;

public interface IHistoryDataService {

	public List<HistoryData> queryDevicesHistoryData(List<String> deviceIds,String day);
}
