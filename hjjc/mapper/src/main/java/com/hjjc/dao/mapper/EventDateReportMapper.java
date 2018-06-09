package com.hjjc.dao.mapper;

import com.hjjc.model.Devices;
import com.hjjc.model.EventDateReport;
import com.hjjc.model.EventDateReportCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventDateReportMapper {
    int countByExample(EventDateReportCriteria example);

    int deleteByExample(EventDateReportCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventDateReport record);

    int insertSelective(EventDateReport record);

    List<EventDateReport> selectByExample(EventDateReportCriteria example);

    EventDateReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventDateReport record, @Param("example") EventDateReportCriteria example);

    int updateByExample(@Param("record") EventDateReport record, @Param("example") EventDateReportCriteria example);

    int updateByPrimaryKeySelective(EventDateReport record);

    int updateByPrimaryKey(EventDateReport record);
    
    List<EventDateReport> selectDeviceAlarmInfo(@Param("day")String day,@Param("deviceId")String deviceId);
}