package com.myit.ylw.dao;

import com.myit.ylw.pojo.GuestBook;
import com.myit.ylw.pojo.GuestBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuestBookMapper {
    int countByExample(GuestBookExample example);

    int deleteByExample(GuestBookExample example);

    int insert(GuestBook record);

    int insertSelective(GuestBook record);

    List<GuestBook> selectByExample(GuestBookExample example);

    int updateByExampleSelective(@Param("record") GuestBook record, @Param("example") GuestBookExample example);

    int updateByExample(@Param("record") GuestBook record, @Param("example") GuestBookExample example);
}