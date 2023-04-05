package com.gather.ArrayList;
// 集合的常用方法
import java.util.ArrayList;
public class Arraylist02 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("hello");
        s.add("world");
        s.add("java");
        //1. public boolean remove(Object o) 删除指定元素，返回删除是否成功,出现相同元素则删除第一次出现的
//        s.remove("java");//[hello, world]
//        s.remove("javaee");//[hello, world, java]

        //2. public E remove(int index)删除该列表中指定位置的元素。将任何后续元素移动到左侧（从其索引中减去一个元素）。
//        System.out.println(s.remove(2));//java,[hello, world]
//        s.remove(4);//IndexOutOfBoundsException

        //3. public E set(int index,E element)用指定的元素替换此列表中指定位置的元素。
//        System.out.println(s.set(1,"dlrow"));//world,[hello, dlrow, java]

        //4. public E get(int index)返回此列表中指定位置的元素。
//        System.out.println(s.get(2));//java

        // 5. public int size()返回此列表中的元素数。
//        System.out.println(s.size());//3

        System.out.println(s);

    }
}
