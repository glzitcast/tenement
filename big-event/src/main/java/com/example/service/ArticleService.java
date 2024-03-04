package com.example.service;

import com.example.pojo.Article;
import com.example.pojo.PageBean;

import java.util.List;

public interface ArticleService {

    //新增文章
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);

    //获取文章分类详情
    Article detail(Integer id);

    //根据id删除文章
    void delete(Integer id);

    //根据id更新文章
    void update(Article article);
}
