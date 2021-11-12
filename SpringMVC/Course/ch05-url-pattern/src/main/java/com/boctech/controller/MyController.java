package com.boctech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/17- 12:04
 * Description:
 */
@Controller
public class MyController {

    @RequestMapping(value = "/some")
    public ModelAndView doReturnView(String name, Integer age) {
       // System.out.println("doSome name"+name+",age"+age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

}
