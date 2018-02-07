package com.myit.ylw.dao;

import com.myit.ylw.pojo.PayOrderRecordInvoice;
import com.myit.ylw.pojo.PayOrderRecordInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayOrderRecordInvoiceMapper {
    int countByExample(PayOrderRecordInvoiceExample example);

    int deleteByExample(PayOrderRecordInvoiceExample example);

    int insert(PayOrderRecordInvoice record);

    int insertSelective(PayOrderRecordInvoice record);

    List<PayOrderRecordInvoice> selectByExample(PayOrderRecordInvoiceExample example);

    int updateByExampleSelective(@Param("record") PayOrderRecordInvoice record, @Param("example") PayOrderRecordInvoiceExample example);

    int updateByExample(@Param("record") PayOrderRecordInvoice record, @Param("example") PayOrderRecordInvoiceExample example);
}