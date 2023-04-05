package com.UsuallyClass.SystemClass;
//System类的常用方法
public class SystemA {
    public static void main(String[] args) {
        //可以直接调用
        /*   exit()方法
        System.out.println("开始");
        System.exit(0);  终止当前的java虚拟机，非零表示异常终止
        System.out.println("结束");
         */

//        // public static long currentTimeMillis():返回当前时间（以毫秒为单位）
//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时:"+(end-start)+"毫秒");


    }
}
