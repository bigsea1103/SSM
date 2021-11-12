package com.boctech.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/26- 14:28
 * Description:
 */
@ResponseBody    //写在这里是表示这个类的所有方法返回的数据直接写给浏览器，如果是对象转为json数据
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick!";
    }

    //RESTAPI的方式

}
