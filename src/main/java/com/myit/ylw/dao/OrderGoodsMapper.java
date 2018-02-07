package com.myit.ylw.dao;

import com.myit.ylw.pojo.OrderGoods;
import com.myit.ylw.pojo.OrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsMapper {
    int countByExample(OrderGoodsExample example);

    int deleteByExample(OrderGoodsExample example);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    List<OrderGoods> selectByExample(OrderGoodsExample example);

    int updateByExampleSelective(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByExample(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);
}