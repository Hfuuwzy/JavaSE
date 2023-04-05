package com.gather.set;

import java.util.HashSet;

/*
       public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
    HashSet集合特点：
        1.底层数据结构是哈希表
        2.对集合的迭代顺序不做任何保证
        3.没有带索引的方法，所以不能使用普通for循环遍历
        4.由于是Set集合，所以是不包含重复元素的集合
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        //添加重复元素。
        hs.add("world");//world,java, hello


        //遍历
        for(String s:hs){
            System.out.println(s);
        }
    }
}
