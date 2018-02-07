package com.myit.ylw.dao;

import com.myit.ylw.pojo.DesignerOrderPic;
import com.myit.ylw.pojo.DesignerOrderPicExample;
import com.myit.ylw.pojo.DesignerOrderPicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerOrderPicMapper {
    int countByExample(DesignerOrderPicExample example);

    int deleteByExample(DesignerOrderPicExample example);

    int insert(DesignerOrderPicWithBLOBs record);

    int insertSelective(DesignerOrderPicWithBLOBs record);

    List<DesignerOrderPicWithBLOBs> selectByExampleWithBLOBs(DesignerOrderPicExample example);

    List<DesignerOrderPic> selectByExample(DesignerOrderPicExample example);

    int updateByExampleSelective(@Param("record") DesignerOrderPicWithBLOBs record, @Param("example") DesignerOrderPicExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignerOrderPicWithBLOBs record, @Param("example") DesignerOrderPicExample example);

    int updateByExample(@Param("record") DesignerOrderPic record, @Param("example") DesignerOrderPicExample example);
}