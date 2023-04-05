package com.oop.Extends;

//在Java中，所有的类，都默认直接或者间接继承objec类
// Person 人 :父类
public class Person /*extends object*/ {
    public Person() {
        System.out.println("Person无参执行了");
    }

    protected String name = "wzy";

    //私有的东西无法被继承
    public void print(){
          System.out.println("Person");
    }

}
