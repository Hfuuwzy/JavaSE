package com.UsuallyClass.BasicPacking;
/* 基本类型包装类
    将基本数据类型封装成对象的好处在于可以在对象中定义更多功能方法操作该数据
    常用的操作之一 : 用于基本数据类型与字符串之间的转换
 */
public class IntegerClass {
        public static void main(String[] args) {
//            //判断一个数据是否在int范围内
//            //public static final int MIX(MAX)_VALUE
//            System.out.println(Integer.MIN_VALUE);
//            System.out.println(Integer.MAX_VALUE);

            //public static Integer valueOf (int i); 返回表示指定的 int 值的 Integer 实例
//            Integer i1 = new Integer(100);//已过时
//            System.out.println(i1);
            Integer i1 = Integer.valueOf(100);
            System.out.println(i1);

            ////public static Integer valueOf (String s); 返回一个保存指定值的 Integer 对象 String
            Integer i2 = Integer.valueOf("100");
//            Integer i3 = Integer.valueOf("abc");NumberFormatException
            System.out.println(i2);

        }
    }

