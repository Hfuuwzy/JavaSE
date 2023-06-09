package com.Annotation.ReflectIon;

/*
     得到Class类的几种方式
 */
public class R2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Student();
        System.out.println("这个人是： " + p.name);

        // 方式一: 通过对象获得
        Class<? extends Person> c1 = p.getClass();
        System.out.println(c1.hashCode());

        // 方式二: forName获得
        Class<?> c2 = Class.forName("com.Annotation.ReflectIon.Student");
        System.out.println(c2.hashCode());

        // 方式三: 通过类名.class获得
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());

        // 方式四: 基本内置类型的包装类都有一个TYPE属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4);

        // 获得父类类型
        Class<?> c5 = c1.getSuperclass();
        System.out.println(c5);
//        System.out.println(c5.hashCode());

    }
}

class Person {
    String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}