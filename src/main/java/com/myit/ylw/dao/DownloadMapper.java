package com.myit.ylw.dao;

import com.myit.ylw.pojo.Download;
import com.myit.ylw.pojo.DownloadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownloadMapper {
    int countByExample(DownloadExample example);

    int deleteByExample(DownloadExample example);

    int insert(Download record);

    int insertSelective(Download record);

    List<Download> selectByExample(DownloadExample example);

    int updateByExampleSelective(@Param("record") Download record, @Param("example") DownloadExample example);

    int updateByExample(@Param("record") Download record, @Param("example") DownloadExample example);
}