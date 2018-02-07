package com.myit.ylw.dao;

import com.myit.ylw.pojo.UserLog;
import com.myit.ylw.pojo.UserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLogMapper {
    int countByExample(UserLogExample example);

    int deleteByExample(UserLogExample example);

    int insert(UserLog record);

    int insertSelective(UserLog record);

    List<UserLog> selectByExample(UserLogExample example);

    int updateByExampleSelective(@Param("record") UserLog record, @Param("example") UserLogExample example);

    int updateByExample(@Param("record") UserLog record, @Param("example") UserLogExample example);
}