package com.boctech.boot.service;

import com.boctech.boot.bean.City;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/11- 18:51
 * Description:
 */
public interface CityService {

    City getById(Long id);

    void saveCity(City city);
}
