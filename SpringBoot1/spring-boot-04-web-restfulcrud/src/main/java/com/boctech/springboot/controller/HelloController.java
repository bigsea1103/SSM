package com.boctech.springboot.controller;

import com.boctech.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/27- 10:43
 * Description:
 */
@Controller
public class HelloController {
//    @RequestMapping({"/","/index.html"})
//    public String index() {
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        if ("aaa".equals(user)) {
            throw new UserNotExistException();
        }
        return "Hello World!";
    }

    //查出一些数据，在页面显示
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好呀</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        //classpath:/templates/success.html
        return "success";
    }

}
