package com.myit.ylw.dao;

import com.myit.ylw.pojo.PointProductPic;
import com.myit.ylw.pojo.PointProductPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointProductPicMapper {
    int countByExample(PointProductPicExample example);

    int deleteByExample(PointProductPicExample example);

    int insert(PointProductPic record);

    int insertSelective(PointProductPic record);

    List<PointProductPic> selectByExample(PointProductPicExample example);

    int updateByExampleSelective(@Param("record") PointProductPic record, @Param("example") PointProductPicExample example);

    int updateByExample(@Param("record") PointProductPic record, @Param("example") PointProductPicExample example);
}