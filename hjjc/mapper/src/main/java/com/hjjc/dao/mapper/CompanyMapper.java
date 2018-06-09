package com.hjjc.dao.mapper;

import com.hjjc.model.Company;
import com.hjjc.model.CompanyCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    int countByExample(CompanyCriteria example);

    int deleteByExample(CompanyCriteria example);

    int deleteByPrimaryKey(String companyID);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyCriteria example);

    Company selectByPrimaryKey(String companyID);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyCriteria example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyCriteria example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
    
    List<Map<String,Object>> countAllCompanyDeviceCount();

    List<Map<String,Object>> countCompanyExceptDeviceCount(@Param("day")String day);
    List<Map<String,Object>> countCompanyOfflineDeviceCount();
}