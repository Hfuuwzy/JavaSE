package com.IOstream.CharacterStream;

import java.io.*;
/*
    复制java文件 和改进
 */
public class CS04 {
    public static void main(String[] args) throws IOException {
        //1
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\javaCode\\Exercises\\src\\com\\GUIText\\Text01.java"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\杂文件\\IOText\\cs.java"));
////        int ch;
////        while((ch= isr.read())!=-1){
////            osw.write(ch);
////        }
//        char[] chs = new char[1024];
//        int len;
//        while((len = isr.read(chs))!=-1){
//            osw.write(chs,0,len);
//        }
//        isr.close();
//        osw.close();

        //2
//        // 根据数据源创建字符输入流对象
//        FileReader fr = new FileReader("D:\\javaCode\\Exercises\\src\\com\\GUIText\\Text01.java");
//        // 根据目的地创建字符输出流对象
//        FileWriter fw = new FileWriter("D:\\杂文件\\IOText\\cs.java");
//        char[] chs = new char[1024];
//        int len;
//        while((len = fr.read(chs))!=-1){
//            fw.write(chs,0,len);
//        }
//        fr.close();
//        fw.close();

        //3
        BufferedReader br = new BufferedReader(new FileReader("D:\\javaCode\\Exercises\\src\\com\\GUIText\\Text01.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\cs.java"));
        String line;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
