package com.UsuallyClass.DatesClass;

import java.util.Date;

// Date类常用方法
public class Date02 {
    public static void main(String[] args) {
        Date date1 = new Date();
        //public long getTime();获取的是日期对象从1970年1月1日 00：00：00到现在的毫秒值
        System.out.println(date1.getTime());
        System.out.println(date1.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time): 设置时间，给的是毫秒值
        Date date2 = new Date();
        long time = 1000*60*60;
//        long time = System.currentTimeMillis();
        date2.setTime(time);
        System.out.println(date2);


    }
}
