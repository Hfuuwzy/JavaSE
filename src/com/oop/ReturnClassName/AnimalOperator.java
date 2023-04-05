package com.oop.ReturnClassName;
//方法的类名作为形参，其实需要的是该抽象类的子类对象
//方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
public class AnimalOperator {
    public void UseAnimal(Animal a){
        a.eat();
    }

    public Animal getAnimal(){//new Dog()
        Animal a = new Dog();
        return a;
    }
}
