package com.NetWork.UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/*
    UDP发送数据，
        数据来自键盘录入，知道输入886，发送数据结束
 */
public class Example {

}

class sendDates {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals((line))) {
                break;
            }
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("localhost"), 12345);
            ds.send(dp);
        }
        ds.close();
    }
}

class receiveDates {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            ds.receive(dp);
            System.out.println("数据是： " +new String(dp.getData(), 0,dp.getLength()));
        }
    }
}