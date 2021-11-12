package com.boctech.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/30- 16:13
 * Description:
 */

@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String,Object> score;
    private Set<Double> salary;
    private Map<String, List<Pet>> allPets;
}
