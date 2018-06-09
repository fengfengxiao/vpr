package com.hjjc.dao.mapper;

import com.hjjc.model.EventDateReportCodeTable;
import com.hjjc.model.EventDateReportCodeTableCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventDateReportCodeTableMapper {
    int countByExample(EventDateReportCodeTableCriteria example);

    int deleteByExample(EventDateReportCodeTableCriteria example);

    int deleteByPrimaryKey(Integer eventCode);

    int insert(EventDateReportCodeTable record);

    int insertSelective(EventDateReportCodeTable record);

    List<EventDateReportCodeTable> selectByExample(EventDateReportCodeTableCriteria example);

    EventDateReportCodeTable selectByPrimaryKey(Integer eventCode);

    int updateByExampleSelective(@Param("record") EventDateReportCodeTable record, @Param("example") EventDateReportCodeTableCriteria example);

    int updateByExample(@Param("record") EventDateReportCodeTable record, @Param("example") EventDateReportCodeTableCriteria example);

    int updateByPrimaryKeySelective(EventDateReportCodeTable record);

    int updateByPrimaryKey(EventDateReportCodeTable record);
}