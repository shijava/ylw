package com.myit.ylw.dao;

import com.myit.ylw.pojo.PayMargin;
import com.myit.ylw.pojo.PayMarginExample;
import com.myit.ylw.pojo.PayMarginWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayMarginMapper {
    int countByExample(PayMarginExample example);

    int deleteByExample(PayMarginExample example);

    int insert(PayMarginWithBLOBs record);

    int insertSelective(PayMarginWithBLOBs record);

    List<PayMarginWithBLOBs> selectByExampleWithBLOBs(PayMarginExample example);

    List<PayMargin> selectByExample(PayMarginExample example);

    int updateByExampleSelective(@Param("record") PayMarginWithBLOBs record, @Param("example") PayMarginExample example);

    int updateByExampleWithBLOBs(@Param("record") PayMarginWithBLOBs record, @Param("example") PayMarginExample example);

    int updateByExample(@Param("record") PayMargin record, @Param("example") PayMarginExample example);
}