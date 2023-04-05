package com.GUI.Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
    事件监听:当某个事情发生时，干什么?
 */
public class ActionEvent01 {
    public static void main(String[] args) {
        //按下按钮，触发一些事件
        Frame frame = new Frame();
        Button button = new Button();
        // 因为，addActionListener()需要一个ActionListener,所以我们需要构造一个 ActionListener
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);
        frame.add(button,BorderLayout.CENTER);
        frame.pack();
        windowClose(frame);
        frame.setVisible(true);
    }

    // 关闭窗体的事件
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // 写需求
        System.out.println("按了按钮");
    }
}
