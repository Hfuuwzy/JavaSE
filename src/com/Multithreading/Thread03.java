package com.Multithreading;
/*
    线程调度:
    线程有两种调度模式:
        1. 分时调度模型:所有线程轮流使用CPU的使用权，平均分配每个线程占用CPU的时间片
        2. 抢占式调度模型:优先让优先级高的线程占使用CPU，如果线程的优先级相同，那么会随机选择一个，
        优先级高的线程获取的CPU时间片相对多一些

    Java使用的是抢占式调度模型

    假如计算机只有一个CPU，那么CPU在某一时刻只能执行一条命令，线程只有得到CPU时间片，也就是使用权，才可以
    执行指令，所以说多线程的执行是有随机性的，因为谁抢到CPU的使用权是不一定的

    Thread类中设置和获取线程优先级的方法：
        public final int getPriority():返回此线程的优先级
        public final void setPriority(int newPriority):更改此线程的优先级。

    线程默认的优先级是5，线程的优先级范围是：1-10
    线程的优先级高，仅仅代表线程获取的CPU时间片的几率高，但是要在次数比较多，
    或者多次运行的时候才能看到你想要的效果
 */

public class Thread03 {
    public static void main(String[] args) {
        MyThread03 mt1 = new MyThread03();
        MyThread03 mt2 = new MyThread03();
        MyThread03 mt3 = new MyThread03();
        mt1.setName("飞机");
        mt2.setName("高铁");
        mt3.setName("汽车");
        // public final int getPriority()
//        System.out.println(mt1.getPriority());// 5
//        System.out.println(mt2.getPriority());// 5
//        System.out.println(mt3.getPriority());// 5

        // public final void setPriority(int newPriority)
        mt1.setPriority(10);
        mt2.setPriority(5);
        mt3.setPriority(1);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
class MyThread03 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
