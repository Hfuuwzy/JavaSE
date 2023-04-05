package com.oop.Classcreation;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;

        System.out.println(dog.name);
        System.out.println(dog.age);
        Pet cat = new Pet();

    }
}

//   1. Student xm = new Student();
//    Student xh = new Student();
//
//        xm.name = "小明";
//                xm.age = 3;
//
//                System.out.println(xm.name);
//                System.osut.println(xm.age);
//
//                xh.name = "小红";
//                xh.age = 3;
//
//                System.out.println(xh.name);
//                System.out.println(xh.age);

//   2. //类:抽象  需要实例化
//    //类实例化后会返回一个自己的对象
//    //student对象就是一个Student类的具体实例
//    Person person = new Person("xiaoshuai",23);
//    Person person1 = new Person();
//        System.out.println(person1.name);
//                System.out.println(person.name);
//                System.out.println(person.age);