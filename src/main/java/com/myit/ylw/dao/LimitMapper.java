package com.myit.ylw.dao;

import com.myit.ylw.pojo.Limit;
import com.myit.ylw.pojo.LimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimitMapper {
    int countByExample(LimitExample example);

    int deleteByExample(LimitExample example);

    int insert(Limit record);

    int insertSelective(Limit record);

    List<Limit> selectByExample(LimitExample example);

    int updateByExampleSelective(@Param("record") Limit record, @Param("example") LimitExample example);

    int updateByExample(@Param("record") Limit record, @Param("example") LimitExample example);
}