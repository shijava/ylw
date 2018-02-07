package com.myit.ylw.dao;

import com.myit.ylw.pojo.PayAccountChangeRecord;
import com.myit.ylw.pojo.PayAccountChangeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayAccountChangeRecordMapper {
    int countByExample(PayAccountChangeRecordExample example);

    int deleteByExample(PayAccountChangeRecordExample example);

    int insert(PayAccountChangeRecord record);

    int insertSelective(PayAccountChangeRecord record);

    List<PayAccountChangeRecord> selectByExample(PayAccountChangeRecordExample example);

    int updateByExampleSelective(@Param("record") PayAccountChangeRecord record, @Param("example") PayAccountChangeRecordExample example);

    int updateByExample(@Param("record") PayAccountChangeRecord record, @Param("example") PayAccountChangeRecordExample example);
}