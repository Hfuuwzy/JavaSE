package com.oop.Feng;
//属性私有  get / set
//定义一个类   private 私有
public class Student {
    //属性私有
    private String name;
    private int age;
    private char sex;
    private int id;

    //提供一些可以操作这个属性的方法
    //提供一些public 的  get set 方法

    //get 获得这个数据
    public String getName() {
        return name;
    }

    //set 给这个数据设置值
    public void setName(String name ){
        this.name = name;
    }
    //alt + insert 自动生成


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 120 || age < 0){
            this.age = 3;   //乱输入，形容小屁孩思想
        }else{
        this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
