package com.UsuallyClass.DatesClass;
//   Date类的构造方法与描述
import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        //1. Date类的构造方法与描述
        //public Date(); 分配一个Date对象，并初始化，以便它代表被分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);//重写了toString方法

        //public Date(long date): 分配一个Date对象，并对其初始化为表示从标准基准时间起指定的毫秒数
        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);



    }
}
