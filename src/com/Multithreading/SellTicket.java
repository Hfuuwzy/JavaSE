package com.Multithreading;
/*
    案例:卖票
    需求:某影院正在上映大片，共有100张票，而他有三个窗口卖票，请设计一个程序模拟该影院卖票
    买票问题出现原因：
        线程执行的随机性导致的。
 */
public class SellTicket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
//        //相同的票出现了多次分析
//        while (true) {
//            // tickets = 100;
//            // t1,t2,t3
//            // 假设t1抢到了CPU的执行权
//            if (ticket > 0) {
//                //通过sleep()方法来模拟出票时间
//                try {
//                    Thread.sleep(100);
//                    // t1线程休息100毫秒
//                    // t2线程抢到了CPU的执行权，t2线程就开始执行，执行到这里的时候，t2线程休息100毫秒
//                    // t3线程抢到了CPU的执行权，t3线程就开始执行，执行到这里的时候，t2线程休息100毫秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                // 假设线程按照顺序醒过来
//                // t1线程抢到了CPU的执行权，在控制台输出：窗口1正在出售第100张票
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + " 张票");
//                // t2线程抢到了CPU的执行权，在控制台输出：窗口2正在出售第100张票
//                // t3线程抢到了CPU的执行权，在控制台输出：窗口3正在出售第100张票
//                ticket--;
//                // 如果这三个线程是按照顺序来的，这里就执行了3次--操作，最终票就变成了97
//            }
//        }

        //出现了复数的票
        while (true) {
            // tickets = 1;
            // t1,t2,t3
            // 假设t1抢到了CPU的执行权
            if (ticket > 0) {
                //通过sleep()方法来模拟出票时间
                try {
                    Thread.sleep(100);
                    // t1线程休息100毫秒
                    // t2线程抢到了CPU的执行权，t2线程就开始执行，执行到这里的时候，t2线程休息100毫秒
                    // t3线程抢到了CPU的执行权，t3线程就开始执行，执行到这里的时候，t2线程休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 假设线程按照顺序醒过来
                // t1线程抢到了CPU的执行权，在控制台输出：窗口1正在出售第1张票
                // 假设t1继续拥有CPU的执行权，就会执行ticket--操作，ticket=0;
                // t2线程抢到了CPU的执行权，在控制台输出：窗口2正在出售第0张票
                // 假设t2继续拥有CPU的执行权，就会执行ticket--操作，ticket=-1;
                // t3线程抢到了CPU的执行权，在控制台输出：窗口1正在出售第-1张票
                // 假设t3继续拥有CPU的执行权，就会执行ticket--操作，ticket=-2;//并不会输出到这里
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + " 张票");
                ticket--;
                // 如果这三个线程是按照顺序来的，这里就执行了3次--操作，最终票就变成了97
            }
        }
    }
}
/*
    测试类
 */
class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread t1 = new Thread(sellTicket, "窗口1");
        Thread t2 = new Thread(sellTicket, "窗口2");
        Thread t3 = new Thread(sellTicket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
