package com.myit.ylw.dao;

import com.myit.ylw.pojo.UserPpt;
import com.myit.ylw.pojo.UserPptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPptMapper {
    int countByExample(UserPptExample example);

    int deleteByExample(UserPptExample example);

    int insert(UserPpt record);

    int insertSelective(UserPpt record);

    List<UserPpt> selectByExample(UserPptExample example);

    int updateByExampleSelective(@Param("record") UserPpt record, @Param("example") UserPptExample example);

    int updateByExample(@Param("record") UserPpt record, @Param("example") UserPptExample example);
}