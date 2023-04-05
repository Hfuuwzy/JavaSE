package com.Example.TextofExtends;

public class Application {
    public static void main(String[] args) {
        //创建猫类并进行测试
        Cat cat = new Cat();
        cat.setName("加菲猫");
        cat.setAge(3);
        System.out.println(cat.getAge()+","+cat.getName());
        //调用无参构造方法，在Cat类中没有找到getname方法，则会去父类寻找并调用
        Cat cat1 = new Cat("汤姆猫",2);
        System.out.println(cat1.getAge()+","+cat1.getName());
        cat.carry();

        Dog dog = new Dog();


    }

}
