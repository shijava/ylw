package com.myit.ylw.dao;

import com.myit.ylw.pojo.DesignTask;
import com.myit.ylw.pojo.DesignTaskExample;
import com.myit.ylw.pojo.DesignTaskWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignTaskMapper {
    int countByExample(DesignTaskExample example);

    int deleteByExample(DesignTaskExample example);

    int insert(DesignTaskWithBLOBs record);

    int insertSelective(DesignTaskWithBLOBs record);

    List<DesignTaskWithBLOBs> selectByExampleWithBLOBs(DesignTaskExample example);

    List<DesignTask> selectByExample(DesignTaskExample example);

    int updateByExampleSelective(@Param("record") DesignTaskWithBLOBs record, @Param("example") DesignTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignTaskWithBLOBs record, @Param("example") DesignTaskExample example);

    int updateByExample(@Param("record") DesignTask record, @Param("example") DesignTaskExample example);
}