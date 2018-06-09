package com.hjjc.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjjc.dao.mapper.CompanyMapper;
import com.hjjc.model.Company;
import com.hjjc.model.CompanyCriteria;
import com.hjjc.service.ICompanyService;

@Service
public class CompanyService implements ICompanyService {

	@Autowired
	private CompanyMapper companyMapper;
	
	@Override
	public List<Company> queryAllCompany() {
		CompanyCriteria criteria = new CompanyCriteria();
		return companyMapper.selectByExample(criteria);
	}

	@Override
	public List<Map<String, Object>> queryAllCompanyDeviceCount() {
		return companyMapper.countAllCompanyDeviceCount();
	}

	@Override
	public List<Map<String, Object>> queryCompanyExceptDeviceCount(String day) {
		return companyMapper.countCompanyExceptDeviceCount(day);
	}

	@Override
	public List<Map<String, Object>> queryCompanyOfflineDeviceCount() {
		return companyMapper.countCompanyOfflineDeviceCount();
	}

}
