package com.gather.set;
/*
    哈希值：
         是jdk根据对象的地址或者字符串或者数字算出来的int类型的数值

        Object类中有一个方法可以获取对象的哈希值
        public int hashCode():返回对象的哈希值
 */
public class HashValue {
    public static void main(String[] args) {
        Student s1 = new Student("杨幂",18);
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode());//460141958
        System.out.println(s1.hashCode());//460141958
        System.out.println("---------");
        Student s2 = new Student("冷冷",19);
        //默认 情况下，不同对象的哈希值是不相同的
        //但是，通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());//1163157884
        System.out.println("---------");
        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("hello".hashCode());//99162322  同一个对象的哈希值相同
        System.out.println("------------");
        System.out.println("我是".hashCode());//804414
        System.out.println("帅哥".hashCode());//767872
        //字符串重写了hashCode方法
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395


    }
}
/*
    学生类
 */
class Student{
    private String name;
    private int age ;

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

    //重写hashCode方法
    @Override
    public int hashCode() {
        return 0;
    }
}
