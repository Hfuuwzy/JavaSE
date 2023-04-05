package com.UsuallyClass.StringClass;
//字符串的创建和比较
public class A {
    public static void main(String[] args) {
        //创建一个空白字符串对象，不含有任何内容
        String s1 = new String();//不必要的，多余的实际上
        System.out.println("s1:"+s1);

        //根据字符数组内容，来创建字符串对象
        char [] chars = {'a','b','c'};
        String s2 = new String(chars);
        System.out.println("s2:"+s2);

        //根据字节数组的内容，来创建字符串类对象
        byte [] bytes = {97,98,99};
        String s3 = new String(bytes);
        System.out.println("s3:"+s3);

        //直接赋值的方式来创建字符串对象-------->推荐使用这种方式
        String s4 = "abc";
        System.out.println("s4:"+s4);

        System.out.println("================");
        String s5 = "abc";
        /*
        使用==作比较
        基本类型：比较的是 数据值 是否相同
        引用类型：比较的是 地址值 是否相同
         */
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);//上述都是比较的地址值
        System.out.println(s4==s5);

        System.out.println("=================");

        //用equals关键字来比较字符串的内容是否相同
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));

    }
}
