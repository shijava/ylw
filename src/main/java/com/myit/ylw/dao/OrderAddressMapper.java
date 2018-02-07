package com.myit.ylw.dao;

import com.myit.ylw.pojo.OrderAddress;
import com.myit.ylw.pojo.OrderAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAddressMapper {
    int countByExample(OrderAddressExample example);

    int deleteByExample(OrderAddressExample example);

    int insert(OrderAddress record);

    int insertSelective(OrderAddress record);

    List<OrderAddress> selectByExample(OrderAddressExample example);

    int updateByExampleSelective(@Param("record") OrderAddress record, @Param("example") OrderAddressExample example);

    int updateByExample(@Param("record") OrderAddress record, @Param("example") OrderAddressExample example);
}