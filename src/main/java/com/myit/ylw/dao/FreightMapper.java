package com.myit.ylw.dao;

import com.myit.ylw.pojo.Freight;
import com.myit.ylw.pojo.FreightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreightMapper {
    int countByExample(FreightExample example);

    int deleteByExample(FreightExample example);

    int insert(Freight record);

    int insertSelective(Freight record);

    List<Freight> selectByExample(FreightExample example);

    int updateByExampleSelective(@Param("record") Freight record, @Param("example") FreightExample example);

    int updateByExample(@Param("record") Freight record, @Param("example") FreightExample example);
}