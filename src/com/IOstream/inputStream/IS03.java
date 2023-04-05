package com.IOstream.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
     字节流复制图片
 */
public class IS03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\王朝阳\\Pictures\\Screenshots\\QQ图片20220528202048.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\杂文件\\IOText\\photo\\ssm.jpg");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }
}
