package com.gather.list;

import java.util.ArrayList;
import java.util.List;

/*
    List集合的特有方法
 */
public class List02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add(int index,E element),在此列表中的指定位置插入指定的元素。
//         list.add(1,"GOOD");
//         list.add(11,"funny");//IndexOutOfBoundsException

        // E remove(int index)删除该列表中指定位置的元素。将任何后续元素移动到左侧（从其索引中减去一个元素）。
//        System.out.println(list.remove(2));//java
//        System.out.println(list.remove(11));//IndexOutOfBoundsException

        // E set(int index,E element)用指定的元素替换此列表中指定位置的元素。
//        System.out.println(list.set(0,"good"));//hello [good, world, java]

        // E get(int index)返回此列表中指定位置的元素。
//        System.out.println(list.get(2));//java

        //用for循环改进遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
//        System.out.println(list);


    }
}
