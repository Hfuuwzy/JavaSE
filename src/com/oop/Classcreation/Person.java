package com.oop.Classcreation;

public class Person {
    //通过new关键词去调用构造方法
    //一个类即使什么都不写，它也会存在一个方法
    //显示的定义一个构造器
    String name;
    int age;
    //(fn) + alt +insert
    //1.使用new关键字，本质是在调用构造器
    //2。用来初始化值；
    public Person() {
        this.name = "xiaomei";
    }



    //有参构造:一旦定义了有参构造，无参构造就必须显示定义；
    //这也是方法重载；
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
}