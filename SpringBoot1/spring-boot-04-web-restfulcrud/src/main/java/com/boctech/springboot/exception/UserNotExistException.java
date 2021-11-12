package com.boctech.springboot.exception;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/28- 19:18
 * Description:
 */

public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
