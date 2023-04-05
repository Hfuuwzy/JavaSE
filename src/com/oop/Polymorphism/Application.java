package com.oop.Polymorphism;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new  Student();
        //new  Person;

        //可以指向的类型就不确定了；父类的引用指向子类

        //Student能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();
        //Person 父类型，可以指向子类，但不能调用子类独有的方法
        //类型之间的转换：  父   子

        //高    <--------   低
        Person s2 = new Student();
        Object s3 = new Student();

        System.out.println(s1 instanceof Person);//true
        System.out.println(s2 instanceof Student);//true
        // System.out.println(s1 instanceof String ）; // 编译错误，

        //对象能执行哪些方法，主要看对象左边的类型，和右边关系不大

        s1.run();
        s2.run();//子类重写了父类的方法，执行子类的方法
        s1.sing();//子类使用父类的方法
        s1.jump();
        s2.sing(); //子类转换为父类。可能会丢失一些本来的方法
        ((Student)s2).jump();//强制类型转换， 高转低
        //Student student = (Student) s2;
        //student.jump();

        /*
    多态注意事项
        1. 多态是方法的多态，属性没有多态
        2. 父类和子类，有这种有联系      类型转换异常! ClassCastException
        3. 存在条件： 继承关系 ，方法需要重写，父类引用指向子类对象！
        Father f1 = new Son();

            1.static 方法，属于类，它不属于实例
            2.final 常量；
            3.private 方法；私有的不能调用
    instanceof 关键词用法
            //System.out.println(X instanceof Y);  只有继承关系才能编译通过。
    多态总结
        1. 父类引用指向子类的对象（前提）
        2. 把子类转换成父类，向上转型；（直接）
        3. 把父类转换成子类，向下转型；（强制转换）
         信息量大的转换成信息量小的会信息丢失
         信息量小的转换成信息量大的会信息缺失
        4.方便方法的调用，减少重复的代码！
        抽象思想:编程思想

         */


    }
}
