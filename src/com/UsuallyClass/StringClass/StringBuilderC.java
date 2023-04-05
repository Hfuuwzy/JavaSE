package com.UsuallyClass.StringClass;
//StringBuilder和String的相互转换
public class StringBuilderC {
    public static void main(String[] args) {
        //StringBuilder转换为String
        StringBuilder sb = new StringBuilder();
        sb.append("转换").append("成功");//字符串拼接更方便了还有反转
        String s = sb.toString();//通过ToString()方法转换
        System.out.println(s);

        String s2 = "HelloWorld";
        StringBuilder sb2 = new StringBuilder(s2);//通过构造方法转换
        System.out.println(sb2 );


    }
}
