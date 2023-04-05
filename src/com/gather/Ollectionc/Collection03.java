package com.gather.Ollectionc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Iterator:迭代器，集合的专用遍历方式
        Iterator<E>iterator():返回此集合元素的迭代器，通过集合的iterator()方法得到
        迭代器是通过集合的iterator()方法得到的，所以我们说他是依赖集合而存在的

    Iterator中的常用方法:
        E next():返回迭代中的下一个元素
        boolean hasnext():如果迭代具有更多元素，则返回true

 */
public class Collection03 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");

        // Iterator<E>iterator():返回此集合元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> itr = c.iterator();//返回的是Iterator<E>的implements类Itr的对象
        /*
            public Iterator<E> iterator() {
                return new Itr();
            }
            private class Itr implements Iterator<E> {
            ......
            }
         */
        // E next():返回迭代中的下一个元素
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());//NoSuchElementException表示被请求的元素不存在。
        while(itr.hasNext()){
//            System.out.println(itr.next());
            String s = itr.next();//我们可能会对s这个对象再次进行操作
            System.out.println(s);
        }
    }
}
