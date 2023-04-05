package com.gather.set;

import java.util.Comparator;
import java.util.TreeSet;

/*
    用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历集合
    要求:按照总分从高到低出现
 */
public class TreeSet04 {
    public static void main(String[] args) {
        TreeSet<Sd> hs = new TreeSet<>(new Comparator<Sd>() {
            @Override
            public int compare(Sd s1, Sd s2) {
//                int i = s2.getcGrades()-s1.getcGrades();
//                int i2 = s2.getmGrades()-s1.getmGrades();
                int i = s2.getSum()-s1.getSum();
                int i2 = i==0 ? s2.getName().compareTo(s1.getName()):i;
                return i2;
            }
        });
        Sd s1 = new Sd("Emilia",80,93);
        Sd s2 = new Sd("Bob",83,90);
        Sd s3 = new Sd("YangMi",88,99);
        Sd s4 = new Sd("Tom",96,79);
        Sd s5 = new Sd("Jerry",97,79);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        for (Sd s :
                hs) {
            System.out.println(s.getName()+","+s.getcGrades()+","+s.getmGrades()+","+s.getSum());
        }

    }
}
/*
    Sd类
 */
class Sd{
    private String name;
    private int cGrades;
    private int mGrades;

    public Sd() {
    }

    public Sd(String name, int cGrades, int mGrades) {
        this.name = name;
        this.cGrades = cGrades;
        this.mGrades = mGrades;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }

    public int getcGrades() {
        return cGrades;
    }

    public void setcGrades(int cGrades) {
        this.cGrades = cGrades;
    }

    public int getmGrades() {
        return mGrades;
    }

    public void setmGrades(int mGrades) {
        this.mGrades = mGrades;
    }
    public int getSum(){
        return this.cGrades+this.getmGrades();
    }
}
