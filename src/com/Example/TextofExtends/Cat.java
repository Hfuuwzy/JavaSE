package com.Example.TextofExtends;

public class Cat extends Animals{

    public Cat() {
    }//可以不写，默认存在

    public Cat(String name, int age) {
        super(name, age);
    }//若使用有参构造方法，则必须要写，同时把无参构造也要写出来

    public void carry(){
        System.out.println("猫捉老鼠");

    }
}
