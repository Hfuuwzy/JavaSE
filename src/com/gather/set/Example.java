package com.gather.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
    不重复的随机数
    要求: 编写一个程序，获取10个1~20之间的随机数，要求随机数不能重复
 */
public class Example {
    public static void main(String[] args) {
//        Set<Integer> s = new HashSet<>();//不排序
        Set<Integer> s = new TreeSet<>();//排序
        Random r = new Random();
        while (s.size()<10){
            int i = r.nextInt(20)+1;
            s.add(i);
        }
        for (Integer i :s) {
            System.out.println(i);
        }
    }
}
