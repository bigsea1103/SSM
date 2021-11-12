package com.boctech.exception;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/17- 18:04
 * Description:
 */
//当年龄有问题时，抛出的异常
public class AgeException extends MyException {

    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
