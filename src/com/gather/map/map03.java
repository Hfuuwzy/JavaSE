package com.gather.map;

import java.util.*;//表示把这个包下的全部类导入到程序中。

/*
    Map集合的获取功能：

 */
public class map03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");

        // V get(Object key):根据键获取值
        System.out.println(map.get("杨过"));
        System.out.println(map.get("杨幂"));
        System.out.println("------------");
        // Set<K> keySet():获取所有键的集合
//        System.out.println(map.keySet());
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
        System.out.println("-----------");
        // Collection(V) values():获取所有值的集合
        Collection<String> values = map.values();
        for (String value :
                values) {
            System.out.println(value);
        }

    }
}
