package com.IOstream.file;

import java.io.File;

/*
    File类的判断和获取功能
 */
public class File03 {
    public static void main(String[] args) {
        // public boolean isDirectory(): 测试此抽象路径名表示的 File 是否为目录。
        // public boolean isFile(): 测试此抽象路径名表示的 File 是否为文件。
        // public boolean exists(): 测试此抽象路径名表示的 File 是否存在。
        File f = new File("D:\\javaCode\\基础语法\\src\\com\\IOstream\\file\\java.txt");
//        File f = new File("D:\\杂文件\\IOText");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println("----------");

        // public String getAbsolutePath(): 返回此抽象路径名的绝对路径名字符串。
        // public File getAbsoluteFile(): 返回此抽象路径名的绝对形式。
        // public String getName(): 返回由此抽象路径名表示的文件或目录的名称。
        // public String getPath(): 将此抽象路径名转换为路径名字符串。
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("----------");

        // public String[] list(): 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
        // public File[] listFiles(): 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File f2 = new File("D:\\杂文件\\IOText");
        String[] strArray = f2.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("----------");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
//            System.out.println(file);
//            System.out.println(file.getName()); //返回由此抽象路径名表示的文件或目录的名称
            // 因为返回的是File对象,所以能调用方法判断
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
