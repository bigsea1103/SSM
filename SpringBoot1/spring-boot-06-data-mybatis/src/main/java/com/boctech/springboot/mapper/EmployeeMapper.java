package com.boctech.springboot.mapper;

import com.boctech.springboot.bean.Employee;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/29- 16:43
 * Description:
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer ig);

    public void insertEmp(Employee employee);
}
