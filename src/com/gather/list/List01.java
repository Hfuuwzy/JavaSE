package com.gather.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util
    Interface List<E>
    有序、可重复
    List extends Collection
 */
public class List01 {
    public static void main(String[] args) {
        List<String>  list  = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("java");
        list.add("World");
//        System.out.println(list);
        //输出集合对象
//        System.out.println(list);//[hello, world, java，World]
        //集合的遍历 ---迭代器的处理方式
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
