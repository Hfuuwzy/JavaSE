package com.gather.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历(方式1)：
        1. 获取所有键的集合，用keySet()方法实现
        2. 遍历键的集合，获取到每一个键。用增强for实现
        3. 根据键去找值。用get(Object key)方法实现

 */
public class Map04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");

        Set<String> keySet = map.keySet();//获取所有键的集合
        for (String key :
                keySet) {
            String value = map.get(key);//根据键获取值
            System.out.println(key + "," + value);
        }
    }
}

/*
    Map集合的遍历(方式2):
        1. 获取所有键值对对象的集合
            Set<Map.Entry<K,V>> entrySet()：返回此地图中包含的映射的Set视图
            也就是获取所有键值对对象的集合
        2. 遍历键值对对象的集合，得到每一个键值对对象
            用增强for循环，得到每一个Map.Entry
        3. 根据键值对对象获取键和值
            用getKey()获取键
            用getValue()获取值

 */
class Map041 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // Map.Entry<String,String>相当于Set集合中的元素类型
        for (Map.Entry<String, String> m : entrySet) {
            String key = m.getKey();
            String value = m.getValue();
            System.out.println(key + "," + value);
        }
    }
}
