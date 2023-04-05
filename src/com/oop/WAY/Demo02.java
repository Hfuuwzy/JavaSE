package com.oop.WAY;
//引用传递，本质还是值传递
public class Demo02 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);

        Demo02.change(person);//引用传递，此时person.name修改的是下面类的name

        System.out.println(person.name);
    }

    public static void change(Person person){
        //person是一个对象:指向的 ---> Person person = new Person();这是一个具体的人，可以改变属性！
        person.name = "小帅";
    }
    //定义了一个Person类,有一个属性：name
    static class Person{
        String name ;//null值
    }

}
