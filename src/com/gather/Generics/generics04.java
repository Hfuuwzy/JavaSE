package com.gather.Generics;
/*
    泛型接口
 */
public interface generics04<T> {
    void show(T t);
}
/*
    泛型接口实现类
 */
class generics04Imp <T> implements generics04<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
/*
    测试类
*/
class generics04Demo{
    public static void main(String[] args) {
        generics04<String> g1 = new generics04Imp<>();
        g1.show("杨幂");

        generics04<Integer> g2 = new generics04Imp<>();
        g2.show(17);
    }
}

