package com.myit.ylw.dao;

import com.myit.ylw.pojo.Link;
import com.myit.ylw.pojo.LinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkMapper {
    int countByExample(LinkExample example);

    int deleteByExample(LinkExample example);

    int insert(Link record);

    int insertSelective(Link record);

    List<Link> selectByExample(LinkExample example);

    int updateByExampleSelective(@Param("record") Link record, @Param("example") LinkExample example);

    int updateByExample(@Param("record") Link record, @Param("example") LinkExample example);
}