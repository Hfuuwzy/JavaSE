package com.gather.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
    List存储学生对象并用三种方法遍历
 */
public class List05 {
    public static void main(String[] args) {
        Student s1 = new Student("杨幂",18);
        Student s2 = new Student("胡歌",17);
        Student s3 = new Student("冷冷",19);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ListIterator<Student> lit = students.listIterator();
        while(lit.hasNext()){
            Student s = lit.next();
            System.out.println(s.getName()+s.getAge());
        }
        System.out.println("-----------");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getName()+s.getAge());
        }
        System.out.println("-----------");

        for (Student s :
                students) {
            System.out.println(s.getName()+s.getAge());
        }
    }
}
