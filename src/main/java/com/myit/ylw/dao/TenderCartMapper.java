package com.myit.ylw.dao;

import com.myit.ylw.pojo.TenderCart;
import com.myit.ylw.pojo.TenderCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenderCartMapper {
    int countByExample(TenderCartExample example);

    int deleteByExample(TenderCartExample example);

    int insert(TenderCart record);

    int insertSelective(TenderCart record);

    List<TenderCart> selectByExample(TenderCartExample example);

    int updateByExampleSelective(@Param("record") TenderCart record, @Param("example") TenderCartExample example);

    int updateByExample(@Param("record") TenderCart record, @Param("example") TenderCartExample example);
}