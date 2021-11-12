package com.boctech.springboot.controller;

import com.boctech.springboot.bean.Department;
import com.boctech.springboot.bean.Employee;
import com.boctech.springboot.mapper.DepartmentMapper;
import com.boctech.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/29- 16:12
 * Description:
 */
@RestController
public class DeptController {

    @Resource
    //@Autowired
    DepartmentMapper departmentMapper;

    @Resource
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department) {
        return department;
    }

    @GetMapping("/dept/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

}
