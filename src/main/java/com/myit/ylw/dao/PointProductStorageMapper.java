package com.myit.ylw.dao;

import com.myit.ylw.pojo.PointProductStorage;
import com.myit.ylw.pojo.PointProductStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointProductStorageMapper {
    int countByExample(PointProductStorageExample example);

    int deleteByExample(PointProductStorageExample example);

    int insert(PointProductStorage record);

    int insertSelective(PointProductStorage record);

    List<PointProductStorage> selectByExample(PointProductStorageExample example);

    int updateByExampleSelective(@Param("record") PointProductStorage record, @Param("example") PointProductStorageExample example);

    int updateByExample(@Param("record") PointProductStorage record, @Param("example") PointProductStorageExample example);
}