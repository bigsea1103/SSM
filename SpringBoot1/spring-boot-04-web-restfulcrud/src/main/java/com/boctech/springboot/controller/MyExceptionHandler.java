package com.boctech.springboot.controller;

import com.boctech.springboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/28- 19:34
 * Description:
 */
@ControllerAdvice
public class MyExceptionHandler {

    //浏览器客户端返回的都是json
//    @ResponseBody
//    @ExceptionHandler(UserNotExistException.class)
//    public Map<String,Object> handleException(Exception e) {
//        Map<String,Object> map = new HashMap<>();
//        map.put("code","user.NotExist");
//        map.put("message",e.getMessage());
//        return map;
//    }

    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //传入我们自己的错误状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user.NotExist");
        map.put("message", e.getMessage());

        request.setAttribute("ext", map);
        //转发到/error
        return "forward:/error";
    }
}
