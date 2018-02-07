package com.myit.ylw.dao;

import com.myit.ylw.pojo.Order;
import com.myit.ylw.pojo.OrderExample;
import com.myit.ylw.pojo.OrderWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int insert(OrderWithBLOBs record);

    int insertSelective(OrderWithBLOBs record);

    List<OrderWithBLOBs> selectByExampleWithBLOBs(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    int updateByExampleSelective(@Param("record") OrderWithBLOBs record, @Param("example") OrderExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderWithBLOBs record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);
}