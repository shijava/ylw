package com.myit.ylw.dao;

import com.myit.ylw.pojo.DesignerOrderLogs;
import com.myit.ylw.pojo.DesignerOrderLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerOrderLogsMapper {
    int countByExample(DesignerOrderLogsExample example);

    int deleteByExample(DesignerOrderLogsExample example);

    int insert(DesignerOrderLogs record);

    int insertSelective(DesignerOrderLogs record);

    List<DesignerOrderLogs> selectByExample(DesignerOrderLogsExample example);

    int updateByExampleSelective(@Param("record") DesignerOrderLogs record, @Param("example") DesignerOrderLogsExample example);

    int updateByExample(@Param("record") DesignerOrderLogs record, @Param("example") DesignerOrderLogsExample example);
}