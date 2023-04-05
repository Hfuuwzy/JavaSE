package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/*
    图标,需要实现类，JFrame继承
 */
public class Icon01 extends JFrame implements Icon {
    private int width;
    private int  height;

    public Icon01(){}// 无参构造

    public Icon01(int width,int height){
        this.width = width;
        this.height = height;
    }

    public void init(){
        Icon icon01 = new Icon01(15,15);
        this.setBounds(100,100,400,250);
        // 图标可以放在标签上，也可以放在按钮上
        JLabel label = new JLabel("ICONTEXT",icon01,SwingConstants.CENTER);// 内容，图标对象，位置
        Container container = getContentPane();
        container.add(label);
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Icon01().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);

    }

    @Override
    public int getIconWidth() {
        return  this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
