package com.oop.Extends;

//继承
public class A extends B{
    public static void test(){
        System.out.println("A>=");
    }

    //override 重写
    @Override //注解：有功能的注释
    public void text() {
        System.out.println("A=>");
    }
}
