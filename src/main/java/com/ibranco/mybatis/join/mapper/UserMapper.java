package com.ibranco.mybatis.join.mapper;

import com.ibranco.mybatis.join.domain.User;
import com.ibranco.mybatis.join.vo.UserRole;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    List<UserRole> findAllUserRole();
    List<User> findByContent(User user);
    List<User> findByContent1(User user);
    List<User> findUserAndRole();

    /**
     * 查询所有用户信息以及所有的帐户列表
     * @return
     */
    List<User> findUser();
}
