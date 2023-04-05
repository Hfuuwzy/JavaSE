package com.IOstream.inputStream;

import java.io.*;

/*
     字节缓冲流
     public class BufferedOutputStream extends FilterOutputStream 该类实现缓冲输出流。
     通过设置这样的输出流，应用程序可以向底层输出流写入字节，而不必为写入的每个字节导致底层系统的调用。
     public class BufferedInputStream extends FilterInputStreamA BufferedInputStream
     当创建BufferedInputStream时，将创建一个内部缓冲区数组。
     当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次有多个字节。
 */
public class IS04 {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\杂文件\\IOText\\HC.txt"));
//        bos.write("Hello\r\n".getBytes());
//        bos.write("World\r\n".getBytes());
//        bos.write("这是汉字\r\n".getBytes());

        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream("D:\\杂文件\\IOText\\HC.txt"));
//        int by;
//        while ((by=bis.read())!=-1){
//            System.out.print((char)by);
//        }
        byte [] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
        bis.close();
//        bos.close();
    }
}
