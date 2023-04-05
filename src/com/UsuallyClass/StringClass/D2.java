package com.UsuallyClass.StringClass;
//拼接字符串升级版      节省空间此类方法
public class D2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        String s = arraytoString2(arr);
        System.out.println("s:"+s);
    }

    public static String arraytoString2(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
