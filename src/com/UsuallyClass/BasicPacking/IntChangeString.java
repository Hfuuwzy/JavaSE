package com.UsuallyClass.BasicPacking;
//int 和 String 的相互转换
public class IntChangeString {
    public static void main(String[] args) {
        //int ---> String
        int number = 100;
        //way 1
        String s1 = ""+number;//字符串的拼接
        System.out.println(s1);
        //way2  valueOf(int i):返回 int 参数的字符串表示形式。该方法是String类中的方法
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);

        System.out.println("-----------------");

        //String ---> int
        String s = "100";
        //way 1   String ---> Integer ---> int
        Integer i = Integer.valueOf(s);
        //public int intvalue()
        int x = i.intValue();
        System.out.println(x);
        //way 2   parseInt(String s):将字符串解析为int类型。该方法是Integer中的方法
        //public static int parseInt(String s);
        int y = Integer.parseInt(s);
        //arr [i] = Integer.parseInt(split[i]);把字符串数组中的每个元素变成int型并赋给int[]数组
        System.out.println(y);

    }
}
