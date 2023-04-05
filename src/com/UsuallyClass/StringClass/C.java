package com.UsuallyClass.StringClass;

import java.util.Scanner;

//统计字符串次数
public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = scanner.nextLine();
        int big = 0;
        int small = 0;
        int number = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(ch>='A'&&ch<='Z'){
                big++;
            }
            if(ch>='a'&&ch<='z'){
                small++;
            }
            if(ch>='0'&&ch<='9'){
                number++;
            }
        }
        System.out.println("大写字母:"+big+","+"小写字母:"+small+","+"数字:"+number);

    }
}
