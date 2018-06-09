package com.hjjc.dao.mapper;

import com.hjjc.model.Devices;
import com.hjjc.model.DevicesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevicesMapper {
    int countByExample(DevicesCriteria example);

    int deleteByExample(DevicesCriteria example);

    int deleteByPrimaryKey(String deviceID);

    int insert(Devices record);

    int insertSelective(Devices record);

    List<Devices> selectByExample(DevicesCriteria example);
    
    List<Devices> selectExceptDevice(@Param("day")String day);
    
    List<Devices> selectCompanyExceptDevice(@Param("day")String day,@Param("companyID")String companyID);

    Devices selectByPrimaryKey(String deviceID);

    int updateByExampleSelective(@Param("record") Devices record, @Param("example") DevicesCriteria example);

    int updateByExample(@Param("record") Devices record, @Param("example") DevicesCriteria example);

    int updateByPrimaryKeySelective(Devices record);

    int updateByPrimaryKey(Devices record);
}