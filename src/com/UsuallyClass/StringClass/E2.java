package com.UsuallyClass.StringClass;

import java.util.Scanner;

//字符串的反转升级版
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();
        String s = reverse2(line);
        System.out.println(s);
    }

    public static String reverse2(String s){
//        StringBuilder sb = new StringBuilder(s);//把传进来的String类型转为StringBuilder
//        sb.reverse();//调用反转方法
//        String s1 = sb.toString();//转为String类型返回
//        return s1;
        return new StringBuilder(s).reverse().toString();//匿名内部类的使用

    }
}
