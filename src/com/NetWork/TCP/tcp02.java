package com.NetWork.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    客户端：发送数据，接受服务器反馈
 */
public class tcp02 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",12872);
        OutputStream os = s.getOutputStream();
        os.write("TCP，我来了！".getBytes());
        // 接受服务器反馈
        InputStream is = s.getInputStream();
        byte [] bys= new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端: "+data);
        s.close();
    }
}
class tcp021{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12872);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte [] bys= new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器: "+data);
        // 给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());
        ss.close();
    }
}