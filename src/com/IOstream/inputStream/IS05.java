package com.IOstream.inputStream;

import java.io.*;

/*
     字节流复制视频并且比较所用时长
 */
public class IS05 {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 复制视频方法
//        mothed1();//共耗时:44667毫秒
//        mothed2();//共耗时:61毫秒
//        mothed3();//共耗时:108毫秒
        mothed4();//共耗时:18毫秒
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("共耗时:" + (end - start) + "毫秒");
    }

    // 视频所在路径:C:\Users\王朝阳\Documents\Tencent Files\2639809653\FileRecv\MobileFile\sp.mp4
    // 目的路径:D:\杂文件\IOText\vedio\sp.mp4
    public static void mothed1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\王朝阳\\Documents\\Tencent Files\\2639809653\\FileRecv\\MobileFile\\sp.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\杂文件\\IOText\\vedio\\sp.mp4");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }

    public static void mothed2() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\王朝阳\\Documents\\Tencent Files\\2639809653\\FileRecv\\MobileFile\\sp.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\杂文件\\IOText\\vedio\\sp.mp4");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }

    public static void mothed3() throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:\\Users\\王朝阳\\Documents\\Tencent Files\\2639809653\\FileRecv\\MobileFile\\sp.mp4"));
        OutputStream fos = new BufferedOutputStream(new FileOutputStream("D:\\杂文件\\IOText\\vedio\\sp.mp4"));
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }

    public static void mothed4() throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:\\Users\\王朝阳\\Documents\\Tencent Files\\2639809653\\FileRecv\\MobileFile\\sp.mp4"));
        OutputStream fos = new BufferedOutputStream(new FileOutputStream("D:\\杂文件\\IOText\\vedio\\sp.mp4"));
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }
}
