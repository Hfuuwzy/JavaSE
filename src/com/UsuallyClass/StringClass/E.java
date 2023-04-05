package com.UsuallyClass.StringClass;
//字符串的反转
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:" );
        String s = scanner.nextLine();
        String line  = reverse(s);
        System.out.println(line);
        scanner.close();
    }

    public static String reverse(String s){
        String ss = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }



}
