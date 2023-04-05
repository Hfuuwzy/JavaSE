package com.UsuallyClass.ObjectClass;
/*
    比较对象是否相等。默认比较的是地址，重写可以比较内容，自动生成。
    public boolean equals (Object obj):指示一些对象是否等于此
 */
public class Equals {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("杨幂");
        s1.setAge(28);

        Student s2 = new Student();
        s2.setName("杨幂");
        s2.setAge(28);

        //需求：比较两个对象内容是否相同
//        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));
        /*
         public boolean equals(Object obj) {
            //this ----- s1
            //obj ------ s2
            return (this == obj);//地址值
        }
         */


    }
}
