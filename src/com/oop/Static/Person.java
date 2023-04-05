package com.oop.Static;

public class Person {
    //2: 赋初值~
    {
        System.out.println("匿名代码块");
    }
    // 1:  只执行一次   和类一起加载
    static {
        System.out.println("静态代码块");
    }
    // 3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("=============");
        Person person1 = new Person();
        //看一下执行顺序
    }


}
