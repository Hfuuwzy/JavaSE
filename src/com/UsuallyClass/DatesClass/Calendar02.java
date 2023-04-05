package com.UsuallyClass.DatesClass;

import java.util.Calendar;
import java.util.Scanner;

//案例 二月天
public class Calendar02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份: ");
        int year = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,1 );
        calendar.add(Calendar.DATE,-1);//获取二月的最后一天
        int date = calendar.get(Calendar.DATE);
        System.out.println(year+"年二月有"+date+"天");


    }
}
