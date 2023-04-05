package com.UsuallyClass.StringClass;
//拼接字符串
public class D {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        String s = arraytoString(arr);
        System.out.println(s);

    }

    public static String arraytoString(int [] arr){
        String s = "";
        s+="[";
        for (int i = 0; i < arr.length; i++) {
             if(i==arr.length-1){
                 s+=arr[i];
             }else{
                s+=arr[i];
                s+=", ";
             }
        }
        s+="]";
        return s;
    }


}
