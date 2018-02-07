package com.myit.ylw.dao;

import com.myit.ylw.pojo.PointProductOrder;
import com.myit.ylw.pojo.PointProductOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointProductOrderMapper {
    int countByExample(PointProductOrderExample example);

    int deleteByExample(PointProductOrderExample example);

    int insert(PointProductOrder record);

    int insertSelective(PointProductOrder record);

    List<PointProductOrder> selectByExample(PointProductOrderExample example);

    int updateByExampleSelective(@Param("record") PointProductOrder record, @Param("example") PointProductOrderExample example);

    int updateByExample(@Param("record") PointProductOrder record, @Param("example") PointProductOrderExample example);
}