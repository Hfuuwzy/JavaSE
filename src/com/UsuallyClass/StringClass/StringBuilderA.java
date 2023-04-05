package com.UsuallyClass.StringClass;
//StringBuilder的使用
public class StringBuilderA {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb.length():"+sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length():"+sb2.length());
    }
}