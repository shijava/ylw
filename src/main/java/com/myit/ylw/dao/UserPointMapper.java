package com.myit.ylw.dao;

import com.myit.ylw.pojo.UserPoint;
import com.myit.ylw.pojo.UserPointExample;
import com.myit.ylw.pojo.UserPointWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointMapper {
    int countByExample(UserPointExample example);

    int deleteByExample(UserPointExample example);

    int insert(UserPointWithBLOBs record);

    int insertSelective(UserPointWithBLOBs record);

    List<UserPointWithBLOBs> selectByExampleWithBLOBs(UserPointExample example);

    List<UserPoint> selectByExample(UserPointExample example);

    int updateByExampleSelective(@Param("record") UserPointWithBLOBs record, @Param("example") UserPointExample example);

    int updateByExampleWithBLOBs(@Param("record") UserPointWithBLOBs record, @Param("example") UserPointExample example);

    int updateByExample(@Param("record") UserPoint record, @Param("example") UserPointExample example);
}