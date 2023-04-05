package com.UsuallyClass.ObjectClass;

public class Student {//extends Object
     public String name;
     public int age;

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
        /*
            this   ----  s1
            o    ----  s2 两对对象
         */
        if (this == o) return true;   //比较地址值是否相等
        //判断参数是否为null
        //判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;  //向下转型，转为子类需要强转 student = s2
        //比较年龄是否相等
        if (age != student.age) return false;

        //比较姓名内容是否相等，用的是String类的equals方法，并返回boolean值
        return name != null ? name.equals(student.name) : student.name == null;
    }

//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
//        return result;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
