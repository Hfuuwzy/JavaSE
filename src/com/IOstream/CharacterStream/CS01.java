package com.IOstream.CharacterStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    为什么会出现字符流?
        由于字节流操作中文不是特别的方便,所以java提供了字符流
         字符流 =  字节流 + 编码表
    汉字在储存的时候,无论选择哪种编码储存,第一个字节都是负数
    字节流 读文本文件数据
    一个汉字储存:
        如果是GBK编码,占用2个字节
        如果是UTF-8编码,占用3个字节
 */
public class CS01 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("D:\\杂文件\\IOText\\IS01.txt");
//        int by;
//        while ((by = fis.read())!=-1){
//            System.out.print((char)by);
//        }
//        fis.close();
//        String s = "abc";//[97, 98, 99]

        //编码
        String s = "中国";
//        byte[] bys = s.getBytes();
//        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

        //解码
//        String ss= new String(bys);
//        String ss= new String(bys,"UTF-8");
        String ss= new String(bys,"GBK");

        System.out.println(ss);

    }
}
