package com.IOstream.CharacterStream;

import java.io.*;
import java.util.*;

/*
    集合到文件
 */
public class CS06 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        array.add("王朝阳");
        array.add("杨幂");
        array.add("冷冷");
        array.add("坤坤");
        array.add("你干嘛！");
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\CS03.txt"));
        for (String s : array) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}

/*
    文件到集合
 */
class CS061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\杂文件\\IOText\\CS03.txt"));
        ArrayList<String> arr = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            arr.add(line);
        }
        br.close();
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

/*
    随机点名器
 */
class CS062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\杂文件\\IOText\\CS03.txt"));
        ArrayList<String> array = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }
        br.close();
        Random rd = new Random();
        int index = rd.nextInt(array.size());
        String name = array.get(index);
        System.out.println(name);
    }
}

/*
    集合到文件改进版：
        把ArrayList集合中的学生数据写入到文本文件。要求：每一个学生对象的数据作为文件中的一行数据
 */
class CS063 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("坤坤", "001", "18", "鲲鹏窝"));
        students.add(new Student("蔡徐坤", "002", "两年半", "北京"));
        students.add(new Student("鸡哥", "003", "10", "姬窝"));
        students.add(new Student("太美", "004", "16", "ji你太美"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\CS03.txt"));
        for (Student student : students) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append(",").append(student.getId()).append(",").append(student.getAge()).append(",").append(student.getAddress());
            bw.write(sb.toString());
//            bw.write(student.getName() + "," + student.getId() + "," + student.getAge() + "," + student.getAddress());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
/*
    文件到集合改进版：
        把文本文件集合中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个学生对象的成员变量值
 */
class CS064{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("D:\\杂文件\\IOText\\CS03.txt"));
        ArrayList<Student> arr = new ArrayList<>();
        String line;
        while((line = br.readLine())!=null){
            String[] split = line.split(",");
            Student student = new Student();
            student.setName(split[0]);
            student.setId(split[1]);
            student.setAge(split[2]);
            student.setAddress(split[3]);
            arr.add(student);
        }
        br.close();

        for (Student s:arr){
            System.out.println(s.getName()+","+s.getId()+"."+ s.getAge()+","+s.getAddress());
        }
    }
}
/*
    集合到文件（数据排序改进版）
    需求：键盘录入五个学生信息（姓名，语文成绩，数学成绩，英语成绩） 要求按照成绩总分从高到低写入文本文件

 */
class CS065 {
    public static void main(String[] args) throws IOException{
        // 实现集合排序要求
        TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher s1, Teacher s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num==0 ? s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第"+(i+1)+"个学生信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();
            treeSet.add( new Teacher(name,chinese,math,english));
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\CS03.txt"));
        for (Teacher t:treeSet){
            bw.write(t.getName()+": 语文成绩："+t.getChinese()+", 数学成绩 :"+t.getMath()+", 英语成绩："+t.getEnglish()+"， 总分："+t.getSum());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
class Teacher {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Teacher() {
    }

    public Teacher(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    public int getSum(){
        return this.chinese+this.math+this.english;
    }
}
class Student {
    private String name;
    private String id;
    private String age;
    private String address;

    public Student() {

    }

    public Student(String name, String id, String age, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}