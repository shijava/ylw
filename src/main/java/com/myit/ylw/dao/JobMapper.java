package com.myit.ylw.dao;

import com.myit.ylw.pojo.Job;
import com.myit.ylw.pojo.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    int countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);
}