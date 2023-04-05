package com.UsuallyClass.StringClass;
//StringBuilder的添加与反转
public class StringBuilderB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //public StringBuilder append(任意类型)；添加数据，并返回对象本身
//        StringBuilder sb2 = sb.append("hello");
//
//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb2);
//        System.out.println(sb==sb2);

//        sb.append("Hello ");
//        sb.append("World ");
//        sb.append(100);
        //链式编程
        sb.append("Hello ").append("World ").append(100);//对象调用方法返回对象
        System.out.println("sb:"+sb);
        sb.reverse();//返回相反的字符序列
        System.out.println("sb:"+sb);


    }
}
