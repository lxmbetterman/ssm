package com.lxm.controller;

import com.lxm.domain.Account;
import com.lxm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        System.out.println(account);
        accountService.save(account);
        return "保存成功";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll(){
        List<Account> all = accountService.findAll();
        return all;
    }

}
