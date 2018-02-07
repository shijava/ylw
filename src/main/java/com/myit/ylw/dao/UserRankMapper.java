package com.myit.ylw.dao;

import com.myit.ylw.pojo.UserRank;
import com.myit.ylw.pojo.UserRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRankMapper {
    int countByExample(UserRankExample example);

    int deleteByExample(UserRankExample example);

    int insert(UserRank record);

    int insertSelective(UserRank record);

    List<UserRank> selectByExample(UserRankExample example);

    int updateByExampleSelective(@Param("record") UserRank record, @Param("example") UserRankExample example);

    int updateByExample(@Param("record") UserRank record, @Param("example") UserRankExample example);
}