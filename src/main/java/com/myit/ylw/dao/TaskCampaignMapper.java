package com.myit.ylw.dao;

import com.myit.ylw.pojo.TaskCampaign;
import com.myit.ylw.pojo.TaskCampaignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskCampaignMapper {
    int countByExample(TaskCampaignExample example);

    int deleteByExample(TaskCampaignExample example);

    int insert(TaskCampaign record);

    int insertSelective(TaskCampaign record);

    List<TaskCampaign> selectByExampleWithBLOBs(TaskCampaignExample example);

    List<TaskCampaign> selectByExample(TaskCampaignExample example);

    int updateByExampleSelective(@Param("record") TaskCampaign record, @Param("example") TaskCampaignExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskCampaign record, @Param("example") TaskCampaignExample example);

    int updateByExample(@Param("record") TaskCampaign record, @Param("example") TaskCampaignExample example);
}