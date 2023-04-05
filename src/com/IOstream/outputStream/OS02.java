package com.IOstream.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据的3种方式
 */
public class OS02 {
    public static void main(String[] args) throws IOException {
        // 两种构造方法的区别
        // public FileOutputStream(String name) throws FileNotFoundException:创建文件输出流以指定的名称写入文件。
        FileOutputStream fos = new FileOutputStream("D:\\杂文件\\IOText\\OS01.txt");
        // new File(name)     
//        FileOutputStream fos = new FileOutputStream(new File("D:\\杂文件\\IOText\\OS01.txt"));

        // public FileOutputStream(File file) throws FileNotFoundException:创建文件输出流以写入由指定的File对象表示的文件。
//        File file = new File("D:\\杂文件\\IOText\\OS01.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
//        FileOutputStream fos2 = new FileOutputStream(new File("D:\\杂文件\\IOText\\OS01.txt"));

        //public void write(int b)
        //           throws IOException 将指定的字节写入此文件输出流。
        fos.write(88);
        fos.write(89);
        fos.write( 90);

        //public void write(byte[] b)
        //           throws IOException 将 b.length字节从指定的字节数组写入此文件输出流。
        /*
            public byte[] getBytes():使用平台的默认字符集将此String编码为字节序列，将结果存储到新的字节数组中。
         */
//        byte[] bys = {97, 98, 99, 100, 101};
        byte[] bys = "abcde".getBytes();
//        fos.write(bys);
        //public void write(byte[] b,int off,int len)
        //           throws IOException 从位于偏移量 off的指定字节数组写入 len字节到该文件输出流。
        fos.write(bys,0,3);
        fos.close();
    }
}
