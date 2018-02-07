package com.myit.ylw.dao;

import com.myit.ylw.pojo.Consult;
import com.myit.ylw.pojo.ConsultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultMapper {
    int countByExample(ConsultExample example);

    int deleteByExample(ConsultExample example);

    int insert(Consult record);

    int insertSelective(Consult record);

    List<Consult> selectByExampleWithBLOBs(ConsultExample example);

    List<Consult> selectByExample(ConsultExample example);

    int updateByExampleSelective(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByExampleWithBLOBs(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByExample(@Param("record") Consult record, @Param("example") ConsultExample example);
}