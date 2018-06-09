package com.hjjc.service;

import java.util.List;
import java.util.Map;

import com.hjjc.model.Company;

public interface ICompanyService {
	public List<Company> queryAllCompany();
	public List<Map<String,Object>> queryAllCompanyDeviceCount();
	public List<Map<String,Object>> queryCompanyExceptDeviceCount(String day);
	public List<Map<String,Object>> queryCompanyOfflineDeviceCount();
}
