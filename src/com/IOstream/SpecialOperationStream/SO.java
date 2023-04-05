package com.IOstream.SpecialOperationStream;

import java.io.PrintStream;

/*
    标准输出流：
    public static final PrintStream out“标准”输出流。
    此流已经打开并准备好接受输出数据。 通常，此流对应于显示输出或由主机环境或用户指定的另一个输出目标。
    输出语句的本质：是一个标准的输出流
 */
public class SO {
    public static void main(String[] args) {
        PrintStream ps = System.out;

        ps.println("Hello");
        ps.println(100);
        // System.out的本质是一个字节输出流
        System.out.println( "Hello");
        System.out.println( 100);
    }
}
