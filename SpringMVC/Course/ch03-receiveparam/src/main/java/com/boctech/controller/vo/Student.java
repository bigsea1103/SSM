package com.boctech.controller.vo;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/15- 13:26
 * Description:
 */
//保存请求参数值的一个普通类
public class Student {

    //属性名和请求中参数名一致
    private String name;
    private Integer age;

    public Student() {
        System.out.println("====Student的无参构造方法====");
    }

    public void setName(String name) {
        System.out.println("setName"+name);
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println("setAge"+age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
