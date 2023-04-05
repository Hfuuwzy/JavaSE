package com.oop.INTERFACE;

//important 抽象的思维~
//interface 定义的关键字 ， 接口都需要有实现类
public interface UserService {
     //属性默认是常量~public static final
    int age = 17;//其实一般不会用到

    //接口中的所有定义其实都是抽象的   public abstract
    void add();//接口中的方法都是抽象方法，抽象方法不能写具体的方法体，而是只能声明，在接口的实现类中重写方法。
    void delete();

    //自己当时的理解是，我给你这样个约束条件，你去完成它，但是你可以用不同的方法达到这个目的。



}
