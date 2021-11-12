package com.boctech.boot.service.impl;


import com.boctech.boot.bean.Account;
import com.boctech.boot.mapper.AccountMapper;
import com.boctech.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 21:21
 * Description:
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Resource   //????
    AccountMapper accountMapper;


    @Override
    public Account getAcctById(Long id) {
        return null;
    }
}
