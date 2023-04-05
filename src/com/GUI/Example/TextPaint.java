package com.GUI.Example;

import java.awt.*;

/*
    初识画笔
 */
public class TextPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(300,300,600,400);
        setVisible(true);
    }
    // 画笔
    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.setColor(Color.BLUE);
//        g.draw3DRect(100,100,100,100,false);
        g.fillOval(200,200,50,50);// 实心的圆

        g.setColor(Color.ORANGE);
        g.drawRect(100,100,80,80);

        // 画笔用完将它还原到最初的有颜色

    }
}


