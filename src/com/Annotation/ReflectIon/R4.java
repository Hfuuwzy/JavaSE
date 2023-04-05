package com.Annotation.ReflectIon;
/*
    类加载内存分析 and 类初始化
 */
public class R4 {
    static {
        System.out.println("main()方法被初始化");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        A a = new A();
//        System.out.println(A.m);
        /*
            内存分析:
                1. 加载到内存，会产生一个类对应的Class对象
                2. 链接，链接结束后 m = 0;
                3. 初始化
                    <CLinit>(){
                      System.out.println("A类静态代码初始化");
                       m = 300;
                       m = 100;
                    }
                    m=100;
         */

        // 类的初始化
        // 1. 主动引用
//        B b = new B();

        // 反射也会产生主动引用
//        Class.forName("com.Annotation.ReflectIon.B");

        /*
            不会发生类的初始化的情况:
                1.当访问一个静态域时，只有真正声明这个域的类才会被初始化;例如子类引用父类的静态变量
                2.通过数组定义类的引用，不会触发此类的初始化
                3.引用常量不会触发此类的初始化
         */
//        System.out.println(B.m);

//        B [] array = new B[5];// 只是开辟了一个空间

        System.out.println(B.M);
    }
}
class  A{

//    public A(){
//        System.out.println("A类的无参构造初始化");
//    }
    static {
        System.out.println("父类被加载");
        m = 300;
    }

    static int m = 100;

//    public A(){
//        System.out.println("A类的无参构造初始化");
//    }
}
class B extends A{
    static {
        System.out.println("子类被加载");
    }
    static final int M = 1;
}