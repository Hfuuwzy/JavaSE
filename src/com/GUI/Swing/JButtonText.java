package com.GUI.Swing;

//import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonText {
    public static void main(String[] args) {
//        new ImageButton();
//        new ButtonRadio();
        new ButtonCheckBox();
    }
}
/*
    图签按钮
 */
class ImageButton extends JFrame{
    public ImageButton(){
        Container container = getContentPane();
        // 获取图片地址
        JButton button = new JButton("图片按钮");
        URL url = ImageButton.class.getResource("tx.png");
        // 把图片标签放在按钮上
        Icon icon = new ImageIcon(url);
        button.setIcon(icon);
        button.setToolTipText("图片按钮");
        button.addActionListener(e -> System.out.println("我被点击了"));
        container.add(button);
        this.setVisible(true);
        this.setSize(800,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
/*
    单选框
 */
class ButtonRadio extends JFrame{
    public ButtonRadio(){
        Container container = getContentPane();

        // 单选框
        JRadioButton radioButton1 = new JRadioButton("查看薇尔莉特");
        JRadioButton radioButton2 = new JRadioButton("查看黄前久美子");
        JRadioButton radioButton3 = new JRadioButton("查看高坂丽奈(na)");

        // 由于单选框只能选择一个，需要分组，一个分组中只能选择一个
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        container.add(radioButton1,BorderLayout.NORTH);
        container.add(radioButton2,BorderLayout.SOUTH);
        container.add(radioButton3,BorderLayout.CENTER);

        this.setVisible(true);
        this.setSize(800,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
/*
    多选框
 */
class ButtonCheckBox extends JFrame{
    public ButtonCheckBox(){
        Container container = getContentPane();

        // 多选框
        JCheckBox checkbox1 = new JCheckBox("记住密码");
        JCheckBox checkbox2 = new JCheckBox("自动登录");

        container.add(checkbox1,BorderLayout.SOUTH);
        container.add(checkbox2,BorderLayout.NORTH);

        this.setVisible(true);
        this.setSize(800,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
