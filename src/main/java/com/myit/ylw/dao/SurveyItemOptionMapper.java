package com.myit.ylw.dao;

import com.myit.ylw.pojo.SurveyItemOption;
import com.myit.ylw.pojo.SurveyItemOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyItemOptionMapper {
    int countByExample(SurveyItemOptionExample example);

    int deleteByExample(SurveyItemOptionExample example);

    int insert(SurveyItemOption record);

    int insertSelective(SurveyItemOption record);

    List<SurveyItemOption> selectByExample(SurveyItemOptionExample example);

    int updateByExampleSelective(@Param("record") SurveyItemOption record, @Param("example") SurveyItemOptionExample example);

    int updateByExample(@Param("record") SurveyItemOption record, @Param("example") SurveyItemOptionExample example);
}