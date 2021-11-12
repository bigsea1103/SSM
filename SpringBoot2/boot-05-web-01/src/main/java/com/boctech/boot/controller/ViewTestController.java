package com.boctech.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/8- 16:42
 * Description:
 */
@Controller
public class ViewTestController {
    @GetMapping("/zyjk")
    public String zyjk(Model model) {
        //model中的数据都会被放在请求域中 request.setAttribute("a",aa)
        model.addAttribute("msg","你好呀，金科");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
