package com.boctech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/13- 18:41
 * Description:
 */

/**
 * @RequestMapping:
 *  value : 所有请求地址的公共部分，叫做模块名称
 *  位置：  放在类的上面
 *
 * */

@Controller
@RequestMapping("/user")
public class MyController {

    /**
     *   @RequestMapping： 请求映射
     *     属性：  method ,表示请求的方式，他的值RequestMethod类枚举值
     *     例如表示get/post请求方式，RequestMethod.GET/POST
     *
     * */
    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用功能springMVC做web开发");
        mv.addObject("fun","执行的是doSome方法");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/other.do", method = RequestMethod.POST)
    public ModelAndView doOther() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","====欢迎使用功能springMVC做web开发====");
        mv.addObject("fun","执行的是doOther方法");
        mv.setViewName("other");
        return mv;
    }

    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(HttpServletRequest request,
                                HttpServletResponse response,
                                HttpSession session) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","====欢迎使用功能springMVC做web开发====" + request.getParameter("name"));
        mv.addObject("fun","执行的是doFirst方法");
        mv.setViewName("other");
        return mv;
    }

}
