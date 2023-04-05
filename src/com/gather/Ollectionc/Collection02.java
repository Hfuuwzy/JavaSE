package com.gather.Ollectionc;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection<E> 的常用方法
 */
public class Collection02 {
    public static void main(String[] args) {
        Collection< String> c = new ArrayList<>();

        //boolean add(E e):添加元素
//        System.out.println(c.add("hello"));
//        System.out.println(c.add("world"));
//        System.out.println(c.add("java"));
        /*
             public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
//            return true;//总是返回true，故直接使用
            }
         */
        c.add("hello");
        c.add("world");
        c.add("java");

        //boolean remove(Object o):从集合中移除指定的元素
//        System.out.println(c.remove("java"));//true
//        System.out.println(c.remove("javaee"));//false

        //void clear():清除集合中的元素
//        c.clear();

        //boolean contains(Object o):判断集合中是否存在指定的元素
//        System.out.println(c.contains("hello"));//true
//        System.out.println(c.contains("Hello"));//false

        //boolean isEmpty():判断集合是否为空
//        System.out.println(c.isEmpty());

        //int size():集合的长度，也就是集合中元素的个数
//        System.out.println(c.size());

        //输出集合对象
        System.out.println(c);
    }
}
