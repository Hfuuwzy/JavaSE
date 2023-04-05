package com.NetWork.UDP;

import java.io.IOException;
import java.net.*;

/*
    UDP通信原理
         1、UDP协议是一种不可靠的网络协议，它在通信的两端各建立一个Socket对象，但是这两个Socket只是发送，接收数据的对象
         2、基于UDP协议的通信双方而言，没有所谓的客户端和服务器端概念
    UDP发送数据的步骤：
        1. 创建发送端的Socket对象(DatagramSocket)
        2. 创建数据，并把数据打包
        3. 调用DatagramSocket对象的方法发送数据
        4. 关闭发送端
 */
public class socket {
    public static void main(String[] args) throws IOException {

        //DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds = new DatagramSocket();

        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。

        byte [] bys = "Hello ,UDP,IM Coming!".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("localhost"), 10086);

        // void send(DatagramPacket p) 从此套接字发送数据报包。

        ds.send(dp);
        ds.close();

    }
}
/*
    接收数据
 */
class socket0Receive{
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        // 接收数据方法
        ds.receive(dp);

        System.out.println("数据是： "+new String(dp.getData(),0,dp.getLength()));
        // 关闭接收端
        ds.close();
    }
}