package com.gather.set;

import java.util.LinkedHashSet;

/*
    LinkedHashSet集合概述和特点:
        1. 哈希表和链表实现的Set接口，具有可预测的迭代顺序
        2. 由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
        3. 由哈希表保证元素唯一， 也就是说没有 重复元素
 */
public class LinkedHS {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");

        lhs.add("hello");

        for (String s :
                lhs) {
            System.out.println(s);
        }

    }
}
