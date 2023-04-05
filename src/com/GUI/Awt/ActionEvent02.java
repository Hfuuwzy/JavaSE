package com.GUI.Awt;
/*
    多个按钮，共享一个事件
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    // 两个按钮,实现同一个监听
    // 开始 - 停止
 */
public class ActionEvent02 {
    public static void main(String[] args) {
        Frame frame = new Frame("开始 - 停止");
        Button button1 = new Button("start ");
        Button button2 = new Button("stop ");
        Button button3 = new Button("1");
        Button button4 = new Button("2");
        MyMonitor myMonitor = new MyMonitor();
        // 注意:若是用setActionCommand()方法,原Button设置的字符会被覆盖
        // 默认是按钮名
        // 可以多个按钮只写一个监听类
        button2.setActionCommand("默认设置内容+");
        button3.setActionCommand("1");
        button4.setActionCommand("2");
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        button3.addActionListener(myMonitor);
        button4.addActionListener(myMonitor);
//        frame.add(button1,BorderLayout.NORTH);
//        frame.add(button2,BorderLayout.SOUTH);
        frame.setLayout(new GridLayout(2,2));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setVisible(true);
        frame.pack();
    }
}
class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了: "+e.getActionCommand());
        if(e.getActionCommand().equals("1")){
            System.out.println("我是大帅比");
        }
        if(e.getActionCommand().equals("2")){
            System.out.println("我是打美女");
        }
    }
}
