package com.myit.ylw.dao;

import com.myit.ylw.pojo.PayOrderRecord;
import com.myit.ylw.pojo.PayOrderRecordExample;
import com.myit.ylw.pojo.PayOrderRecordWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayOrderRecordMapper {
    int countByExample(PayOrderRecordExample example);

    int deleteByExample(PayOrderRecordExample example);

    int insert(PayOrderRecordWithBLOBs record);

    int insertSelective(PayOrderRecordWithBLOBs record);

    List<PayOrderRecordWithBLOBs> selectByExampleWithBLOBs(PayOrderRecordExample example);

    List<PayOrderRecord> selectByExample(PayOrderRecordExample example);

    int updateByExampleSelective(@Param("record") PayOrderRecordWithBLOBs record, @Param("example") PayOrderRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") PayOrderRecordWithBLOBs record, @Param("example") PayOrderRecordExample example);

    int updateByExample(@Param("record") PayOrderRecord record, @Param("example") PayOrderRecordExample example);
}