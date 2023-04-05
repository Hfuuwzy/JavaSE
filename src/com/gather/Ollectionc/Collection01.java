package com.gather.Ollectionc;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建collection集合的对象
    多态的方式
    Arraylist  Implements Collection
 */
public class Collection01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();//多态的形式
        /*
        boolean add(E e)确保此集合包含指定的元素（可选操作）。
        如果此集合由于调用而更改，则返回true 。 （如果此集合不允许重复，并且已包含指定的元素，则返回false。 ）
         */
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);//[hello, world, java],说明ArrayList<>重写了toString方法

    }
}
