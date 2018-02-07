package com.myit.ylw.dao;

import com.myit.ylw.pojo.PointProductCart;
import com.myit.ylw.pojo.PointProductCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointProductCartMapper {
    int countByExample(PointProductCartExample example);

    int deleteByExample(PointProductCartExample example);

    int insert(PointProductCart record);

    int insertSelective(PointProductCart record);

    List<PointProductCart> selectByExample(PointProductCartExample example);

    int updateByExampleSelective(@Param("record") PointProductCart record, @Param("example") PointProductCartExample example);

    int updateByExample(@Param("record") PointProductCart record, @Param("example") PointProductCartExample example);
}