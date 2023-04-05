package com.oop.Static;
//static
public class Student {
    private static int age;//静态的变量   多线程！
    private double score;//非静态的变量
    public void run(){
        System.out.println("run");
    }
    public static void go (){
        System.out.println("go");

    }

    public static void main(String[] args) {
        go();
        new Student().run();
    }



}
