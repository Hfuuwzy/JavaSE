package com.gather.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util
    Interface Set<E>
    public interface Set<E> extends Collection<E>
    Set集合特点:
        不包含重复元素的集合；
        没有带索引的方法，所以不能用使用普通for循环遍历
        HashSet:对集合的迭代顺序不作任何保证
 */
public class Set01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复的元素
        set.add("world");//控制台只输出了一个"world"

        //遍历，对迭代顺序不作保证
        for(String s:set){
            System.out.println(s);
        }
//        //迭代器方法遍历
//        Iterator<String> it = set.iterator();
//        while (it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }
    }
}
