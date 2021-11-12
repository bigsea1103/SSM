package com.boctech.boot.controller;

import com.boctech.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/30- 16:51
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {

        String userName = person.getUserName();
        System.out.println(userName);
        return person;
    }
}
