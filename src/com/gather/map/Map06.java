package com.gather.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    集合嵌套之ArrayList嵌套HashMap:
        ArrayList集合储存HashMap元素并遍历
            需求: 创建一个ArrayList集合，储存三个元素，
            每一个元素都是HashMap,每一个HashMap的键和值都是String,并遍历
 */
public class Map06 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<>();

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("辉夜大小姐", "17");
        hm1.put("白银会长", "17");
        array.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();
        hm1.put("高木同学", "16");
        hm1.put("西片", "16");
        array.add(hm2);

        HashMap<String, String> hm3 = new HashMap<>();
        hm1.put("死死美", "18");
        hm1.put("不动", "20");
        array.add(hm3);
        // 遍历
        for (HashMap<String, String> hm : array) {
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }
//        System.out.println("---------");
//        for (HashMap<String,String> hm:array){
//            Set<Map.Entry<String, String>> entrySet = hm.entrySet();
//            for (Map.Entry<String, String> m:entrySet){
//                String key = m.getKey();
//                String value = m.getValue();
//                System.out.println(key+","+value);
//            }
//        }

    }
}

/*
    集合嵌套之HashMap嵌套ArrayList:
        HashMap集合储存ArrayList集合并遍历
            需求:创建一个HashMap集合，储存三个键值对元素，每一个键值对元素的键都是String,值是ArrayList,
            每一个ArrayList元素都是String,并遍历
 */
class Map061 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("诸葛亮");
        a1.add("赵云");
        hm.put("三国演义", a1);

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("唐僧");
        a2.add("孙悟空");
        hm.put("西游记", a2);

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("武松");
        a3.add("鲁智深");
        hm.put("水浒传", a3);

        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key + ":");
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
//                System.out.println(key);//会输出两次，所以放在上面
                System.out.println("\t" + s);
            }
        }
    }
}
