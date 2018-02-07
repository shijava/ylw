package com.myit.ylw.dao;

import com.myit.ylw.pojo.SurveyItem;
import com.myit.ylw.pojo.SurveyItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyItemMapper {
    int countByExample(SurveyItemExample example);

    int deleteByExample(SurveyItemExample example);

    int insert(SurveyItem record);

    int insertSelective(SurveyItem record);

    List<SurveyItem> selectByExample(SurveyItemExample example);

    int updateByExampleSelective(@Param("record") SurveyItem record, @Param("example") SurveyItemExample example);

    int updateByExample(@Param("record") SurveyItem record, @Param("example") SurveyItemExample example);
}