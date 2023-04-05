package com.UsuallyClass.ObjectClass;
//Object的toString方法
/*
    查看源码方法CTRL+B
    建议所有子类重写toString方法
    自动生成即可alt+ins
    使得输出的对象可以看得懂
 */
public class toString {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "薇尔莉特";
        student.age = 16;
        System.out.println(student);//com.UsuallyClass.ObjectClass.Student@1b6d3586
        System.out.println(student.toString());//com.UsuallyClass.ObjectClass.Student@1b6d3586
        student.setName("艾米利亚");
        student.setAge(16);
        System.out.println(student.getName()+student.getAge());

    }
}
