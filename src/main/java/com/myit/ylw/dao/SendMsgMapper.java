package com.myit.ylw.dao;

import com.myit.ylw.pojo.SendMsg;
import com.myit.ylw.pojo.SendMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendMsgMapper {
    int countByExample(SendMsgExample example);

    int deleteByExample(SendMsgExample example);

    int insert(SendMsg record);

    int insertSelective(SendMsg record);

    List<SendMsg> selectByExampleWithBLOBs(SendMsgExample example);

    List<SendMsg> selectByExample(SendMsgExample example);

    int updateByExampleSelective(@Param("record") SendMsg record, @Param("example") SendMsgExample example);

    int updateByExampleWithBLOBs(@Param("record") SendMsg record, @Param("example") SendMsgExample example);

    int updateByExample(@Param("record") SendMsg record, @Param("example") SendMsgExample example);
}