package com.oop.ReturnClassName;

public class Dog extends Animal{//用子类重写父类方法来实现
    @Override
    public void eat() {
        System.out.println("狗看门");
    }
}
