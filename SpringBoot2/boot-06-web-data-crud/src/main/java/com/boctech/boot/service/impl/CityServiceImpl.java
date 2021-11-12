package com.boctech.boot.service.impl;

import com.boctech.boot.bean.Account;
import com.boctech.boot.bean.City;
import com.boctech.boot.mapper.AccountMapper;
import com.boctech.boot.mapper.CityMapper;
import com.boctech.boot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 22:10
 * Description:
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    @Resource
    CityMapper cityMapper;


    @Override
    public City getById(Long id) {
        return null;
    }

    @Override
    public void saveCity(City city) {

    }
}
