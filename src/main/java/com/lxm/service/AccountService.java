package com.lxm.service;

import com.lxm.domain.Account;

import java.util.List;

public interface AccountService {
    public void save(Account account);
    public List<Account> findAll();
}
