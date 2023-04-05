package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/*
    Swing之JFrame窗口
 */
public class JFrame01 {
    public static void main(String[] args) {
        new JFrame01().init();
    }
    // 初始化
    public void init(){
        //创建一个窗口
        JFrame jf = new JFrame("这是一个JFrame窗口");
        jf.setBounds(100,100,300,200);
        jf.setVisible(true);
        jf.setBackground(Color.ORANGE);
        // 设置文字 JLabel
        JLabel label = new JLabel("这是我学Swing的开始");
//        JLabel label2= new JLabel("对对对",SwingConstants.CENTER);//默认覆盖
        jf.add(label);
//        jf.add(label2);
        // 让文本标签居中  设置水平对其
        label.setHorizontalAlignment(SwingConstants.CENTER);
        // 关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE); //  隐藏窗口
        // 获得一个容器
        Container container = jf.getContentPane();
        container.setBackground(Color.YELLOW);


    }
}
