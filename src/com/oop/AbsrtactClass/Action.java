package com.oop.AbsrtactClass;
//abstract 抽象类;  类 extends :单继承
public abstract class Action {

    //约束~有人帮我们实现
    //abstract , 抽象方法，只有方法名字，没有方法的实现
    public abstract void Run();//抽象方法
    public void ass(){};//普通方法

    //1. 不能new这个抽象类（无法通过new实例），只能靠子类去实现它（通过继承）： 约束！
    //2. 抽象类中可以写普通的方法~
    //3. 抽象方法必须在抽象类中~
    //抽象的抽象；约束。
    //4. 抽象类是为了被子类继承，子类必须调用父类构造器， 所以抽象类必须存在构造器 ，它的构造器是给子类调用使用的。

    public Action() {
        System.out.println("我是小明");
    }

    public static void main(String[] args) {
        Action a = new A();//会默认产生无参构造器中的方法
        a.Run();
    }
}


