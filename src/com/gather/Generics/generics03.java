package com.gather.Generics;
/*
    泛型方法
 */
public class generics03 <T>{
//    public void show(String s){
//        System.out.println(s);
//    }
//
//    public void show(Integer i){
//        System.out.println(i);
//    }
//
//    public void show(Boolean flag){
//        System.out.println(flag);
//    }
    //泛型类的泛型方法 改进
    public void show(T t){
        System.out.println(t);
    }
}

/*
    测试类
 */
class generics03Demo{
    public static void main(String[] args) {
//        generics03 g = new generics03();
//        g.show("杨幂");
//        g.show(18);
//        g.show(false);
//        System.out.println("--------");
        generics03<String> g1 = new generics03<>();
        g1.show("杨幂");

        generics03<Integer> g2 = new generics03<>();
        g2.show(18);

        generics03<Boolean> g3 = new generics03<>();
        g3.show(true);


    }
}
