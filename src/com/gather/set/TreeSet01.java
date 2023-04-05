package com.gather.set;

import java.util.TreeSet;

/*
    TreeSet集合特点:
        1.元素有序， 这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序,具体排序方式取决于构造方法
            TreeSet() 构造一个新的，空的树组，根据其元素的自然排序进行排序。
            TreeSet(Comparator<? super E> comparator) 构造一个新的，空的树集，根据指定的比较器进行排序。
        2.没有带索引的方法，所以不能使用普通for循环遍历，
        3.由于是Set集合，所以不包括重复元素的集合
 */
public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
         ts.add(30);
         ts.add(20);
         ts.add(60);
         ts.add(10);
         ts.add(50);

         ts.add(10);
        for (Integer i :
                ts) {
            System.out.println(i);
        }//10,20,30,50,60
    }
}
