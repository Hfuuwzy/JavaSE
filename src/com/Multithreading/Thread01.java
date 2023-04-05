package com.Multithreading;
/*
    多线程的实现方式：
        方式一： 继承Thread类
            定义一个类MyThread继承Thread类
            重写 run()方法，创建新的对象
            启动线程
    思考：
        为什么要重写run()方法?
            因为run()是用来封装被线程执行的代码
        run()和start()方法的区别？
            run():封装线程启动的代码，直接调用，相当于普通方法的调用
            start():启动线程，然后由JVM调用此线程的run()方法
 */
public class Thread01 {
    public static void main(String[] args) {
        MyThread01 mt1 = new MyThread01();
        MyThread01 mt2 = new MyThread01();
//        mt1.run();
//        mt2.run();
        // Calls to 'run()' should probably be replaced with 'start()'
        mt1.start();
        mt2.start();
    }
}
class MyThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
