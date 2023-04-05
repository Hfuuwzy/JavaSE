package com.gather.Ollectionc;
/*
    Collections概述和使用
        java.util.Collections
        是针对集合操作的工具类
        此类仅由静态方法组合或返回集合。 它包含对集合进行操作的多态算法，“包装器”，
        返回由指定集合支持的新集合，以及其他一些可能的和最终的。

        常用方法：
            public static <T extends Comparable<? super T>> void sort(List<T> list):
                将指定的列表按升序排列
            public static void reverse(List<?> list): 反转指定列表中元素的顺序。
            public static void shuffle(List<?> list):
            使用默认的随机源随机排列指定的列表。 所有排列都以大致相等的可能性发生。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collections0 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);

        // public static <T extends Comparable<? super T>> void sort(List<T> list)
//        Collections.sort(list);

        // public static void reverse(List<?> list)
        // Collections.sort(list);  先升序再反转能得到降序的结果
//        Collections.reverse(list);

        // public static void shuffle(List<?> list)
        Collections.shuffle(list);

        System.out.println(list);


    }
}
