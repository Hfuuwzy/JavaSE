package com.UsuallyClass.ArraysClass;

import java.util.Arrays;

//  private Arrays() {}  存在构造方法，即使API帮助文档中未出现
public class Sort {
    public static void main(String[] args) {
        int  [] arrays = {53,23,65,33,12,56};
        // public static String toString(int [] a)
        System.out.println("排序前:"+ Arrays.toString(arrays));
        //public static void sort(int [] a)
        Arrays.sort(arrays);
//        System.out.println(arrays);
        System.out.println("排序后:"+Arrays.toString(arrays));


        /*工具类的设计思想
            1. 构造方法用private修饰
            2. 成员用public static 修饰
         */

    }
}
