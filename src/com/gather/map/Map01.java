package com.gather.map;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合概述:
        java.util
        Interface Map<K,V> K:键的类型  V:值的类型
        将键映射到值的对象。 地图不能包含重复的键; 每个键可以映射到最多一个值。

    创建Map集合的对象
        多态的方式
        具体的实现类  HashMap
 */
public class Map01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        //V put(K key,V value)将指定的值与该映射中的指定键相关联（可选操作）。如果映射先前包含了密钥的映射，则旧值将被指定的值替换。
        map.put("001", "哦哦");
        map.put("002", "哈哈");
        map.put("003", "嘿嘿");
        map.put("003", "哦哦");
        System.out.println(map);
    }
}
