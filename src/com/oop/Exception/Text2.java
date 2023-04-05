package com.oop.Exception;

public class Text2 {
    public static void main(String[] args) {
        try {
            new Text2().text(1,0);
        } catch (Exception e) {
            System.out.println("b不能为0");

        }//用了try catch 捕获异常，使得程序可以继续往下执行
        System.out.println("Hello,World!");
    }
    //假设这个方法中，处理不了这个异常。方法上抛出异常
    public void text(int a,int b) throws   ArithmeticException{
//        if(b==0){
//            throw new ArithmeticException();//主动抛出异常，一般在方法中使用
//        }
        System.out.println(a/b);
    }//实际上这是运行类异常，它自己就会抛出
}
