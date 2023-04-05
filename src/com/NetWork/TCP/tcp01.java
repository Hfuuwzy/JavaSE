package com.NetWork.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP发送数据
 */
public class tcp01 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.121",12872);
        // 获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("TCP，我来了！".getBytes());
        s.close();
    }
}
/*
    tcp接收数据
 */
class tcp011{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12872);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte [] bys = new byte[1024];
        int len;
        while((len = is.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        ss.close();
    }
}
