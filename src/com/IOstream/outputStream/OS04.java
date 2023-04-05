package com.IOstream.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据加入异常处理
 */
public class OS04 {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("D:\\杂文件\\IOText\\OS03.txt");
//            fos.write("hello".getBytes());
//            fos.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        // 加入finally来实现释放资源
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\杂文件\\IOText\\OS03.txt");
//            fos = new FileOutputStream("F:\\杂文件\\IOText\\OS03.txt");
            fos.write("hello,帅哥".getBytes());//FileNotFoundException
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();//NullPointerException
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
