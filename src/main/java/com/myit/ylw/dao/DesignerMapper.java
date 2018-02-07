package com.myit.ylw.dao;

import com.myit.ylw.pojo.Designer;
import com.myit.ylw.pojo.DesignerExample;
import com.myit.ylw.pojo.DesignerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerMapper {
    int countByExample(DesignerExample example);

    int deleteByExample(DesignerExample example);

    int insert(DesignerWithBLOBs record);

    int insertSelective(DesignerWithBLOBs record);

    List<DesignerWithBLOBs> selectByExampleWithBLOBs(DesignerExample example);

    List<Designer> selectByExample(DesignerExample example);

    int updateByExampleSelective(@Param("record") DesignerWithBLOBs record, @Param("example") DesignerExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignerWithBLOBs record, @Param("example") DesignerExample example);

    int updateByExample(@Param("record") Designer record, @Param("example") DesignerExample example);
}