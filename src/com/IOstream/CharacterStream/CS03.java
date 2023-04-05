package com.IOstream.CharacterStream;

import java.io.*;

/*
    写数据的五种方式:
    读数据的两种方式:
 */
public class CS03 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\杂文件\\IOText\\OS01.txt"));
//        // 1、void write(int c): 写一个字符
//        osw.write(97);
//        osw.write(98);
//        osw.write(99);
//        //void flush() 刷新流
//        osw.flush();

        // 2、void write(char[] cbuf): 写一个字符数组
//        char[] chs = {'a', 'b', 'c', 'd', 'e'};
//        osw.write(chs);

        //  3、 void write(char[] cbuf, int off, int len)： 写入字符数组的一部分。
//        osw.write(chs,1,3);

        // 4、 void write(String str): 写一个字符串
//        osw.write("abcde");

        // 5、 void write(String str, int off, int len): 写一个字符串的一部分。
//        osw.write("abcde",1,3);

        //void close()关闭流，先刷新
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\杂文件\\IOText\\OS01.txt"));
        // 一次读一个字符数据
//        int ch;
//        while((ch = isr.read())!=-1){
//            System.out.print((char) ch);
//        }
        // 一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while((len = isr.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
        isr.close();
    }
}
