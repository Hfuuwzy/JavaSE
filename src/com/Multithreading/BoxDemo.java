package com.Multithreading;
// 案例：生产者消费者模式
/*
    测试类
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Customer customer = new Customer(box);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);
        t1.start();
        t2.start();
    }
}
/*
   成员类
 */
class Box{
    private int milk ;
    //定义一个成员变量，表示奶箱状态
    private boolean state = false;
    // 存储牛奶的操作
    public synchronized void put(int milk){
        // 如果有牛奶，等待消费
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工作将第"+this.milk+"瓶奶放入奶箱");
        // 生产完之后，修改奶箱状态
        state = true;
        // 唤醒其他等待的线程
        notifyAll();
    }
    // 取出牛奶的操作
    public synchronized void get(){
        //如果没有牛奶，等待生产
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果有牛奶，就消费牛奶
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        //消费之后，修改奶箱状态
        state = false;
        // 唤醒其他等待的线程
        notifyAll();
    }
}
/*
    生产者类
 */
class Producer implements Runnable{
    private Box box;

    public Producer(Box box) {
        this.box = box;
}

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            box.put(i);
        }
    }
}
/*
    消费者类
 */
class Customer implements Runnable{
    private Box box;
    public Customer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true){
            box.get();
        }
    }
}