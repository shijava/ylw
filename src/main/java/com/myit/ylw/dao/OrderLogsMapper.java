package com.myit.ylw.dao;

import com.myit.ylw.pojo.OrderLogs;
import com.myit.ylw.pojo.OrderLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLogsMapper {
    int countByExample(OrderLogsExample example);

    int deleteByExample(OrderLogsExample example);

    int insert(OrderLogs record);

    int insertSelective(OrderLogs record);

    List<OrderLogs> selectByExampleWithBLOBs(OrderLogsExample example);

    List<OrderLogs> selectByExample(OrderLogsExample example);

    int updateByExampleSelective(@Param("record") OrderLogs record, @Param("example") OrderLogsExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderLogs record, @Param("example") OrderLogsExample example);

    int updateByExample(@Param("record") OrderLogs record, @Param("example") OrderLogsExample example);
}