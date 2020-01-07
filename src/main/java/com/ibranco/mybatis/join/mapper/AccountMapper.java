package com.ibranco.mybatis.join.mapper;

import com.ibranco.mybatis.join.domain.Account;
import com.ibranco.mybatis.join.vo.AccountUser;

import java.util.List;

public interface AccountMapper {
    List<Account> findAll();
    List<AccountUser> findAccountUser();
    List<Account> findAU();
    List<Account> findUA();
}
