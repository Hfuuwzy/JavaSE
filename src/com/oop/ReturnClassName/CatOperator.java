package com.oop.ReturnClassName;
//类名作为形参，其实是要该类的对象
//方法的返回值为类名，其实返回的是该类的对象
public class CatOperator {

    public void UseCat(Cat c){//Cat c = new  Cat;相当于创建了这个对象，才能调用方法
        c.eat();
    }

    public Cat getCat(){//new Cat
        Cat c = new Cat();
        return c;//返回值为这个类的对象

    }
}
