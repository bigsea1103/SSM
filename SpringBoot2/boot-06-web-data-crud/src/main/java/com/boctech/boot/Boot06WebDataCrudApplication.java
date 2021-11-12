package com.boctech.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.boctech.boot.mapper")
@SpringBootApplication
public class Boot06WebDataCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot06WebDataCrudApplication.class, args);
    }

}
