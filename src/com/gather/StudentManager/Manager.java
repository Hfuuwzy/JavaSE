package com.gather.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

//主界面
public class Manager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while( true){
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择: ");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            //思想:用swith-case跳转调用我们想要的方法，然后写出各个方法
            switch (line) {
                case "1":
//                    System.out.println("添加学生: ");
                    addStudent(students);
                    break;
                case "2":
//                    System.out.println("删除学生: ");
                    deleteStudent(students);
                    break;
                case "3":
//                    System.out.println("修改学生: ");
                    updateStudent(students);
                    break;
                case "4":
//                    System.out.println("查看所有学生: ");
                    findStudent(students);
                    break;
                case "5":
                    System.out.println("谢谢使用: ");
//                    break;
                    System.exit(0);//JVM退出
            }
        }
    }
    //添加学生
    /*
    public static void addStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号: ");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地址: ");
        String address = sc.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        students.add(s);
        System.out.println("添加学生成功");
    }

     */
    public static void addStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        String sid;//让sid在循坏外能被访问到
        //循环使用为了让程序能够回到这里
        while (true) {
            System.out.println("请输入学生学号: ");
            sid = sc.nextLine();
            boolean flag = isUse(students, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入:");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地址: ");
        String address = sc.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        students.add(s);
        System.out.println("添加学生成功");
    }
    //查询学生信息
    public static void findStudent(ArrayList<Student> students){
        if(students.size()==0){
            System.out.println("无信息，请先添加信息再查询");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getSid()+"\t\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除学生的学号:");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getSid().equals(sid)){
               index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("该学号不存在，请重新输入");
        }else{
            students.remove(index);
            System.out.println("删除学生成功！");
        }

    }
    //修改学生
    public static void updateStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生新姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地址:");
        String address = sc.nextLine();
        Student s = new Student();//创建一个新的对象
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        for (int i = 0; i <students.size(); i++) {
            Student ss = students.get(i);
            if (ss.getSid().equals(sid)){
                students.set(i,s);
                break;
            }
        }
        System.out.println("修改成功！");
    }
    //判断学生学号是否重复
    public static boolean isUse(ArrayList<Student>  students,String sid ){
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSid().equals(sid)){
                 flag = true;
                 break;
            }
        }

        return flag;
    }
}
