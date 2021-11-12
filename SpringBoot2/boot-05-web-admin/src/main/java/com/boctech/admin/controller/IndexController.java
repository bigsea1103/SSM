package com.boctech.admin.controller;

import com.boctech.admin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/9- 09:08
 * Description:
 */
@Slf4j
@Controller
public class IndexController {

    @GetMapping(value = {"/","/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if(StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())){
            //将登录成功的用户保存起来
            session.setAttribute("loginUser",user);
            //防止重复提交  重定向解决
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg","账号密码输入错误!");
            return "login";
        }
    }

    //去main页面
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model) {
       // log.info("当前方式是：{}","mainPage");
        //是否登录  拦截器，过滤器机制
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null) {
//            return "main";
//        } else {
//            model.addAttribute("msg","请重新登录!");
//            return "login";
//        }

        return "main";
    }
}
