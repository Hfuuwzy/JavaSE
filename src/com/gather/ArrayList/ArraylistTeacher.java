package com.gather.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//存储 xx 对象并遍历升级版
public class ArraylistTeacher {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        addTeacher(teachers);
        addTeacher(teachers);
        addTeacher(teachers);//调用了三次方法
        for (int i = 0; i < teachers.size(); i++) {
            Teacher tt = teachers.get(i);
            System.out.println(tt.getName()+","+tt.getAge());
        }
    }
    // 提高代码的复用性，用方法来改进程序
    public static void addTeacher(ArrayList<Teacher> teachers ){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入老师姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入老师年龄: ");
        String age = sc.nextLine();
        Teacher t = new Teacher();
        t.setName(name);
        t.setAge(age);
        teachers.add(t);
    }
}
