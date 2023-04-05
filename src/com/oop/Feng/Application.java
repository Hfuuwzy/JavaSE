package com.oop.Feng;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("小帅");
        System.out.println(s1.getName());

        s1.setAge(238);
        System.out.println(s1.getAge());
    }
}
