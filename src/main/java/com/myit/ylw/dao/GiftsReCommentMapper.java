package com.myit.ylw.dao;

import com.myit.ylw.pojo.GiftsReComment;
import com.myit.ylw.pojo.GiftsReCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftsReCommentMapper {
    int countByExample(GiftsReCommentExample example);

    int deleteByExample(GiftsReCommentExample example);

    int insert(GiftsReComment record);

    int insertSelective(GiftsReComment record);

    List<GiftsReComment> selectByExample(GiftsReCommentExample example);

    int updateByExampleSelective(@Param("record") GiftsReComment record, @Param("example") GiftsReCommentExample example);

    int updateByExample(@Param("record") GiftsReComment record, @Param("example") GiftsReCommentExample example);
}