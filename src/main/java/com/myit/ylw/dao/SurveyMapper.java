package com.myit.ylw.dao;

import com.myit.ylw.pojo.Survey;
import com.myit.ylw.pojo.SurveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyMapper {
    int countByExample(SurveyExample example);

    int deleteByExample(SurveyExample example);

    int insert(Survey record);

    int insertSelective(Survey record);

    List<Survey> selectByExample(SurveyExample example);

    int updateByExampleSelective(@Param("record") Survey record, @Param("example") SurveyExample example);

    int updateByExample(@Param("record") Survey record, @Param("example") SurveyExample example);
}