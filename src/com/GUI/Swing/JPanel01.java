package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/*
    JPanel面板
 */

public class JPanel01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Container container = jf.getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));// 后两个参数的意思为间距
        JPanel jPanel1 = new JPanel(new GridLayout( 2,1));
        JPanel jPanel2 = new JPanel(new GridLayout(1,2));
        for (int i = 0; i < 2; i++) {
            jPanel1.add(new Button("1"));
        }
        JButton button1 = new JButton("2");
        JButton button2 = new JButton("2");
        jPanel2.add(button1);
        jPanel2.add(button2);

        container.add(jPanel1);
        container.add(jPanel2);
        jf.setVisible(true);
        jf.setBounds(100,100,200,200);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
/*
    JScroll面板
 */
class JScroll01 extends JFrame{
    public static void main(String[] args) {
        new JScroll01();
    }
    public JScroll01(){
        this.setBounds(100,100,200,150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = getContentPane();

        // 文本域
        TextArea textArea = new TextArea(20,50);
        textArea.setText("欢迎来到文本域");

        // JScroll面板
        JScrollPane pane = new JScrollPane(textArea);
        container.add(pane);


    }
}
