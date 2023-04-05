package com.IOstream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutStream.:文件输出流用于将数据写入File
        FileOutStream(String name):创建文件输出流以指定的名称写入文件
 */
public class OS01 {
    public static void main(String[] args) throws IOException {
        // 创建字节流输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\杂文件\\IOText\\fos.txt");
        /*
             做了三件事：
                A：调用系统功能创建了文件夹
                B：创建了字节输出流对象
                C：让字节输出流对象指向创建好的文件
        */
        fos.write(97);
        fos.write(98);
        fos.write(55);
        // 最后都要释放资源
        // public void close() throws IOException:关闭此输出流并释放与此流相关联的任何系统资源。 close的一般合同是关闭输出流。
        fos.close();
    }
}
