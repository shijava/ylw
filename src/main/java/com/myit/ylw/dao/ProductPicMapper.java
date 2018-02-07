package com.myit.ylw.dao;

import com.myit.ylw.pojo.ProductPic;
import com.myit.ylw.pojo.ProductPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductPicMapper {
    int countByExample(ProductPicExample example);

    int deleteByExample(ProductPicExample example);

    int insert(ProductPic record);

    int insertSelective(ProductPic record);

    List<ProductPic> selectByExample(ProductPicExample example);

    int updateByExampleSelective(@Param("record") ProductPic record, @Param("example") ProductPicExample example);

    int updateByExample(@Param("record") ProductPic record, @Param("example") ProductPicExample example);
}