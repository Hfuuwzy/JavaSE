package com.oop.WAY;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

        Demo01.change(a);//调用Demo01类的方法

        System.out.println(a);


    }

    public static void change(int a){
        a = 10;
    }

}
