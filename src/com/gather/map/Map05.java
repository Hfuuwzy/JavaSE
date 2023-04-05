package com.gather.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    创建一个HashMap集合，键是学生对象(Student),值是居住地(String)。
    储存多个键值对元素，并遍历。
    要求保证键的唯一性:如果学生对象的变量值相同，我们就认为是同一个对象。
    PS：保证键的唯一性 : 重写equals()和hashCode()方法
    重写hashcode和equals方法:
    https://blog.csdn.net/u012557538/article/details/89861552
 */
public class Map05 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("Bob", 18);
        Student s2 = new Student("Tom", 18);
        Student s3 = new Student("John", 19);
        Student s4 = new Student("John", 19);
        map.put(s1, "美国");
        map.put(s2, "英国");
        map.put(s3, "中国");
        map.put(s4, "澳大利亚");
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
        System.out.println("--------------");
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        for (Map.Entry<Student, String> m : entrySet) {
            Student key = m.getKey();
            String value = m.getValue();
            System.out.println(key.getName() + "," + key.getAge() + "," + value);

        }
    }
}

/*
    需求:
    创建一个HashMap集合，键是学号(String),值是对象(Student)。存储三个键值对对象并遍历
 */
class Map051 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Student s1 = new Student("Tom", 19);
        Student s2 = new Student("Bob", 16);
        Student s3 = new Student("John", 18);
//        Student s4 = new Student("John", 100);
        map.put("001", s1);
        map.put("002", s2);
        map.put("003", s3);
//        map.put("003",s4);
        // 键找值遍历
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Student value = map.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        System.out.println("--------");
        // 键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> m : entrySet) {
            String key = m.getKey();
            Student value = m.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}