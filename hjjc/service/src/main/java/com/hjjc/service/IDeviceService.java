package com.hjjc.service;

import java.util.List;

import com.hjjc.model.Devices;

public interface IDeviceService {
	public List<Devices> queryByCompanyId(String companyId);
	public List<Devices> queryExceptDevices(String day);
	public List<Devices> queryCompanyExceptDevices(String day,String companyID);
	public List<Devices> queryDevicesByIds(List<String> deviceIds);
}
