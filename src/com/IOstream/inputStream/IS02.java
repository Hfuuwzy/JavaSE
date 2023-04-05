package com.IOstream.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
    字节流复制文本文件
 */
public class IS02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\杂文件\\IOText\\IS01.txt");

        FileOutputStream fos = new FileOutputStream("D:\\杂文件\\IOText\\IS011.txt");

        int by;
        while((by = fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
