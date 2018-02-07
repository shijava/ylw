package com.myit.ylw.dao;

import com.myit.ylw.pojo.Dictionary;
import com.myit.ylw.pojo.DictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {
    int countByExample(DictionaryExample example);

    int deleteByExample(DictionaryExample example);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectByExampleWithBLOBs(DictionaryExample example);

    List<Dictionary> selectByExample(DictionaryExample example);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByExampleWithBLOBs(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);
}