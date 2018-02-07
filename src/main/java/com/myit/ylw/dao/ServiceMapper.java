package com.myit.ylw.dao;

import com.myit.ylw.pojo.Service;
import com.myit.ylw.pojo.ServiceExample;
import com.myit.ylw.pojo.ServiceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceMapper {
    int countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int insert(ServiceWithBLOBs record);

    int insertSelective(ServiceWithBLOBs record);

    List<ServiceWithBLOBs> selectByExampleWithBLOBs(ServiceExample example);

    List<Service> selectByExample(ServiceExample example);

    int updateByExampleSelective(@Param("record") ServiceWithBLOBs record, @Param("example") ServiceExample example);

    int updateByExampleWithBLOBs(@Param("record") ServiceWithBLOBs record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);
}