package com.myit.ylw.dao;

import com.myit.ylw.pojo.DesignWorksPic;
import com.myit.ylw.pojo.DesignWorksPicExample;
import com.myit.ylw.pojo.DesignWorksPicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignWorksPicMapper {
    int countByExample(DesignWorksPicExample example);

    int deleteByExample(DesignWorksPicExample example);

    int insert(DesignWorksPicWithBLOBs record);

    int insertSelective(DesignWorksPicWithBLOBs record);

    List<DesignWorksPicWithBLOBs> selectByExampleWithBLOBs(DesignWorksPicExample example);

    List<DesignWorksPic> selectByExample(DesignWorksPicExample example);

    int updateByExampleSelective(@Param("record") DesignWorksPicWithBLOBs record, @Param("example") DesignWorksPicExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignWorksPicWithBLOBs record, @Param("example") DesignWorksPicExample example);

    int updateByExample(@Param("record") DesignWorksPic record, @Param("example") DesignWorksPicExample example);
}