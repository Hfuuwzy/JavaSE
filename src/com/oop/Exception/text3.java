package com.oop.Exception;

public class text3 {

    //可能会存在异常的方法
    static void text1(int a) throws MyException {
        System.out.println("传递的参数为:"+a);

        if(a>10){
            throw new MyException(a);  //抛出异常
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            text1(11);
        } catch (MyException e) {
            System.out.println("MyException=>"+e);
        }

    }




}
