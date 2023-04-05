package com.gather.Ollectionc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Collection集合存储学生对象并遍历
 */
public class CollectionStudent {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();
        //创建三个学生对象
        Student s1 = new Student();
        s1.setName("杨幂");
        s1.setAge(18);
        Student s2 = new Student();
        s2.setName("胡歌");
        s2.setAge(17);
        Student s3 = new Student();
        s3.setName("冷冷");
        s3.setAge(19);
        Student s4 = new Student("高桥李依",18);
        //把学生对象存储到集合中
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        //集合的遍历
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println("学生的姓名是"+s.getName()+"\t"+"学生的年龄是"+s.getAge());
        }


    }
}
