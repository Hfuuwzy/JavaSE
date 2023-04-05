package com.gather.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//当你在使用迭代器的时候，迭代中，不允许使用集合的方法 ，改变集合的长度
/*
      遍历集合元素，如果有某个元素xx,我就新添加一个元素yy，请写代码实现；
 */
public class List03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String s = it.next();
//            if (s.equals("java")){
//                list.add("good");
//            }
//        }/*ConcurrentModificationException 并发修改异常:当不允许这样的修改时,
//        可以通过检测到对象的并发修改的方法来抛出此异常*/

        //使用get方法循环方式遍历来进行修改
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("java")){
                list.add("成功添加");
            }
            System.out.println(s);
        }
    }
}
/*
      final void checkForComodification() {
            if (modCount != expectedModCount)   //判断二者是否相同
                throw new ConcurrentModificationException();
                }
            }

       protected transient int modCount = 0;

       private class Itr implements Iterator<E> {
        int expectedModCount = modCount;
        }    //创建Itr这个类时会初始化二者相同，也就是在iterator创立的那一刻，
        modCount = expectedModCount

        public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
            }   简而言之就是使用add方法，modCount就会加一
        在iterator创立的那一刻，modCount = expectedModCount
        实际修改集合的次数等于预期修改集合的次数，在这之后，在修改集合，modCount+1，使得二者不相等，
        进而抛出  并发修改异常
        所以说  当在使用迭代器的时候，迭代中，不允许使用集合的方法 ，改变集合的长度
 */