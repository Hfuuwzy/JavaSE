package com.oop.AbsrtactClass;

//抽象类的所有方法，继承了它的 子类 ，都必须要实现它的方法~除非子类也是抽象类
//子类必须实现所有的父类抽象方法，否则也要注明abstract
public class A extends Action{
    @Override
    public void Run() {
        System.out.println("woshi");
    }



}
