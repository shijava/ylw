package com.myit.ylw.dao;

import com.myit.ylw.pojo.ExhibitionPosition;
import com.myit.ylw.pojo.ExhibitionPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhibitionPositionMapper {
    int countByExample(ExhibitionPositionExample example);

    int deleteByExample(ExhibitionPositionExample example);

    int insert(ExhibitionPosition record);

    int insertSelective(ExhibitionPosition record);

    List<ExhibitionPosition> selectByExampleWithBLOBs(ExhibitionPositionExample example);

    List<ExhibitionPosition> selectByExample(ExhibitionPositionExample example);

    int updateByExampleSelective(@Param("record") ExhibitionPosition record, @Param("example") ExhibitionPositionExample example);

    int updateByExampleWithBLOBs(@Param("record") ExhibitionPosition record, @Param("example") ExhibitionPositionExample example);

    int updateByExample(@Param("record") ExhibitionPosition record, @Param("example") ExhibitionPositionExample example);
}