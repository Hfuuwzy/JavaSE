package com.gather.list;

import java.util.ArrayList;
import java.util.List;

/*
    增强for循环: 简化数组和Collection集合的遍历
    条件:实现Iterator接口的类允许其对象成为增强for语句的目标
    内部原理:是一个Iterator迭代器
    格式:
        for(元素数据类型 变量名: 数组或者Collection集合){
            在此处使用变量即可，该变量就是元素
        }
 */
public class ForEach {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("-------");
        String [] str = {"hello","world","java"};
        for(String s : str){
            System.out.println(s);
        }
        System.out.println("-------");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer i :list) {
            System.out.println(i);
        }
//        //内部是一个Iterator迭代器
//        for (Integer i :
//                list) {
//            if (i.equals(2)){
//                list.add(4);
//            }//ConcurrentModificationException
//        }
    }
}
