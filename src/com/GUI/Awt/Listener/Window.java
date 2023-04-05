package com.GUI.Awt.Listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
    窗口监听事件
 */
public class Window {
    public static void main(String[] args) {
        new WindowFrame();
    }
}
class WindowFrame extends Frame{
    public WindowFrame()  {
        setBackground(Color.blue);
        setBounds(300,300,500,300);
        setVisible(true);
//        addWindowListener(new MyWindowListener());
        this.addWindowListener(
                // 匿名内部类的使用
            new WindowAdapter() {
                // 窗口关闭
                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("windowClosing");
                    System.exit(0);
                }

                // 窗口激活
                @Override
                public void windowActivated(WindowEvent e) {
                    WindowFrame source = (WindowFrame) e.getSource();
//                    source.setTitle("被激活了");
                    System.out.println("windowActivated");
                    source.setTitle("被激活了");
//                    source.setTitle("失去");
                }
            });

    }
}
