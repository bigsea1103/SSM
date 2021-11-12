package com.boctech.controller;

import com.boctech.exception.AgeException;
import com.boctech.exception.MyException;
import com.boctech.exception.NameException;
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

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name,Integer age) throws MyException {
        ModelAndView mv = new ModelAndView();

        //根据请求参数抛出异常
        if(!"zs".equals(name)) {
            throw new NameException("姓名不正确!!!");
        }
        if(age == null || age >80 ) {
            throw new AgeException("年龄比较大！！！");
        }

        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

}
