package com.Multithreading;

import java.util.*;

/*
    同步方法：就是把synchronized关键字加到方法上
         - 格式：
        修饰符 synchronized 返回值类型 方法名(方法参数) {}
        同步方法锁的对象是 this
    同步静态方法：就是把synchronized关键字加到静态方法上
        - 格式：
        修饰符 static synchronized 返回值类型 方法名(方法参数) {}
        同步静态锁的方法对象是 类名.class
 */
public class SellTicket02 implements Runnable {
    private static int ticket = 100;
    @Override
    public void run() {
        sellTicket();

    }

    // 同步普通方法
//    private synchronized void sellTicket(){
//        while (true) {
//            synchronized (this) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + " 张票");
//                    ticket--;
//                }
//            }
//        }
//    }

    // 同步静态方法
    // 静态方法只能调用静态变量
    private static synchronized void sellTicket(){
        while (true) {
            synchronized (SellTicket02.class) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + " 张票");
                    ticket--;
                }
            }
        }
    }
}

class SellTicket02Demo {
    public static void main(String[] args) {
        SellTicket02 SellTicket02 = new SellTicket02();
        Thread t1 = new Thread(SellTicket02, "窗口1");
        Thread t2 = new Thread(SellTicket02, "窗口2");
        Thread t3 = new Thread(SellTicket02, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
