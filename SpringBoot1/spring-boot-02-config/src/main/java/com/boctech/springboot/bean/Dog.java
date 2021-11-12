package com.boctech.springboot.bean;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/26- 15:21
 * Description:
 */
public class Dog {

    private String lastName;
    private Integer age;

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
