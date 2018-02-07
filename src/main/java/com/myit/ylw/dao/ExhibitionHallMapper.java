package com.myit.ylw.dao;

import com.myit.ylw.pojo.ExhibitionHall;
import com.myit.ylw.pojo.ExhibitionHallExample;
import com.myit.ylw.pojo.ExhibitionHallWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhibitionHallMapper {
    int countByExample(ExhibitionHallExample example);

    int deleteByExample(ExhibitionHallExample example);

    int insert(ExhibitionHallWithBLOBs record);

    int insertSelective(ExhibitionHallWithBLOBs record);

    List<ExhibitionHallWithBLOBs> selectByExampleWithBLOBs(ExhibitionHallExample example);

    List<ExhibitionHall> selectByExample(ExhibitionHallExample example);

    int updateByExampleSelective(@Param("record") ExhibitionHallWithBLOBs record, @Param("example") ExhibitionHallExample example);

    int updateByExampleWithBLOBs(@Param("record") ExhibitionHallWithBLOBs record, @Param("example") ExhibitionHallExample example);

    int updateByExample(@Param("record") ExhibitionHall record, @Param("example") ExhibitionHallExample example);
}