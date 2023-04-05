package com.UsuallyClass.InternalClass;
/*
    局部内部类
        局部内部类是在方法中定义的类，所以外界无法直接使用，
        需要在方法内部创建对象并使用
        该类可以直接访问外部类的成员， 也可以访问方法内的局部变量
 */
public class Outer02 {
    private int num = 10;

    public void method(){
        int num2 = 20;
        class Inner {
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        Inner in = new Inner();
        in.show();

    }

}
/*
    测试类
 */
class Outer02Demo{
    public static void main(String[] args) {
        Outer02 o = new Outer02();
        o.method();
    }
}
