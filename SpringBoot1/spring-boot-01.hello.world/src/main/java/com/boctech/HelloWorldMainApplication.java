package com.boctech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/26- 12:06
 * Description:
 */
//@SpringBootApplication 来标注这是一个主程序类
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
