package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

public interface UserMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();
}
