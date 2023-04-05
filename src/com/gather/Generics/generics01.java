package com.gather.Generics;
/*
    泛型:泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
    好处:
        把运行时期出现的问题提前到了编译期间
        避免了强制类型转换
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class generics01 {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);  把本该运行时出现的问题提前到了编译时期

//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
//            String s = (String) it.next();//ClassCastException
            String s = it.next();//不用强制类型装换
            System.out.println(s);
        }
    }
}
