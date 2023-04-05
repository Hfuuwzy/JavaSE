package com.UsuallyClass.BasicPacking;
/*
    装箱：把基本数据类型转换为对应的包装类类型
    装箱：把包装类类型转换为对应的基本数据类型
 */
public class Box {
    public static void main(String[] args) {
//        Integer i = Integer.valueOf(100);//装箱
        Integer ii = 100;//自动装箱  隐含了 Integer.valueOf(100) 这一步
        System.out.println(ii);

//        ii = ii.intValue()+200;//装箱
        ii += 200;//i=i+200; i+200 是自动拆箱  隐含了ii.intValue()+200；i = i+200 是自动装箱；
        System.out.println(ii);

         Integer iii = null;
         if(iii != null) {
             iii += 300;//NullPointerException 空指针
         }//只要是对象，在使用前必须进行不为null的判断




    }
}
