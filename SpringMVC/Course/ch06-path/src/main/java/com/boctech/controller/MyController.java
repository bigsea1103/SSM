package com.boctech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/17- 14:12
 * Description:
 */
@Controller
public class MyController {

    @RequestMapping(value = "/user/some.do")
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","好神奇的springMVC学习之旅啊");
        mv.addObject("fun","执行的是doSome方法");
        mv.setViewName("/index.jsp");
        return mv;
    }

}
