package com.GUI.Awt;

import java.awt.*;

/*
    展示多个窗口
 */
public class Frame02 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100,100,200,200,Color.CYAN);
        MyFrame myFrame2 = new MyFrame(300,100,200,200,Color.blue);
        MyFrame myFrame3 = new MyFrame(100,300,200,200,Color.red);
        MyFrame myFrame4 = new MyFrame(300,300,200,200,Color.PINK);
    }
}
/*
    把窗口封装
 */
class MyFrame extends Frame{
    static int id = 0;// 可能存在多个窗口，我们需要一个计数器
    //构造器
    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame+"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);

    }
}
