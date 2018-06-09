package com.hjjc.dao.mapper;

import com.hjjc.model.DeviceRelations;
import com.hjjc.model.DeviceRelationsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceRelationsMapper {
    int countByExample(DeviceRelationsCriteria example);

    int deleteByExample(DeviceRelationsCriteria example);

    int deleteByPrimaryKey(Integer DR_id);

    int insert(DeviceRelations record);

    int insertSelective(DeviceRelations record);

    List<DeviceRelations> selectByExample(DeviceRelationsCriteria example);

    DeviceRelations selectByPrimaryKey(Integer DR_id);

    int updateByExampleSelective(@Param("record") DeviceRelations record, @Param("example") DeviceRelationsCriteria example);

    int updateByExample(@Param("record") DeviceRelations record, @Param("example") DeviceRelationsCriteria example);

    int updateByPrimaryKeySelective(DeviceRelations record);

    int updateByPrimaryKey(DeviceRelations record);
}