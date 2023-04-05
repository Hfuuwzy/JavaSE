package com.IOstream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    需求：把文件中的内容读取出来在控制台输出
    FileInputStream：从文件系统中的文件获取 输入字节
    public FileInputStream(String name)throws FileNotFoundException
    通过打开与实际文件的连接创建一个FileInputStream文件，该文件由文件系统中的路径名name命名。
    使用字节输入流读数据的步骤：
        1. 创建字节输入流对象
        2. 调用字节输入流对象的读数据方法
        3. 释放资源
 */
public class IS01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\杂文件\\IOText\\IS01.txt");
        // 1、 字节流读数据（一次读一个字节数据）
        // int read():从该输入流读取一个字节的数据
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
//        // 第二次读取
//        by = fis.read();
//        System.out.println((char) by);
//
//        by = fis.read();
//        System.out.println((char) by);
//
//        by = fis.read();
//        System.out.println((char) by);
//        int by;
//        while((by=fis.read())!=-1){
//            System.out.print((char)by);
//        }

        // 2、 字节流读数据（一次读一个字节数组数据）
//        //public int read(byte[] b)throws IOException从该输入流读取最多b.length字节的数据到字节数组。
//        byte[] bys =  new byte[20];
//        // 第一次读取
//        int len = fis.read(bys);
//        System.out.println(len);// 读取的长度
//        // public String(byte[] bytes)通过使用平台的默认字符集解码指定的字节数组来构造新的String
////        System.out.println(new String(bys));// 读取的len长度字节数组数据装换为String
    /*
        public String(byte[] bytes,int offset,int length)
        通过使用平台的默认字符集解码指定的字节子阵列来构造新的String 。
        使得读取多少输出多少
    */
//        System.out.println(new String(bys,0,len));
//
//        len = fis.read(bys);
//        System.out.println(len);
////        System.out.println(new String(bys));
//        System.out.println(new String(bys,0,len));
//        // \r\n算为两个读取到的字节 gklmn \r\n opq
        // 最终格式
        byte[] bys = new byte[1024];// 通常为1024的整数倍
        int len;
        while ((len = fis.read(bys))!=-1){
            System.out.print(new String(bys,0,len) );
        }
        fis.close();
    }
}
