package com.myit.ylw.dao;

import com.myit.ylw.pojo.KeywordSearchHistory;
import com.myit.ylw.pojo.KeywordSearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordSearchHistoryMapper {
    int countByExample(KeywordSearchHistoryExample example);

    int deleteByExample(KeywordSearchHistoryExample example);

    int insert(KeywordSearchHistory record);

    int insertSelective(KeywordSearchHistory record);

    List<KeywordSearchHistory> selectByExample(KeywordSearchHistoryExample example);

    int updateByExampleSelective(@Param("record") KeywordSearchHistory record, @Param("example") KeywordSearchHistoryExample example);

    int updateByExample(@Param("record") KeywordSearchHistory record, @Param("example") KeywordSearchHistoryExample example);
}