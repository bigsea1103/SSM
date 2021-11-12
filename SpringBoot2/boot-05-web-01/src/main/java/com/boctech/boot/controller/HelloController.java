package com.boctech.boot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/2- 18:26
 * Description:
 */

@RestController
public class HelloController {
    @RequestMapping("/bug.jpg")
    public String hello() {
        return "aaa";
    }

   // @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser() {
        return "GET-张三";
    }

   // @RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping("/user")
    public String saveUser() {
        return "POST-张三";
    }

   // @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser() {
        return "PUT-张三";
    }

 //   @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    @DeleteMapping("/user")
    public String deleteUser() {
        return "DELETE-张三";
    }


}
