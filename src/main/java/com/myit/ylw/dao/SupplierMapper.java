package com.myit.ylw.dao;

import com.myit.ylw.pojo.Supplier;
import com.myit.ylw.pojo.SupplierExample;
import com.myit.ylw.pojo.SupplierWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int insert(SupplierWithBLOBs record);

    int insertSelective(SupplierWithBLOBs record);

    List<SupplierWithBLOBs> selectByExampleWithBLOBs(SupplierExample example);

    List<Supplier> selectByExample(SupplierExample example);

    int updateByExampleSelective(@Param("record") SupplierWithBLOBs record, @Param("example") SupplierExample example);

    int updateByExampleWithBLOBs(@Param("record") SupplierWithBLOBs record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);
}