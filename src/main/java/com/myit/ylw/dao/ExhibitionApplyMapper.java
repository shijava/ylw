package com.myit.ylw.dao;

import com.myit.ylw.pojo.ExhibitionApply;
import com.myit.ylw.pojo.ExhibitionApplyExample;
import com.myit.ylw.pojo.ExhibitionApplyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhibitionApplyMapper {
    int countByExample(ExhibitionApplyExample example);

    int deleteByExample(ExhibitionApplyExample example);

    int insert(ExhibitionApplyWithBLOBs record);

    int insertSelective(ExhibitionApplyWithBLOBs record);

    List<ExhibitionApplyWithBLOBs> selectByExampleWithBLOBs(ExhibitionApplyExample example);

    List<ExhibitionApply> selectByExample(ExhibitionApplyExample example);

    int updateByExampleSelective(@Param("record") ExhibitionApplyWithBLOBs record, @Param("example") ExhibitionApplyExample example);

    int updateByExampleWithBLOBs(@Param("record") ExhibitionApplyWithBLOBs record, @Param("example") ExhibitionApplyExample example);

    int updateByExample(@Param("record") ExhibitionApply record, @Param("example") ExhibitionApplyExample example);
}