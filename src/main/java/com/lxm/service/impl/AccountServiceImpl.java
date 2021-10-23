package com.lxm.service.impl;

import com.lxm.domain.Account;
import com.lxm.mapper.AccountMapper;
import com.lxm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> all = accountMapper.findAll();
        System.out.println(all);
        return all;
    }
}
