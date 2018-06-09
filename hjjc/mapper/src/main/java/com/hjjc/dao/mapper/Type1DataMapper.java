package com.hjjc.dao.mapper;

import com.hjjc.model.Type1Data;
import com.hjjc.model.Type1DataCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Type1DataMapper {
    int countByExample(Type1DataCriteria example);

    int deleteByExample(Type1DataCriteria example);

    int deleteByPrimaryKey(String deviceID);

    int insert(Type1Data record);

    int insertSelective(Type1Data record);

    List<Type1Data> selectByExample(Type1DataCriteria example);

    Type1Data selectByPrimaryKey(String deviceID);

    int updateByExampleSelective(@Param("record") Type1Data record, @Param("example") Type1DataCriteria example);

    int updateByExample(@Param("record") Type1Data record, @Param("example") Type1DataCriteria example);

    int updateByPrimaryKeySelective(Type1Data record);

    int updateByPrimaryKey(Type1Data record);
}