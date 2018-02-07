package com.myit.ylw.dao;

import com.myit.ylw.pojo.TaskCampaignDesign;
import com.myit.ylw.pojo.TaskCampaignDesignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskCampaignDesignMapper {
    int countByExample(TaskCampaignDesignExample example);

    int deleteByExample(TaskCampaignDesignExample example);

    int insert(TaskCampaignDesign record);

    int insertSelective(TaskCampaignDesign record);

    List<TaskCampaignDesign> selectByExample(TaskCampaignDesignExample example);

    int updateByExampleSelective(@Param("record") TaskCampaignDesign record, @Param("example") TaskCampaignDesignExample example);

    int updateByExample(@Param("record") TaskCampaignDesign record, @Param("example") TaskCampaignDesignExample example);
}