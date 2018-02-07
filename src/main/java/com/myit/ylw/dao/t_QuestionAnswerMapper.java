package com.myit.ylw.dao;

import com.myit.ylw.pojo.t_QuestionAnswer;
import com.myit.ylw.pojo.t_QuestionAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_QuestionAnswerMapper {
    int countByExample(t_QuestionAnswerExample example);

    int deleteByExample(t_QuestionAnswerExample example);

    int insert(t_QuestionAnswer record);

    int insertSelective(t_QuestionAnswer record);

    List<t_QuestionAnswer> selectByExample(t_QuestionAnswerExample example);

    int updateByExampleSelective(@Param("record") t_QuestionAnswer record, @Param("example") t_QuestionAnswerExample example);

    int updateByExample(@Param("record") t_QuestionAnswer record, @Param("example") t_QuestionAnswerExample example);
}