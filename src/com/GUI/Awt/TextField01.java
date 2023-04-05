package com.GUI.Awt;

import com.UsuallyClass.StringClass.C;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
    输入框 TextField监听
 */
public class TextField01 {
    public static void main(String[] args) {
        // 只负责启动
        MyFrame1 myFrame1 = new MyFrame1();
       MyFrame1.windowClose(myFrame1);
    }
}
/*
    我的窗口
 */
class MyFrame1 extends Frame {
    public MyFrame1() {
        TextField textField = new TextField();
        add(textField);

        // 监听这个文本框输入的文字
        MyActionListener1 myActionListener1 = new MyActionListener1();
        textField.addActionListener(myActionListener1);
        // 设置替换编码
        textField.setEchoChar('*');

//        this.setBackground(Color.ORANGE);
        setVisible(true);
        pack();

    }
    public static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
/*
    监听实现
 */
class MyActionListener1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         public Object getSource() {
                return source;
            }
         */
//        e.getSource();
        TextField field =(TextField) e.getSource();// 获得一些资源，返回的一个对象
        System.out.println(field.getText());// 获得输出的文本框
        field.setText("");//清空文本框内容
    }
}

