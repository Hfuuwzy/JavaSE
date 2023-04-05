package com.IOstream.CharacterStream;

import java.io.*;

/*
    字符缓冲流：
        public class BufferedReader extends Reader 从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
        可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。
        public class BufferedWriter extends Writer 将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。
        可以指定缓冲区大小，或者可以接受默认大小。 默认值足够大，可用于大多数用途。
    构造方法：
        BufferedWriter(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
        BufferedReader(Reader in)  创建使用默认大小的输入缓冲区的缓冲字符输入流。
    字符缓冲流的特有功能：
        public String readLine() throws IOException 读一行文字。
        一行被视为由换行符（'\ n'），回车符（'\ r'）中的任何一个或随后的换行符终止。
        结果包含行的内容的字符串，不包括任何行终止字符，如果已达到流的末尾，则为null

        public void newLine() throws IOException写一行行分隔符。 
        行分隔符字符串由系统属性line.separator定义，并不一定是单个换行符（'\ n'）字符。

 */
public class CS05 {
    public static void main(String[] args) throws IOException {

//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\CS02.txt"));
//        BufferedReader br = new BufferedReader(new FileReader("D:\\杂文件\\IOText\\CS02.txt"));
//        bw.write("Hello\r\n");
//        bw.write("World\r\n");
//        char[] chs = new char[1024];
//        int len;
//        while((len  = br.read(chs))!=-1){
//            System.out.print(new String(chs,0,len));
//        }
//        br.close();
//        bw.close();

            //字符缓冲流的特有功能：
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\CS02.txt"));
//        for (int i = 0; i < 10; i++) {
//             bw.write(" Hello"+i);
//             bw.newLine();
//        }
//        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("D:\\杂文件\\IOText\\CS02.txt"));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
