package com.myit.ylw.dao;

import com.myit.ylw.pojo.FeedBack;
import com.myit.ylw.pojo.FeedBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedBackMapper {
    int countByExample(FeedBackExample example);

    int deleteByExample(FeedBackExample example);

    int insert(FeedBack record);

    int insertSelective(FeedBack record);

    List<FeedBack> selectByExample(FeedBackExample example);

    int updateByExampleSelective(@Param("record") FeedBack record, @Param("example") FeedBackExample example);

    int updateByExample(@Param("record") FeedBack record, @Param("example") FeedBackExample example);
}