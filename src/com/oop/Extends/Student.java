package com.oop.Extends;

//学生 是   人 ：派生类，子类
//子类继承父类，就会拥有父类的全部方法！
public class Student extends Person {
    private String name = "lengleng";

    public Student() {
        //隐藏代码；默认调用了父类的无参构造
        //若父类为有参，则可以 super（“name”）;调用父类的有参
        super(); //调用父类的构造器，必须要在子类构造器的第一行
        System.out.println("Student有参执行了");
    }
    public void print() {
        System.out.println("Student");
    }
    public void text1() {
        print();
        this.print();
        super.print();
    }

    public void text(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }


}
