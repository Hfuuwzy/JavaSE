package com.GUI.Awt.Listener;

import com.UsuallyClass.StringClass.C;
import com.UsuallyClass.StringClass.E;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

/*
    鼠标监听事件
 */
public class Mouse {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("简易画图点");
        myFrame.loadMyFrame();
        myFrame.windowClose();
    }
}

// 自己的类
class MyFrame extends Frame{

    //设置默认窗口的一些参数
    public MyFrame(String title){
        super(title);// 显示标题
        setBounds(300,300,500,300);
        setVisible(true);
    }

    //创建一个存储鼠标点的集合 , 参数为 Point 这个元素
    ArrayList<Point> points = new ArrayList<>();

    public void loadMyFrame(){
        //鼠标监听器，监听这个窗口
        addMouseListener(new MyMouseListener());// 完成了监听事件
    }

    // 实现鼠标监听 主体
    private class MyMouseListener extends MouseAdapter{
        //  鼠标操作: 按下，弹起，按住不放
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame  = (MyFrame) e.getSource();// 返回当前对象
            // 添加点到窗口，我们点击时，界面上产生一个点——>用画出实现(画 自动包含了添加这个动作)
            // 这是我们鼠标的点
            myFrame.addPaint(new Point(e.getX(),e.getY()));// 包含了 画的方法直接把点添加到界面
//            new Point(e.getX(),e.getY());// 获得点的坐标
            // 每次点击鼠标，都需要重新画一遍，因为初始无点
            myFrame.repaint();// 刷新
        }
    }

    // 把点存到集合，由画来实现遍历添加到界面
    public void addPaint(Point point){ // 参数为接收鼠标的点
        points.add(point); // 把鼠标的点添加到这个集合中，集合遍历每个点，并画在界面上，这是集合，鼠标的动作，画三者的联系
    }

    // 重写画的方法
    @Override
    public void paint(Graphics g) {
        // 画画，监听鼠标的事件
        Iterator<Point> it = points.iterator();
        while (it.hasNext()){
            Point point = it.next();// 获取这个点
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);// 把鼠标点的坐标画到界面上
        }
    }

    // 关闭窗口的方法
    public void windowClose(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
