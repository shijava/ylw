package com.myit.ylw.dao;

import com.myit.ylw.pojo.FeaturesGiftsArea;
import com.myit.ylw.pojo.FeaturesGiftsAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeaturesGiftsAreaMapper {
    int countByExample(FeaturesGiftsAreaExample example);

    int deleteByExample(FeaturesGiftsAreaExample example);

    int insert(FeaturesGiftsArea record);

    int insertSelective(FeaturesGiftsArea record);

    List<FeaturesGiftsArea> selectByExample(FeaturesGiftsAreaExample example);

    int updateByExampleSelective(@Param("record") FeaturesGiftsArea record, @Param("example") FeaturesGiftsAreaExample example);

    int updateByExample(@Param("record") FeaturesGiftsArea record, @Param("example") FeaturesGiftsAreaExample example);
}