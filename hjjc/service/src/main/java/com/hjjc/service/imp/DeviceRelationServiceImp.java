package com.hjjc.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjjc.dao.mapper.DeviceRelationsMapper;
import com.hjjc.model.DeviceRelations;
import com.hjjc.model.DeviceRelationsCriteria;
import com.hjjc.service.IDeviceRelationService;

@Service
public class DeviceRelationServiceImp implements IDeviceRelationService {

	@Autowired
	private DeviceRelationsMapper deviceRelationsMapper;
	
	@Override
	public List<DeviceRelations> queryEnvironmentDevices(String deviceId) {
		DeviceRelationsCriteria criteria = new DeviceRelationsCriteria();
		criteria.createCriteria().andSCDeviceIDEqualTo(deviceId);
		return deviceRelationsMapper.selectByExample(criteria);
	}

}
