package com.example.mapper;

import com.example.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {

    //新增
    void add(Article article);

    List<Article> list(@Param("userId") Integer userId, @Param("categoryId") Integer categoryId,
                       @Param("state") String state);

    Article detail(Integer id);

    void delete(Integer id);

    void update(Article article);
}
