package com.gather.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
    统计字符串中每个字符出现的次数
        需求: 键盘录入一个字符串,要求统计字符串中每个字符出现的次数。
        举例: 键盘录入:"aababcabcdabcde"
        在控制台输出: “a(5)b(4)c(3)d(2)e(1)”
 */
public class Map07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer in = hm.get(c);
            //boolean containsKey(Object key)

            if (in == null){
                hm.put(c,1);
            }else{
                in++;
                hm.put(c,in);
            }
        }
        Set<Character> keySet = hm.keySet();
        for (Character c:keySet){
            Integer integer = hm.get(c);
            System.out.print(c+"("+integer+")");
        }
    }
}
