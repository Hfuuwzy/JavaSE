package com.Annotation.ReflectIon;

import java.lang.annotation.ElementType;

/*
    所有类型的Class对象
 */
public class R3 {
    public static void main(String[] args) {
        Class<Object> c1 = Object.class;            // 类
        Class<Comparable> c2 = Comparable.class;    // 接口
        Class<String[]> c3 = String[].class;        // 一维数组
        Class<int[][]> c4 = int[][].class;          // 二位数组
        Class<Override> c5 = Override.class;        // 注解
        Class<ElementType> c6 = ElementType.class;  // 枚举
        Class<Integer> c7 = Integer.class;          // 基本数据类型
        Class<Void> c8 = void.class;                // void
        Class<Class> c9 = Class.class;              // Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        // 只要数据类型与维度一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }
}
