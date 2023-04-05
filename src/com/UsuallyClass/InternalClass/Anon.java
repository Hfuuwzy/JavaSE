package com.UsuallyClass.InternalClass;
/*
    匿名内部类；
    前提:
        存在一个类或者接口
        这里的类可以是具体类，也可以是抽象类
    格式:
        写在方法里
        new 类名或者接口(){
            重写方法
        };
    本质是什么呢？
        是一个继承了该类或者实现了该接口的子类匿名 对象
 */
public class Anon {
    public void show(){
//         new Inter(){
//             @Override
//             public void show() {
//                 System.out.println("匿名内部类");
//             }
//         };

//        new Inter(){
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        }.show();//对像的调用

//        Inter inter = new Inter() {//多态的方式，inter是这个接口的实现类对象
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        };
//        inter.show();
//        inter.show();
    }
}
/*
    测试类
 */
class AppAnon{
    public static void main(String[] args) {
        Anon a = new Anon();
        a.show();
        eat(new Inter(){
            public void show(){
                System.out.println("bb");
            }
        });
        eat(()-> System.out.println("aa"));
    }
    public static void eat(Inter in){
        in.show();
    }
}
/*
    具体类
 */
class Animal{
    public void eat(){
        System.out.println("猫咪吃肉");
    }
}
/*
    接口
 */
interface Inter{
    void show();
}
