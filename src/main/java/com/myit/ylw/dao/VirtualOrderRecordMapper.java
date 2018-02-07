package com.myit.ylw.dao;

import com.myit.ylw.pojo.VirtualOrderRecord;
import com.myit.ylw.pojo.VirtualOrderRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VirtualOrderRecordMapper {
    int countByExample(VirtualOrderRecordExample example);

    int deleteByExample(VirtualOrderRecordExample example);

    int insert(VirtualOrderRecord record);

    int insertSelective(VirtualOrderRecord record);

    List<VirtualOrderRecord> selectByExample(VirtualOrderRecordExample example);

    int updateByExampleSelective(@Param("record") VirtualOrderRecord record, @Param("example") VirtualOrderRecordExample example);

    int updateByExample(@Param("record") VirtualOrderRecord record, @Param("example") VirtualOrderRecordExample example);
}