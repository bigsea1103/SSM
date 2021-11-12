package com.boctech.controller;

import com.boctech.domain.Student;
import com.boctech.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/16- 14:53
 * Description:
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;
    String tips = "注册失败";
    //注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student) {
        ModelAndView mv = new ModelAndView();
        //调用service处理student
        int nums = studentService.addStudent(student);
        if (nums > 0) {
            //注册成功
            tips = "学生[" + student.getName()+"]注册成功";
        }
        //添加数据
        mv.addObject("tips",tips);
        //指定结果页面
        mv.setViewName("result");
        return mv;
    }

    //处理查询，响应ajax
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent() {
        //参数检查，简单的数据处理
        List<Student> students = studentService.findStudents();
        return students;
    }
}
