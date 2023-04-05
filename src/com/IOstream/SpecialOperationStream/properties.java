package com.IOstream.SpecialOperationStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    Properties简述：
    public class Properties extends Hashtable<Object,Object>Properties类表示一组持久的属性。
        是一个Map体系的集合类
        Properties可以保存到流中或从流中加载
 */
/*
    Properties作为Map集合的使用
 */
public class properties {
    public static void main(String[] args) {
        Properties prop = new Properties();// 注意，不能加泛型
        prop.put(1,"坤坤");
        prop.put(2,"鸡哥");
        prop.put(3,"蔡徐坤");
        Set<Object> keySet = prop.keySet();
        for(Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
/*
    Properties作为集合的特有方法
 */
class properties01{
    public static void main(String[] args) {
        Properties prop = new Properties();
        // Object setProperty(String key, String value) 致电 Hashtable方法 put 。
        prop.setProperty("001","鸡哥");
        prop.setProperty("002","坤坤");
        prop.setProperty("003","太美");
//        System.out.println(prop);
        // String getProperty(String key) 使用此属性列表中指定的键搜索属性。
//        System.out.println(prop.getProperty("001"));
        //Set<String> stringPropertyNames() 返回此属性列表中的一组键，其中键及其对应的值为字符串
        Set<String> names = prop.stringPropertyNames();
        for(String key:names){
//            System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }
    }
}
/*
    Properties与IO流结合的方法
 */
class properties02{
    public static void main(String[] args) throws IOException {
//        myStore();
        myLoad();
    }
    // 把文件中的数据加载到集合
    private static void myLoad() throws IOException{
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\杂文件\\IOText\\Prop.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);

    }

    // 把集合中的数据保存到文件
    private static void myStore() throws IOException {
        Properties prop = new Properties();
        FileWriter fw = new FileWriter("D:\\杂文件\\IOText\\Prop.txt");
        prop.setProperty("001","鸡哥");
        prop.setProperty("002","坤坤");
        prop.setProperty("003","太美");
        prop.store(fw,null);
        fw.close();
    }
}