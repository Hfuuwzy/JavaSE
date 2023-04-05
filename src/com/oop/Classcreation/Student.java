package com.oop.Classcreation;

public class Student {
    //一个类只能包含以下两方面
    //属性： 字段
    String name;  //null  默认值
    int age;      //0   默认值

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }
}
