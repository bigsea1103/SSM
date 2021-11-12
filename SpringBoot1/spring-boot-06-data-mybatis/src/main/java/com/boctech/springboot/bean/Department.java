package com.boctech.springboot.bean;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/29- 16:00
 * Description:
 */
public class Department {

    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
