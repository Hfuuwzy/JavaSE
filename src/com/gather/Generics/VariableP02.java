package com.gather.Generics;

import com.UsuallyClass.StringClass.E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
    可变参数的使用
    JDK9有下列方法
    Arrays工具类中有一个静态方法：
    public static <T> List<T> asList(T...a):返回由指定数组支持的固定大小的列表

    List接口有一个静态方法:
    public static <E> List<E> of(E...Element):返回包含任意数量元素的不可变列表

    Set接口有一个静态方法:
    public static <E> Set<E> of(E...Element):返回一个包含任意数量元素的不可变集合



 */
public class VariableP02 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello","world","java");
//        list.add("javaee");//UnsupportedOperationException抛出以表示不支持请求的操作。
//        list.remove("hello");//UnsupportedOperationException
//        list.set(1,"javaee");// [hello, javaee, java]
//        System.out.println(list);

        List<E> list = new ArrayList<>();


    }
}
