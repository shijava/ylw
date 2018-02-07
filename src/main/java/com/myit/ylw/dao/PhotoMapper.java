package com.myit.ylw.dao;

import com.myit.ylw.pojo.Photo;
import com.myit.ylw.pojo.PhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoMapper {
    int countByExample(PhotoExample example);

    int deleteByExample(PhotoExample example);

    int insert(Photo record);

    int insertSelective(Photo record);

    List<Photo> selectByExample(PhotoExample example);

    int updateByExampleSelective(@Param("record") Photo record, @Param("example") PhotoExample example);

    int updateByExample(@Param("record") Photo record, @Param("example") PhotoExample example);
}