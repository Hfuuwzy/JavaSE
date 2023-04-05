package com.GUI.Awt;

import com.oop.Extends.B;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
    嵌套布局
 */
public class LayoutText {
    public static void main(String[] args) {
        // 总窗口
        Frame frame = new Frame();
        frame.setBounds(200,200,600,400);
//        Button button = new Button("Button");
        frame.setVisible(true);
        frame.setBackground(Color.blue);
        frame.setLayout( new GridLayout(2,1));
        // 四个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        //对每个面板单独进行添加按钮:上面
        p1.add(new Button("West-1"),BorderLayout.WEST);
        p1.add(new Button("East-1"),BorderLayout.EAST);
        p2.add(new Button("up-1"));
        p2.add(new Button("up-2"));
        //把面板添加到另一个面板内
        p1.add(p2,BorderLayout.CENTER);

        //对每个面板单独进行添加按钮:下面
        p3.add(new Button("West-2"),BorderLayout.WEST);
        p3.add(new Button("East-2"),BorderLayout.EAST);
//        p4.add(new Button("down-1"));
//        p4.add(new Button("down-2"));
//        p4.add(new Button("down-3"));
//        p4.add(new Button("down-4"));
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("down+"+i));
        }
        //把面板添加到另一个面板内
        p3.add(p4,BorderLayout.CENTER);
        frame.add(p1);
        frame.add(p3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
