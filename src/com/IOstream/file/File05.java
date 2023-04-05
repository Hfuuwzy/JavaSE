package com.IOstream.file;

import java.io.File;

/*
    遍历目录
    给定一个路径，请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
 */
public class File05 {
    public static void main(String[] args) {
//        File srcFile = new File("D:\\杂文件\\IOText");
        File srcFile = new File("D:\\杂文件");
        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile) {
        // 获取给定的file目录下所有的文件或者目录下的File数组
        File[] fileArr = srcFile.listFiles();
        // 遍历File数组，得到每一个file对象
        if (fileArr != null) {
            for (File file :
                    fileArr) {
                // 判断该file对象是否是目录
                if (file.isDirectory())
                    // 是，递归调用，相当于文件剥层
                    getAllFilePath(file);
                else
                    // 返回绝对路径输出在控制台
                    System.out.println(file.getAbsoluteFile());
            }
        }
    }
}

