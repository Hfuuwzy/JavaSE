
package com.IOstream.CharacterStream;

import java.io.*;

/*
    复制单级文件夹 
 */
public class CS07 {
    public static void main(String[] args) throws IOException {

//      总体思路拆解：  模块名 + 源数据目录 + 源数据文件

        // 创建数据源目录File对象，路径为D：\\xxx
        File srcFolder = new File("");
        // 获取数据源目录File对象的名称(xxx)
        String srcFolderName = srcFolder.getName();
        // 创建目的地目录File对象，路径名是模块名+srcFolderName组成
        File destFolder = new File("模块名(D)", srcFolderName);
        // 判断目的地对应的File是否存在，若不存在，就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        // 获取数据源目录下的所有文件的File数组(xx.txt,xx.java···)
        File[] listFiles = srcFolder.listFiles();
        // 遍历File数组，得到每一份个File，该File对象，其实就是数据源文件 (D:\\杂文件\\IOText\\A.txt)
        for (File srcFile : listFiles) {
            // 获取数据源文件的名称
            String srcFilename = srcFile.getName();
            // 创建目的地文件File对象，路径名是目的地目录+A.txt组成(D:\\xxx\\A.txt)
            File destfile = new File(destFolder, srcFilename);
            // 复制文件
            copyFile(srcFile, destfile);
        }
    }

    private static void copyFile(File srcFile, File destfile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destfile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }

}
/*
    复制多级文件夹
    需求：把 ”D:\\杂文件\\IOText“ 复制到 ”D:\\杂文件\\iotext
 */
class CS071{
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\杂文件\\IOText");
        File destFile = new File("D:\\杂文件\\Copy");
        // 复制文件夹方法
        copyFolder(srcFile,destFile);

    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if(srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if(!newFolder.exists()){
                newFolder.mkdir();
            }
            File[] listFiles = srcFile.listFiles();
            for(File file:listFiles){
                copyFolder(file,newFolder);
            }
        }else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read())!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}