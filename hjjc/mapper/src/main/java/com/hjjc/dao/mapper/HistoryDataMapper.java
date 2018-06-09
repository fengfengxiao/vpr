package com.hjjc.dao.mapper;

import com.hjjc.model.HistoryData;
import com.hjjc.model.HistoryDataCriteria;
import com.hjjc.model.HistoryDataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryDataMapper {
    int countByExample(HistoryDataCriteria example);

    int deleteByExample(HistoryDataCriteria example);

    int deleteByPrimaryKey(HistoryDataKey key);

    int insert(HistoryData record);

    int insertSelective(HistoryData record);

    List<HistoryData> selectByExample(HistoryDataCriteria example);

    HistoryData selectByPrimaryKey(HistoryDataKey key);

    int updateByExampleSelective(@Param("record") HistoryData record, @Param("example") HistoryDataCriteria example);

    int updateByExample(@Param("record") HistoryData record, @Param("example") HistoryDataCriteria example);

    int updateByPrimaryKeySelective(HistoryData record);

    int updateByPrimaryKey(HistoryData record);
}