package com.boctech.controller;

import com.boctech.controller.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/14- 19:02
 * Description:
 */

@Controller
public class MyController {

    @RequestMapping(value = "/receiveproperty.do")
    public ModelAndView doSome(String name, Integer age) {
       // System.out.println("doSome,name="+name+" age" +age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    /**
     *  请求中参数名和处理器方法的形参名不一致
     *  @RequestParam: 逐个解决请求中参数名和形参名不一致的问题
     *      属性： 1.value请求中的参数名称
     *            2. required 是一个boolean，默认是true
     *            true： 表示请求中必须包含此参数
     *      位置： 在处理器方法的形参定义的位置
     *   用来保证请求域中必须包含某些数据
     * */
    @RequestMapping(value = "/receiveparam.do")
    public ModelAndView receiveParam(
            @RequestParam(value = "rname",required = false) String name,
            @RequestParam(value = "rage",required = false) Integer age) {
        System.out.println("doSome,name="+name+" age" +age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    /**
     *     处理器方法形参是java对象，这个对象和请求中参数名一样的
     *     框架会创建形参java对象，给属性赋值，请求中的参数是name，框架会使用setName()
     * */
    @RequestMapping(value = "/receiveobject.do")
    public ModelAndView receiveParam(Student myStudent) {
        System.out.println("name="+myStudent.getName()+" age" + myStudent.getAge());
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",myStudent.getName());
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("myStudent",myStudent);
        mv.setViewName("show");
        return mv;
    }


}
