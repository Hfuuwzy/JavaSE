package com.Multithreading;
/*
    线程控制:
        static void sleep(long millis):	使当前正在执行的线程停留(暂停执行)指定的毫秒数
        void join():	等待这个线程死亡，即运行结束
        void setDaemon(Boolean on):	将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
 */
public class ThreadControl {
    public static void main(String[] args) {
//        new ThreadSleepDemo();
//        new ThreadJoinDemo();
        new ThreadDaemonDemo();
    }
}
class ThreadSleepDemo {
    public ThreadSleepDemo() {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();
        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();

    }
    class ThreadSleep extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName() + ":" + i);
                // static void sleep(long millis):使当前执行的线程暂停(1s)再继续执行
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThreadJoinDemo{
    public ThreadJoinDemo()  {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();
        //为了使第一个线程结束再继续接下来的线程，使用void join()方法：等待这个线程死亡
        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");
        tj1.start();
        // 某个线程使用join()方法，不影响它之前线程的执行，但是它之后的线程需要等待此此线程结束才能执行
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
    class ThreadJoin extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName() + ":" + i);
            }
        }
    }
}

class ThreadDaemonDemo {
    public ThreadDaemonDemo() {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");
        // 设置主线程为刘备,要求在主线程结束时其他线程也结束
        Thread.currentThread().setName("刘备");
        //void setDaemon(Boolean on)：将将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
        // **但是，不会立即退出**
        td1.setDaemon(true);
        td2.setDaemon(true);
        td1.start();
        td2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
    class ThreadDaemon extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName() + ":" + i);
            }
        }
    }
}
