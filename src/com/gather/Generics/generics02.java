package com.gather.Generics;
/*
    泛型类
    java 中泛型标记符：

    E - Element (在集合中使用，因为集合中存放的是元素)
    T - Type（Java 类）
    K - Key（键）
    V - Value（值）
    N - Number（数值类型）
    ？ - 表示不确定的 java 类型
 */

/*
    创建一个泛型类
 */
public class generics02<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
/*
    测定类
 */
//通过一个类完成多个类的操作
class generics02Deom{
    public static void main(String[] args) {
        generics02<String> g1 = new generics02<>();
        g1.setT("冷冷");
        System.out.println(g1.getT());

        generics02<Integer> g2 = new generics02<>();
        g2.setT(18);
        System.out.println(g2.getT());

        generics02<Boolean> g3 = new generics02<>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
