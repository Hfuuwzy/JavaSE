package com.GUI.Awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
    Panel 面板 ，Panel可以看成是一个空间，但是不能单独存在
    Panel不能单独显示，必须添加到某个容器中
 */
public class Panel01 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        // 设置布局
        frame.setLayout(null);//默认
        //设置坐标
        frame.setBounds(100,100,500,500);
        frame.setBackground(new Color(29,200,122));

        // Panel设置坐标，相对于Frame;
        panel.setBounds(50,50,200,200);
        panel.setBackground(new Color(0x0E0EE3));

        /*  public class Panel extends Container
            public class Container extends Component
            public Component add(Component comp) {
                addImpl(comp, null, -1);
                return comp;
             }
             所以Panel间接继承了Component(容器)，add方法可以添加
         */
        frame.add(panel);

        frame.setVisible(true);

        //监听事件，监听窗口关闭事件 System.exit(0)
        // 适配器模式
        /*
        这是new接口的方法,需要重写所有方法，可用适配器解决
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        */
        frame.addWindowListener(new WindowAdapter() {
            // 窗口点击关闭的时候所需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
//               super.windowClosing(e);
                // 结束程序
                System.exit(0);
            }
        });






    }
}
