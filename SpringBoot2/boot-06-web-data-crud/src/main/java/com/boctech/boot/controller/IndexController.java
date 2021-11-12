package com.boctech.boot.controller;

import com.boctech.boot.bean.Account;
import com.boctech.boot.bean.City;
import com.boctech.boot.bean.User;
import com.boctech.boot.service.AccountService;
import com.boctech.boot.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 12:23
 * Description:
 */
@Slf4j
@Controller
public class IndexController {

    //@Autowired
    @Resource
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;

    @ResponseBody
    @PostMapping("/city")
    public City saveCity(City city) {
        cityService.saveCity(city);
        return city;
    }

    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
        return cityService.getById(id);
    }

    @ResponseBody
    @GetMapping("/acct")
    public Account getById(@RequestParam("id") Long id){
        return accountService.getAcctById(id);
    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from account_tb1", Long.class);
        return aLong.toString();
    }

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
    public String mainPage(HttpSession session, Model model) {
        return "main";
    }
}

