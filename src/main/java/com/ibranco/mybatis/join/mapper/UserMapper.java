package com.ibranco.mybatis.join.mapper;

import com.ibranco.mybatis.join.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    List<User> findByContent(User user);
    List<User> findByContent1(User user);
}
