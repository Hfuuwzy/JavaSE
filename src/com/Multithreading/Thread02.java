package com.Multithreading;
/*
    设置和获取线程名称
        Thread类中设置和获取线程名称的方法():
            void setName(String name):将此线程的名称更改为等于参数name
            String getName():返回此此线程的名称
            通过构造方法也可以设置线程名称

    如何获取main()方法所在的线程？
        public static Thread currentThread():返回对当前正在执行的线程对象的引用

 */
public class Thread02 {
    public static void main(String[] args) {
//        MyThread02 mt1 = new MyThread02();
//        MyThread02 mt2 = new MyThread02();
//
//        // void setName(String name):
//        mt1.setName("高铁");
//        mt2.setName("飞机");
        MyThread02 mt1 = new MyThread02("高铁");
        MyThread02 mt2 = new MyThread02("飞机");
//        mt1.start();
//        mt2.start();
        //public static Thread currentThread();
        System.out.println(Thread.currentThread().getName());
    }
}
class MyThread02 extends Thread{
    public MyThread02() {
    }

    public MyThread02(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
