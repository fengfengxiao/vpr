package com.hjjc.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjjc.dao.mapper.DevicesMapper;
import com.hjjc.model.Devices;
import com.hjjc.model.DevicesCriteria;
import com.hjjc.service.IDeviceService;

@Service
public class DeviceServiceImp implements IDeviceService {

	@Autowired
	private DevicesMapper devicesMapper;
	@Override
	public List<Devices> queryByCompanyId(String companyId) {
		DevicesCriteria devicesCriteria = new DevicesCriteria();
		devicesCriteria.createCriteria().andCompanyIDEqualTo(companyId)
										.andDeviceTypeEqualTo("生产设备");
		List<Devices> devices = devicesMapper.selectByExample(devicesCriteria);
		return devices;
	}
	
	@Override
	public List<Devices> queryExceptDevices(String day) {
		return devicesMapper.selectExceptDevice(day);
	}

	@Override
	public List<Devices> queryDevicesByIds(List<String> deviceIds) {
		DevicesCriteria devicesCriteria = new DevicesCriteria();
		devicesCriteria.createCriteria().andDeviceIDIn(deviceIds);
		return devicesMapper.selectByExample(devicesCriteria);
	}

	@Override
	public List<Devices> queryCompanyExceptDevices(String day, String companyID) {
		return devicesMapper.selectCompanyExceptDevice(day, companyID);
	}

}
