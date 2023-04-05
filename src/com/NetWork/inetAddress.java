package com.NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress类
 */
public class inetAddress {
    public static void main(String[] args) throws UnknownHostException {
        // 确定主机名称的IP地址(主机名称可以是机器名称，也可以是IP地址)
        InetAddress address = InetAddress.getByName("Hfuuwzy");
//        InetAddress address = InetAddress.getByName("192.168.1.121");

        // 获取此IP地址的主机名
        String hostName = address.getHostName();

        // 返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();
        System.out.println("主机名： " + hostName);
        System.out.println("IP地址： " + ip);
    }
}
