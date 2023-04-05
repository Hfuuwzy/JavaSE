package com.GUI.Awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
    三种布局方式
        FlowLayout 流式布局
        BorderLayout 东西南北中布局
 */
public class Layout {
    public static void main(String[] args) {
        Frame frame = new Frame("Layout");

        // 组件-按钮
        Button botton1 = new Button("botton1");
        Button botton2 = new Button("botton2");
        Button botton3 = new Button("botton3");
        Button botton4 = new Button("botton4");
        Button botton5 = new Button("botton5");
        Button botton6 = new Button("botton6");  //网格布局时再使用 2*3 布局
        frame.setBounds(200,200,500,500);
        frame.add(botton1);
//        frame.add(botton2);
//        frame.add(botton3);
//        frame.add(botton4);
//        frame.add(botton5);
//        frame.add(botton6);
        frame.setVisible(true);

        // 设置为流式布局
//        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        // 设置为东西南北中布局
//        frame.setLayout(new BorderLayout());// 默认为一个中心按钮
//        frame.add(botton1,BorderLayout.NORTH);
//        frame.add(botton2,BorderLayout.EAST);
//        frame.add(botton3,BorderLayout.SOUTH);
//        frame.add(botton4,BorderLayout.WEST);
        frame.add(botton5,BorderLayout.CENTER);

        // 设置为网格布局
        // public GridLayout(int rows, int cols) {
        //        this(rows, cols, hgap:0, vgap:0);
        //    }
//        frame.setLayout(new GridLayout(2,3));
//        frame.add(botton1);
//        frame.add(botton2);
//        frame.add(botton3);
//        frame.add(botton4);
//        frame.add(botton5);
//        frame.add(botton6);

//        frame.pack();// Java 函数！//自动布局，很小

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
