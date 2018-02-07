package com.myit.ylw.dao;

import com.myit.ylw.pojo.Tender;
import com.myit.ylw.pojo.TenderExample;
import com.myit.ylw.pojo.TenderWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenderMapper {
    int countByExample(TenderExample example);

    int deleteByExample(TenderExample example);

    int insert(TenderWithBLOBs record);

    int insertSelective(TenderWithBLOBs record);

    List<TenderWithBLOBs> selectByExampleWithBLOBs(TenderExample example);

    List<Tender> selectByExample(TenderExample example);

    int updateByExampleSelective(@Param("record") TenderWithBLOBs record, @Param("example") TenderExample example);

    int updateByExampleWithBLOBs(@Param("record") TenderWithBLOBs record, @Param("example") TenderExample example);

    int updateByExample(@Param("record") Tender record, @Param("example") TenderExample example);
}