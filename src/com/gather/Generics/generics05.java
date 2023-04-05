package com.gather.Generics;

import java.util.ArrayList;
import java.util.List;

/*
    类型通配符：<？>
        List<?>:表示元素类型未知的list,它的元素可以匹配任何的类型
        这种带通配符的list仅表示它是各种泛型list的父类，并不能把元素添加到其中

    类型通配符上限：<? extends 类型 >
        List<? extends Number>它表示的类型是Number或者其子类型

    类型通配符下限：<? super 类型 >
        List<? super Number>它表示的类型是Number或者其父类型
 */
public class generics05 {
    public static void main(String[] args) {
        /*
        java.lang.Object
            java.lang.Number
                java.lang.Integer
         */

        // 类型通配符：<？>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        // 类型通配符上限：<? extends 类型 >
//        List<? extends Number> list4 = new ArrayList<Object>();// 父类
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();// 子类

        // 类型通配符上限：<? super 类型 >
//        List<? super Number> list7 = new ArrayList<Integer>();//子类
        List<? super Number> list8 = new ArrayList<Number>();
        List<? super Number> list9 = new ArrayList<Object>();
    }
}
