package com.oop.ReturnClassName;

public class CatApplication {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.UseCat(c);//传入的形参是Cat类的对象，进一步使用操作类

        Cat c2 = co.getCat();//调用的结果返回的是Cat类，所以c2是Cat类的对象
        c2.eat();//调用Cat类的方法
    }
}
