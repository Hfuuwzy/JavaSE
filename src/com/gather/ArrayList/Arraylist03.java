package com.gather.ArrayList;

import java.util.ArrayList;

//ArrayList存储字符串并遍历
public class Arraylist03 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("我");
        s.add("是");
        s.add("大");
        s.add("帅");
        s.add("哥");
        //遍历字符串通用格式
        for (int i = 0; i < s.size(); i++) {
            String ss = s.get(i);
            System.out.println(ss);
        }
    }
}
