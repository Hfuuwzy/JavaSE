package com.gather.set;

import java.util.HashSet;

/*
    HashSet集合存储老师对象并遍历
    要求:老师对象的成员变量值相同， 我们就认为是同一个对象
 */
public class HashSet02 {
    public static void main(String[] args) {
        HashSet<Teacher> hs = new HashSet<>();
        Teacher te1 = new Teacher("杨幂",18);
        Teacher te2 = new Teacher("胡歌",19 );
        Teacher te3 = new Teacher("叶问",19 );
        /*
            HashSet的底层数据结构是哈希表，哈希表依赖于两个方法：
            hashCode()和equals()
            所以 class Teacher 需要重写这两个方法
            alt+ins生成选择
         */
        Teacher te4 = new Teacher("叶问",19 );
        hs.add(te1);
        hs.add(te2);
        hs.add(te3);
        hs.add(te4);
        for (Teacher t:hs){
            System.out.println(t.getName()+","+t.getAge());
        }

    }
}

class Teacher{
    private String name;
    private int age;

    public Teacher() {
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

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (age != teacher.age) return false;
        return name != null ? name.equals(teacher.name) : teacher.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
