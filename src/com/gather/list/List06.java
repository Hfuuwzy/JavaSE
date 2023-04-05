package com.gather.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    List子类集合特点
    List集合常用子类:ArrayList LinkedList
    Arraylist:底层数据结构是数组，查询快，增删慢
    LinkedList:底层数据结构是链表，查询慢，增删快
    分别用两种方式储存字符串并遍历
 */
public class List06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("-----------");
        List<String> list1 = new LinkedList<>();
        list1.add("a");
        list1.add("s");
        list1.add("d");
        list1.add("f");
        for(String s:list1){
            System.out.println();
        }


    }
}
