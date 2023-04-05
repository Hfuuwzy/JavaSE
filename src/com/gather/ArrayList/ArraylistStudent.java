package com.gather.ArrayList;

import java.util.ArrayList;

//存储学生对象并遍历
public class ArraylistStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("周星驰",20);
        Student s2 = new Student("周杰伦",22);
        Student s3 = new Student("周润发",24);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (int i = 0; i < students.size(); i++) {
            Student   s = students.get(i);
            System.out.println(s.getName()+","+s.getAge());

        }
    }
}
