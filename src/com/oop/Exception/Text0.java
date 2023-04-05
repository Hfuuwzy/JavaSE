package com.oop.Exception;
/*

 */
public class Text0 {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("end");
    }

    public static void method(){
        try {
            int [] arr = {1,2,3} ;
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException("xxx")
        } catch (ArrayIndexOutOfBoundsException e) {//e 变成了一个对象

            //public String getMessage();返回此 throwable 的详细消息字符串
//            System.out.println(e.getMessage());//Array index is out of bounds

            //public String toString ():返回此可抛出的简短描述
//            System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: 3

            //public void printStackTrace();把异常的错误信息输出在控制台
          //  e.printStackTrace();
        }
    }
}
