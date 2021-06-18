package com.example.AlarmNoteBook.exception;

//自定义异常，便于统一处理
public class MyException extends RuntimeException {
    public MyException(Throwable t) {
        super(t);
    }

    public MyException(){}
}
