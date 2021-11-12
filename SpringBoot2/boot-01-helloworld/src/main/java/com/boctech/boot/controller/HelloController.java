package com.boctech.boot.controller;

import com.boctech.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/29- 20:13
 * Description:
 */
@Slf4j
@RestController
@SuppressWarnings("all")
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car2")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name) {
        log.info("请求进来了");
        return "Hello "+name+",欢迎学习Springboot2!";
    }

}
