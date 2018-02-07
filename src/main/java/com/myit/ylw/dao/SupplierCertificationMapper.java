package com.myit.ylw.dao;

import com.myit.ylw.pojo.SupplierCertification;
import com.myit.ylw.pojo.SupplierCertificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierCertificationMapper {
    int countByExample(SupplierCertificationExample example);

    int deleteByExample(SupplierCertificationExample example);

    int insert(SupplierCertification record);

    int insertSelective(SupplierCertification record);

    List<SupplierCertification> selectByExample(SupplierCertificationExample example);

    int updateByExampleSelective(@Param("record") SupplierCertification record, @Param("example") SupplierCertificationExample example);

    int updateByExample(@Param("record") SupplierCertification record, @Param("example") SupplierCertificationExample example);
}