package com.UsuallyClass.BasicPacking;
//字符串中的数据排序
import java.util.Arrays;

//字符串中的数据排序
public class SortString {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        //public String[] spilt (String regex)方法，根据字符串内来分隔
        String[] split = s.split(" ");//把一个字符串分隔为多个字符串
        int[] arr = new int[split.length];//声明一个新的数组，长度等于字符串长度
        //把String[]中的每一个元素存储到 int 数组中
        for (int i = 0; i < arr.length; i++) {
            arr [i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);//调用Arrays类中的sort方法进行排序
        StringBuilder sb = new StringBuilder();
        //把排序后的int数组中的元素进行拼接得到一个字符串
        for (int i = 0; i < arr.length; i++) {
            if(i==args.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result  = sb.toString();//StringBuilder转换为String
        System.out.println(result);


    }

}

