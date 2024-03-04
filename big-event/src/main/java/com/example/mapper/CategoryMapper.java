package com.example.mapper;

import com.example.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    //新增
    void add(Category category);

    //查询所有
    List<Category> list(Integer userId);

    //根据id查询
    Category findById(Integer id);

    //更新
    void update(Category category);

    void delete(Integer id);
}
