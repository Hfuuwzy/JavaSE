package com.gather.list;
/*
    public interface ListIterator<E> extends Iterator<E>
    用于允许程序员沿任一方向遍历列表的列表的迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置。
    List独有的迭代器方法
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("----------");
//        //boolean hasPrevious()  返回true如果遍历反向列表，列表迭代器有多个元素。
//        //previous()返回列表中的上一个元素，并向后移动光标位置。 可以反复调用此方法以向后方遍历列表，或者与调用next()进行混合来回。
//        while (lit.hasPrevious()){
//            String s = lit.previous();
//            System.out.println(s);
//        }
        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();//返回的对象
        /*public Iterator<E> iterator() {
                 return new ArrayList.Itr();
            }
        // private class ListItr extends Itr implements ListIterator<E>
        */
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("hello")){
                lit.add("添加成功");//void add(E e)将指定的元素插入列表（可选操作）。
            }
        }//lit.add()方法并不会 出现并发修改异常-->ConcurrentModificationException
        System.out.println(list);


    }
}
