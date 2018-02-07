package com.myit.ylw.dao;

import com.myit.ylw.pojo.StoreCategory;
import com.myit.ylw.pojo.StoreCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreCategoryMapper {
    int countByExample(StoreCategoryExample example);

    int deleteByExample(StoreCategoryExample example);

    int insert(StoreCategory record);

    int insertSelective(StoreCategory record);

    List<StoreCategory> selectByExampleWithBLOBs(StoreCategoryExample example);

    List<StoreCategory> selectByExample(StoreCategoryExample example);

    int updateByExampleSelective(@Param("record") StoreCategory record, @Param("example") StoreCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") StoreCategory record, @Param("example") StoreCategoryExample example);

    int updateByExample(@Param("record") StoreCategory record, @Param("example") StoreCategoryExample example);
}