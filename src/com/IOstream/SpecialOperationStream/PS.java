package com.IOstream.SpecialOperationStream;

import java.io.*;

/*
    打印流：
        字节打印流：PrintStream
        字符打印流：PrintWriter
    特点：
        只负责输出数据，不负责读取数据
        有自己的特有方法
 */
public class PS {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("D:\\杂文件\\B.txt");
        // 使用继承父类的方法写数据，查看的时候会转码；
        ps.write(97);
        ps.write(98);
        // 使用自己特有的方法写数据，查看的数据原样输出
        ps.println(98);
        ps.println(97);
        ps.close();
    }
}
/*
    字符打印流：
    构造方法：
    PrintWriter(String fileName)
        使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新。

    public PrintWriter(Writer out boolean autoFlush)创建一个新的PrintWriter。
        out - 字符输出流  autoFlush - 一个布尔值 如果为真，则println，printf，或format方法将刷新输出缓冲区
 */

class PS01{
    public static void main(String[] args) throws IOException{
//        PrintWriter pw = new PrintWriter("D:\\杂文件\\IOText\\B.txt");
//        pw.write("Hello");
//        pw.write("\r\n");
//        pw.flush();
//        pw.write("world");
//        pw.write("\r\n");
//        pw.flush();
//        pw.println("java");
//        pw.flush();

        PrintWriter pww = new PrintWriter(new FileWriter("D:\\杂文件\\IOText\\B.txt"), true);
        pww.write("HELLO");
        pww.write(97);
        pww.write("\r\n");
        pww.println("WORLD");
        pww.println("JAVA");
        pww.close();
    }
}
/*
    复制Java文件(打印流改进版)
 */
class ps02{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("D:\\javaCode\\Exercises\\src\\com\\GUIText\\Text01.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\杂文件\\IOText\\cs.java"), true);
        String line;
        while((line = br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}