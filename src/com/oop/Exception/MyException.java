package com.oop.Exception;

public class MyException extends Exception{
    //传递数字>10
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    //toString:异常的打印信息

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
