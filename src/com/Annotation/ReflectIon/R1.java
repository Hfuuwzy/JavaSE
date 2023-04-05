package com.Annotation.ReflectIon;

/*
    获取反射对象
 */
public class R1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的Class对象,一个类在一个内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        //static 类<?> forName(String className) 返回与给定字符串名称的类或接口相关联的 类对象。
        Class<?> c1 = Class.forName("com.Annotation.ReflectIon.User");
        System.out.println(c1);


    }
}

// 实体类：pojo,entity
class User {
    private String name;
    private int age;
    private int id;

    public User() {
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
    private void test(){}
    public void show(){
        System.out.println("show方法被调用");
    }
}
