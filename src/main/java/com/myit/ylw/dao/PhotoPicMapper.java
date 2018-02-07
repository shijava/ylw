package com.myit.ylw.dao;

import com.myit.ylw.pojo.PhotoPic;
import com.myit.ylw.pojo.PhotoPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoPicMapper {
    int countByExample(PhotoPicExample example);

    int deleteByExample(PhotoPicExample example);

    int insert(PhotoPic record);

    int insertSelective(PhotoPic record);

    List<PhotoPic> selectByExample(PhotoPicExample example);

    int updateByExampleSelective(@Param("record") PhotoPic record, @Param("example") PhotoPicExample example);

    int updateByExample(@Param("record") PhotoPic record, @Param("example") PhotoPicExample example);
}