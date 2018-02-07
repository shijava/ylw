package com.myit.ylw.dao;

import com.myit.ylw.pojo.SurveyResult;
import com.myit.ylw.pojo.SurveyResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyResultMapper {
    int countByExample(SurveyResultExample example);

    int deleteByExample(SurveyResultExample example);

    int insert(SurveyResult record);

    int insertSelective(SurveyResult record);

    List<SurveyResult> selectByExample(SurveyResultExample example);

    int updateByExampleSelective(@Param("record") SurveyResult record, @Param("example") SurveyResultExample example);

    int updateByExample(@Param("record") SurveyResult record, @Param("example") SurveyResultExample example);
}