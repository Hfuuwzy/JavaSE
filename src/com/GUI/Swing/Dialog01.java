package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    弹窗
 */

// 主窗口
public class Dialog01 extends JFrame {
    public void init(){
        setSize(700,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        this.add(new JLabel("我是一个被弹出的窗口，也就是弹窗"));
        // 使用绝对布局的话，每个组件要设置位置
        JLabel label = new JLabel("显示我啊");
        label.setBounds(80,80,100,100);
        this.add(label);
        Container container = this.getContentPane();// 放东西的容器
        container.setLayout(null);// 绝对布局

        JButton button = new JButton("点击弹出一个弹窗");
        button.setBounds(30,30,200,50);

        button.addActionListener(new ActionListener() {
            // 发生什么事件
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });
        container.add(button);
    }
    // 测试主方法
    public static void main(String[] args) {
        new Dialog01().init();
    }

    class MyDialog extends JDialog{
        public MyDialog (){
            setBounds(100,100,500,500);
            setVisible(true);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container container = this.getContentPane();
            container.setLayout(null);
            JLabel label = new JLabel("我是一个被弹出的窗口");
            label.setBounds(100,100,200,200);
            container.add(label);
//        this.add(new JLabel("我是一个被弹出的窗口，也就是弹窗"));// 需要自己设置布局添加
        }
    }
}
//class MyDialog extends JDialog{
//    public MyDialog (){
//        setBounds(100,100,500,500);
//        setVisible(true);
////        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        Container container = this.getContentPane();
//        container.setLayout(null);
//        JLabel label = new JLabel("我是一个被弹出的窗口");
//        label.setBounds(100,100,200,200);
//        container.add(label);
////        this.add(new JLabel("我是一个被弹出的窗口，也就是弹窗"));// 需要自己设置布局添加
//    }
//}