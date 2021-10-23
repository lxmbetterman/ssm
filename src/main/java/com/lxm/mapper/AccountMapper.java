package com.lxm.mapper;

import com.lxm.domain.Account;

import java.util.List;

public interface AccountMapper {
    public void save(Account account);
    List<Account> findAll();
}
