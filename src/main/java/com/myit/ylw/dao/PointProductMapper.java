package com.myit.ylw.dao;

import com.myit.ylw.pojo.PointProduct;
import com.myit.ylw.pojo.PointProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointProductMapper {
    int countByExample(PointProductExample example);

    int deleteByExample(PointProductExample example);

    int insert(PointProduct record);

    int insertSelective(PointProduct record);

    List<PointProduct> selectByExample(PointProductExample example);

    int updateByExampleSelective(@Param("record") PointProduct record, @Param("example") PointProductExample example);

    int updateByExample(@Param("record") PointProduct record, @Param("example") PointProductExample example);
}