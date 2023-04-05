package com.UsuallyClass.DatesClass;

import java.util.Calendar;

/*
    Calendar为某一时刻和一组日历字段之间的转换 提供了一些方法，并为操作日历字段提供了一些方法

    Calendar提供了一个类方法getInstance 用于获取 Calendar 对象，其日历字段已使用当前日期和时间初始化；
        Calendar rightNow = Calendar.getInstance();
 */
public class Calendar01 {
    public static void main(String [] args){
        Calendar calendar = Calendar.getInstance();//多态的形式
//        System.out.println(calendar);

        // 1.public int get(int field)  返回给定日历字段的值
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH)+1;
//        int date = calendar.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");

        // 2.public abstract void add(int filed, int amount )  将指定的时间量添加或减去给定的日历字段
//        calendar.add(Calendar.YEAR,-5);
//        calendar.add(Calendar.DATE,5);//不会自动进位
//        calendar.add(Calendar.MONTH,2);
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int date = calendar.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");

        // 3.public final void set(int year,int month,int date)
        calendar.set(2048,3,17);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");





    }
}
