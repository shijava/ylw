package com.myit.ylw.dao;

import com.myit.ylw.pojo.PayConfig;
import com.myit.ylw.pojo.PayConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayConfigMapper {
    int countByExample(PayConfigExample example);

    int deleteByExample(PayConfigExample example);

    int insert(PayConfig record);

    int insertSelective(PayConfig record);

    List<PayConfig> selectByExample(PayConfigExample example);

    int updateByExampleSelective(@Param("record") PayConfig record, @Param("example") PayConfigExample example);

    int updateByExample(@Param("record") PayConfig record, @Param("example") PayConfigExample example);
}