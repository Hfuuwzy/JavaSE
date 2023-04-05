package com.GUI.Swing;

import com.GUI.Awt.Layout;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/*
    下拉框和列表框
 */
public class Comb0BOXDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();

        JComboBox<String> status = new JComboBox<>();
        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");

        container.add(status);
        jFrame.setVisible(true);
        jFrame.setSize(500,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
class Comb0BOXDemo01{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        // 生成列表的内容
//        String [] contents = {"1","我","English"};

        // 类实现了可扩展的对象数组。 像数组一样，它包含可以使用整数索引访问的组件。
        // 但是， Vector的大小可以根据需要增长或缩小，以适应在创建Vector之后添加和删除项目。
        Vector<String> vector = new Vector<>();
        //
//        JList<String> list = new JList<>(contents);
        JList<String> list = new JList<>(vector);
        vector.add("我是");
        vector.add("yige");
        vector.add("12345");

        container.add(list);
        jFrame.setVisible(true);
        jFrame.setSize(500,400);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
