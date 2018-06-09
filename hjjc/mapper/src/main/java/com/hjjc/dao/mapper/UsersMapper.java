package com.hjjc.dao.mapper;

import com.hjjc.model.Users;
import com.hjjc.model.UsersCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int countByExample(UsersCriteria example);

    int deleteByExample(UsersCriteria example);

    int deleteByPrimaryKey(Integer userID);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersCriteria example);

    Users selectByPrimaryKey(Integer userID);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersCriteria example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersCriteria example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}