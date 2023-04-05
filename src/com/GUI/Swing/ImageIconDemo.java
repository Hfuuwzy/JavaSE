package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/*
    添加图片标签
 */
public class ImageIconDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        // 获取图片的地址
        URL url = ImageIconDemo.class.getResource("tx.png");
        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        Container container = jFrame.getContentPane();
        container.add(label);

    }
}
