package com.boctech.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/30- 09:37
 * Description:
 */
@Data
@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

}
