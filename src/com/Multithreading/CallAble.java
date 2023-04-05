package com.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*

 */
public class CallAble {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCall1 myCall1 = new MyCall1();
        MyCall2 myCall2 = new MyCall2();
        FutureTask<int[]> futureTask1 = new FutureTask<int[]>(myCall1);
        FutureTask<int[]> futureTask2 = new FutureTask<int[]>(myCall2);
        Thread t1 = new Thread(futureTask1, "t1: ");
        Thread t2 = new Thread(futureTask1, "t2: ");

        t1.start();
        t2.start();
        int[] b1 = futureTask1.get();// 可能会阻塞，有缓存
        int[] b2 = futureTask2.get();
        for (int i = 0; i < b1.length; i++) {
            System.out.println(i + ":" + b1[i]);
        }
        for (int i = 0; i < b2.length; i++) {
            System.out.println(i + ":" + b2[i]);
        }
    }
}

class MyCall1 implements Callable<int[]> {
    int[][] a = {{1, 3, 7, 9}, {2, 4, 8, 6}, {1, 3, 5, 9}, {1, 2, 9, 6}};

    //    int[][]a = new int[10][10];
    @Override
    public int[] call() throws Exception {
//        Initial.value(a);
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int little = Integer.MAX_VALUE;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < little) {
                    little = a[i][j];
                }
            }
//            System.out.println(Thread.currentThread().getName()+little);
            b[i] = little;
        }
        return b;
    }
}

class MyCall2 implements Callable<int[]> {
    int[][] a = {{1, 3, 7, 9}, {2, 4, 8, 6}, {1, 3, 5, 9}, {1, 2, 9, 6}};

    //     int[][]a = new int[10][10];
    @Override
    public int[] call() throws Exception {
//        Initial.value(a);
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            b[i] = max;
        }
        return b;
    }
}

/*
    初始化类
 */
class Initial {
    public static void value(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j;
            }
        }
    }
}