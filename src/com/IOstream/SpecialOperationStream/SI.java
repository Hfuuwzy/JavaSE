package com.IOstream.SpecialOperationStream;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;


/*
    标准输入流：
    public static final InputStream in“标准”输入流。
    该流已经打开，准备提供输入数据。 通常，该流对应于键盘输入或由主机环境或用户指定的另一个输入源。

 */

public class SI {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;
        // 读取的数据是我们键盘录入的数据
//        int by;
//        while ((by = is.read()) != -1) {
//            System.out.print((char) by);
//        }

        // 字符转换流(把字节流转换为字符流)
//        InputStreamReader isr = new InputStreamReader(is);
        // 实现一次读取一行的数据——>字符缓冲流
//        BufferedReader br = new BufferedReader(isr);
        // 一步写
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String s = br.readLine();
        System.out.println("你输入的字符串是： " + s);
        System.out.println("请输入一个整数： ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是： " + i);

        // 自己实现键盘录入数据太麻烦了，所以JAVA提供了一个类供我们使用
//        Scanner sc = new Scanner(System.in);
        //可以调用方法来实现录入各种类型的数据
    }
}
