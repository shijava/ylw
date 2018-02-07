package com.myit.ylw.dao;

import com.myit.ylw.pojo.DesignWorks;
import com.myit.ylw.pojo.DesignWorksExample;
import com.myit.ylw.pojo.DesignWorksWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignWorksMapper {
    int countByExample(DesignWorksExample example);

    int deleteByExample(DesignWorksExample example);

    int insert(DesignWorksWithBLOBs record);

    int insertSelective(DesignWorksWithBLOBs record);

    List<DesignWorksWithBLOBs> selectByExampleWithBLOBs(DesignWorksExample example);

    List<DesignWorks> selectByExample(DesignWorksExample example);

    int updateByExampleSelective(@Param("record") DesignWorksWithBLOBs record, @Param("example") DesignWorksExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignWorksWithBLOBs record, @Param("example") DesignWorksExample example);

    int updateByExample(@Param("record") DesignWorks record, @Param("example") DesignWorksExample example);
}