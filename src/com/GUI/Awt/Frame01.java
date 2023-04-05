package com.GUI.Awt;

import java.awt.*;

/*
    GUI的第一个页面
 */
public class Frame01 {
    public static void main(String[] args) {
        // Frame 窗口 不用查看JDK帮助文档，可以直接查看源码，ALT+7会显示里面的方法
        Frame frame = new Frame("我的第一个java图像界面窗口");

        // 设置窗口大小
        frame.setSize(400,400);

        // 弹出的初始位置
        frame.setLocation(200,200);

        // 设置背景颜色 Color
//        Color color = new Color(10,20,40); r,g,b  红绿蓝三基色
        frame.setBackground(new Color(0x18B113));

        // 设置大小固定
//        frame.setResizable(false);
//        frame.setResizable(true);  默认可以调整大小

        // 需要设置可见性 w h
        frame.setVisible(true);

        //
    }
}
