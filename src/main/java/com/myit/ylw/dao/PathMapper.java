package com.myit.ylw.dao;

import com.myit.ylw.pojo.Path;
import com.myit.ylw.pojo.PathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathMapper {
    int countByExample(PathExample example);

    int deleteByExample(PathExample example);

    int insert(Path record);

    int insertSelective(Path record);

    List<Path> selectByExample(PathExample example);

    int updateByExampleSelective(@Param("record") Path record, @Param("example") PathExample example);

    int updateByExample(@Param("record") Path record, @Param("example") PathExample example);
}