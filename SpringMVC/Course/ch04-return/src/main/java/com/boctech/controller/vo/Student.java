package com.boctech.controller.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/15- 20:19
 * Description:
 */
@Data
@NoArgsConstructor
public class Student {

    //属性名和请求中参数名一致
    private String name;
    private Integer age;

}
