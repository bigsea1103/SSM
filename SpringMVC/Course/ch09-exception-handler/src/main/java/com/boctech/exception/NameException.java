package com.boctech.exception;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/17- 18:03
 * Description:
 */
//表示当用户的姓名有异常，抛出该异常
public class NameException extends MyException {

    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
