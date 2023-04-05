package com.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicketLock implements Runnable {
    private int ticket = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + " 张票");
                    ticket--;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
class SellTicketLockDemo{
    public static void main(String[] args) {
        SellTicketLock sellTicketLock = new SellTicketLock();
        Thread t1 = new Thread(sellTicketLock, "窗口1");
        Thread t2 = new Thread(sellTicketLock, "窗口2");
        Thread t3 = new Thread(sellTicketLock, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
