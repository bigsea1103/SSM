package com.boctech.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/30- 09:37
 * Description:
 */

@Data
@NoArgsConstructor   //无参构造器
@AllArgsConstructor   //有参构造器
public class Pet {

    private String name;

}
