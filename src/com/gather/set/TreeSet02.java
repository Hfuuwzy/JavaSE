package com.gather.set;
/*
    用TreeSet集合存储自定义对象， 无参构造方法使用的是 自然排序 对元素进行排序的
    自然排序，就是 让元素所属的类实现Comparator接口，重写compareTo（T 0） 方法
     重写方法时，一定要注意排序规则 必须按照要求的主要条件和次要条件来写
 */

import java.util.TreeSet;

/*
    自然排序Comparator的使用
    存储学生对象并遍历，创建集合使用无参构造方法
    要求:按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSet02 {
    public static void main(String[] args) {
        TreeSet<Star> ts = new TreeSet<>();
        Star s1 = new Star("xishi",22);
        Star s2 = new Star("diaochan",19);
        Star s3 = new Star("wangzhaojun",18);
        Star s4 = new Star("yangyuhuan",20);
        Star s5 = new Star("yangmi", 19);
        Star s6 = new Star("huge", 20);
        Star s7 = new Star("yangmi", 19);//能够去除重复元素

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        for (Star s :
                ts) {
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
/*
    学生类
    Interface Comparable<T>:该接口对实现它的每个类的对象强加一个整体排序。
    这个排序被称为类的自然排序 ，类的compareTo方法被称为其自然比较方法 。
 */
class Star implements Comparable<Star>{
    private String name ;
    private int age;

    public Star() {
    }

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Star s) {
//        return 0;//返回0认为是重复元素，不添加
//        return 1;//返回正数按照升序来存储
//        return -1;//返回负数，按照降序来存储
        //按照年龄大小来排序
        int i = this.age - s.age;//this相当于后一个元素，s是前一个元素，升序
//        int i = s.age - this.age;//降序排列

        //年龄相同时，按照姓名的字母顺序排序
        int i2 = i == 0 ? this.name.compareTo(s.name) : i;
        return i2;

    }
}
