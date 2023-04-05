package com.UsuallyClass.StringClass;
//字符串遍历
import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        //字符串的遍历，line.length()表示字符串的长度，charAt(i)表示遍历字符串的方法
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }


    }
}
