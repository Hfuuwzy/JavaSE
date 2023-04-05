package com.IOstream.file;

import java.io.File;
import java.io.IOException;

/*
    File类删除功能:
        public boolean delete(): 删除由此抽象路径名表示的文件或目录
    绝对路径和相对路径的区别:
        绝对路径:完整的路径名，不需要任何其他信息就可以定位出它所表示的文件。例如:D:\\itcast\\java.txt
        相对路径:必须使用取自其他路径名的信息进行解释。例如：myFile\\java.txt
    删除目录时的注意事项:
        如果一个目录中有内容（目录，文件），不能直接删除。应该先删除目录中的内容，最后才能删除目录
 */
public class File04 {
    public static void main(String[] args) throws IOException {
        // 需求1：在当前模块目录下创建java.txt文件

//        File f1 = new File("D:\\杂文件\\IOText\\javaa.txt");

        /* **D:\杂文件\IOText**这是相对路径所相对的原路径，从edit configurations里的working directory可以编辑这个路径
        我简称为原路径也就是当前目录，在此基础上，再次创造出的路径都是相对于它，也就是说它可以对相对路径名进行信息解释
        为此我修改当前目录，它会在这个当前模块工作目录里创建File,而不是此IDEA项目模块里
         */
        File f1 = new File("D:\\javaCode\\基础语法\\javaa.txt");
//        System.out.println(f1.createNewFile());
        // 需求2：删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());
        System.out.println("---------");

        // 需求3：在当前模块目录下创建itcast目录
        File f2 = new File("D:\\javaCode\\基础语法\\itcast");
//        System.out.println(f2.mkdir());
        // 需求4：删除当前模块目录下的itcast目录
        System.out.println(f2.delete());
        System.out.println("----------");

        //需求5：在当前模块下创建一个目录itcast,然后 在该目录下创建一个文件java.txt
        File f3 = new File("D:\\javaCode\\基础语法\\itcast");
//        System.out.println(f3.mkdir());
        File f4 = new File("D:\\javaCode\\基础语法\\itcast\\java.txt");
//        System.out.println(f4.createNewFile());
        // 需求6：删除当前模块目录下的itcast
        System.out.println(f4.delete());
        System.out.println(f3.delete());

    }
}
