package com.NetWork.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    客户端0：数据来自键盘录入，知道数据是886，发送数据结束
    客户端3：数据来自文本文件，接受反馈
    服务器1：接收到的数据在控制台输出
    服务器2：接收到的数据写入文本文件，给出反馈
    服务器4：接收到的数据写入文本文件，线程封装代码，为每个客户端开启一个线程

 */

public class tcp03 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.100.4", 12872);
        // 键盘读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 封装输出流对象 字节->字符->字符缓冲流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();
    }
}

class tcp031 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12872);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        ss.close();
    }
}

class tcp032 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12872);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\tcp01.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        BufferedWriter bwServe = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServe.write("文件上传成功");
        bwServe.newLine();
        bwServe.flush();

        ss.close();
        bw.close();
    }
}

class tcp033 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.100.4", 12872);
        BufferedReader br = new BufferedReader(new FileReader("D:\\杂文件\\IOText\\tcp.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();// 结束标记

        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈：" + data);

        br.close();
        s.close();
    }
}

class tcp034 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12872);
        while (true) {
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }
    }

    private static class ServerThread implements Runnable {
        private Socket s;

        public ServerThread(Socket s) {
            this.s = s;
        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//                BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\杂文件\\IOText\\TCP.txt"));
                // 解决文件名冲突的办法
                int count = 0;
                File file = new File("D:\\杂文件\\IOText\\TCP[" + count + "].txt");
                while (file.exists()) {
                    count++;
                    file = new File("D:\\杂文件\\IOText\\TCP[" + count + "].txt");
                }
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                }

                BufferedWriter bwServe = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                bwServe.write("文件上传成功了");
                bwServe.newLine();
                bwServe.flush();

                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

