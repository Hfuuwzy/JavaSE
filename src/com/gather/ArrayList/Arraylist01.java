package com.gather.ArrayList;
import java.util.ArrayList;
//集合的学习
public class Arraylist01 {
    public static void main(String[] args) {
        //public ArrayList()构造一个初始容量为十的空列表。创建一个空的集合对象
        //ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<String>();
//        System.out.println(array);//[]

        //public boolean add(E e) 将指定的元素追加到此列表的末尾
//        System.out.println(array.add("hello"));//true
        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add(int index,E element)
        //在此列表中的指定位置插入指定的元素。 将当前位于该位置的元素（如果有）和任何后续元素（向其索引添加一个）移动
        array.add(1,"insert");
//        array.add(3,"ChaRu");//array:[hello, world, java, ChaRu]
//        array.add(4,"WW");//IndexOutOfBoundsException

        //输出集合
        System.out.println("array:"+array);




    }
}
