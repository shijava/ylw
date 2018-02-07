package com.myit.ylw.dao;

import com.myit.ylw.pojo.DesignerOrder;
import com.myit.ylw.pojo.DesignerOrderExample;
import com.myit.ylw.pojo.DesignerOrderWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerOrderMapper {
    int countByExample(DesignerOrderExample example);

    int deleteByExample(DesignerOrderExample example);

    int insert(DesignerOrderWithBLOBs record);

    int insertSelective(DesignerOrderWithBLOBs record);

    List<DesignerOrderWithBLOBs> selectByExampleWithBLOBs(DesignerOrderExample example);

    List<DesignerOrder> selectByExample(DesignerOrderExample example);

    int updateByExampleSelective(@Param("record") DesignerOrderWithBLOBs record, @Param("example") DesignerOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignerOrderWithBLOBs record, @Param("example") DesignerOrderExample example);

    int updateByExample(@Param("record") DesignerOrder record, @Param("example") DesignerOrderExample example);
}