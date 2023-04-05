package com.Multithreading;

/*
同步代码块
    锁多条语句操作共享数据，可以使用同步代码块实现
	 格式：
		synchronized(任意对象){
                多条语句操作共享数据的代码
            }
    synchronized(任意对象)：相当于给代码加锁了，任意对象就可以看成一把锁
 */
public class SellTicket01 implements Runnable {
    private int ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // ticket = 100;
            // 假设t1抢到了CPU的执行权
            // 假设t2抢到了CPU的执行权，发现被锁上，直接等待结束再进去
            synchronized (obj) {
                // t1进来后，就会把这段代码给锁起来
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                        // t1休息100毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 窗口1正在出售第100张票
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + " 张票");
                    ticket--;
                }
            }
            //t1出来了，这段代码的锁就被释放了。
        }
    }
}

class SellTicket01Demo {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        Thread t1 = new Thread(sellTicket01, "窗口1");
        Thread t2 = new Thread(sellTicket01, "窗口2");
        Thread t3 = new Thread(sellTicket01, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}