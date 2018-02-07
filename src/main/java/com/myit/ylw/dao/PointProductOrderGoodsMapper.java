package com.myit.ylw.dao;

import com.myit.ylw.pojo.PointProductOrderGoods;
import com.myit.ylw.pojo.PointProductOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointProductOrderGoodsMapper {
    int countByExample(PointProductOrderGoodsExample example);

    int deleteByExample(PointProductOrderGoodsExample example);

    int insert(PointProductOrderGoods record);

    int insertSelective(PointProductOrderGoods record);

    List<PointProductOrderGoods> selectByExample(PointProductOrderGoodsExample example);

    int updateByExampleSelective(@Param("record") PointProductOrderGoods record, @Param("example") PointProductOrderGoodsExample example);

    int updateByExample(@Param("record") PointProductOrderGoods record, @Param("example") PointProductOrderGoodsExample example);
}