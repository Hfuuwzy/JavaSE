package com.UsuallyClass.InternalClass;
/*
    内部类格式：
        public class 类名{
            修饰符 class 类名{

            }
        }
    内部类访问特点：
        内部类可以直接访问外部类的成员，包括私有
        外部类要访问内部类的成员，必须创建对象
 */
public class Outer01 {
    private int num =10;
    // 成员内部类
//    public class Inner {
//        public void show() {
//            System.out.println(num);
//        }
//    }
    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
/*
    测试类
    成员内部类的使用格式：
        外部类名.内部类名 对象名 = 外部类对象.内部类对象

 */

class InnerDemo{
    public static void main(String[] args) {
        // 针对 public 修饰用法
//        Outer01.Inner oi = new Outer01().new Inner();
//        oi.show();

        //间接使用 private 修饰的内部类--常用
        Outer01 o = new Outer01();
        o.method();
    }
}
