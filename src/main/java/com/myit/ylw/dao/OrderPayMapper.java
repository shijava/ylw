package com.myit.ylw.dao;

import com.myit.ylw.pojo.OrderPay;
import com.myit.ylw.pojo.OrderPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPayMapper {
    int countByExample(OrderPayExample example);

    int deleteByExample(OrderPayExample example);

    int insert(OrderPay record);

    int insertSelective(OrderPay record);

    List<OrderPay> selectByExampleWithBLOBs(OrderPayExample example);

    List<OrderPay> selectByExample(OrderPayExample example);

    int updateByExampleSelective(@Param("record") OrderPay record, @Param("example") OrderPayExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderPay record, @Param("example") OrderPayExample example);

    int updateByExample(@Param("record") OrderPay record, @Param("example") OrderPayExample example);
}