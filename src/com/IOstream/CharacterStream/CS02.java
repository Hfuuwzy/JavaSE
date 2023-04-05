package com.IOstream.CharacterStream;

import java.io.*;

/*
    转换流
    字符流中的编码解码问题:
        public class InputStreamReader extends ReaderInputStreamReader 是从字节流到字符流的桥：
        它读取字节，并使用指定的charset将其解码为字符 。
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。

        public class OutputStreamWriter extends WriterOutputStreamWriter 是从字符流到字节流的桥梁：
        使用指定的编码将写入的字符编码为字节
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集。
 */
public class CS02 {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
        //OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\杂文件\\IOText\\CS01.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\杂文件\\IOText\\CS01.txt"),"UTF-8");
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\杂文件\\IOText\\CS01.txt"),"GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\杂文件\\IOText\\CS01.txt"));
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\杂文件\\IOText\\CS01.txt"),"GBK");
        // 一次读取一个 字符数据
//        int ch;
//        while((ch = isr.read())!=-1){
//            System.out.print((char) ch);
//        }
        // 一次读取一个字节数组数据
        char [] chars = new char[1024];
        int len;
        while((len = isr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        isr.close();
    }
}
