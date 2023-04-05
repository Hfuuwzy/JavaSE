package com.IOstream.file;

import java.io.File;

/*
    File类概述和构造方法
    File: 文件和目录路径名的抽象表示
        1.  文件和目录是可以通过File封装成对象的
        1. 对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已。
        它可以是存在的，也可以是不存在的
        将来是要通过具体的操作把这个路径的内容转换为具体存在的

    构造方法:
        public File(String pathname):
            通过将给定的路径名字符串转换为抽象路径名来创建新的File实例。 如果给定的字符串是空字符串，则结果是空的抽象路径名。

        public File(String parent,String child):
            从父路径名字符串和子路径名字符串创建新的File实例。

        public File(File parent,String child):
            从父抽象路径名和子路径名字符串创建新的File实例。

 */
public class File01 {
    public static void main(String[] args) {
        // public File(String pathname)
        File f1 = new File("D:\\杂文件\\Text.txt");
        System.out.println(f1);

        // public File(String parent,String child)
        File f2 = new File("D:\\杂文件", "Text.txt");
        System.out.println(f2);

        // public File(File parent,String child)
        File f3 = new File("D:\\杂文件");
        File f4 = new File(f3, "Text.txt");
        System.out.println(f4);

    }
}
