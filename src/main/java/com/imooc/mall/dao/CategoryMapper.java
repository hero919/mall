package com.imooc.mall.dao;

import com.imooc.mall.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

// Mapper can be replaced using mapper scan
//@Mapper
public interface CategoryMapper {
    @Select("SELECT * FROM mall_category where id=#{id}")
    Category findById(@Param("id") Integer id);

    Category queryById(@Param("id") Integer id);


}


