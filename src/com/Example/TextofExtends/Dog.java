package com.Example.TextofExtends;

public class Dog extends Animals{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void look(){
        System.out.println(" 狗能看门");
    }
}
