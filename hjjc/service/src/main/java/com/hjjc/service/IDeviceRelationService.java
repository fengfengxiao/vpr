package com.hjjc.service;

import java.util.List;

import com.hjjc.model.DeviceRelations;

public interface IDeviceRelationService {

	public List<DeviceRelations> queryEnvironmentDevices(String deviceId);
}
