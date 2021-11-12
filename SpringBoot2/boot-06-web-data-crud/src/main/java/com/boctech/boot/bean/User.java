package com.boctech.boot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 12:21
 * Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    //所有属性都应该在数据库中
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
