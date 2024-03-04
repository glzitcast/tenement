package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    //根据用户名查询用户
    User findByUserName(@Param("username") String username);

    //添加
    void add(@Param("username") String username, @Param("password") String password);

    void update(User user);

    void updateAvatar(@Param("avatarUrl") String avatarUrl, @Param("id") Integer id);

    void updatePwd(@Param("md5String") String md5String, Integer id);
}
