package com.GUI.Example;
/*
    简易计算器
    顺便回顾组合和内部类
    面向过程写法 ——>  面向对象(组合方式) ——> 面向对象(内部类方式)
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextCalc {
    public static void main(String[] args) {
        new Calculator().LoadFrame();
    }
}
/*
    面向对象(内部类方式)写法
 */
// 计算器类
class Calculator extends Frame {
    // 属性
    TextField num1,num2,num3;
    // 方法
    public void LoadFrame(){
        // 拼组件 ——>  组件需要的监听器 ——> 布局 ——> 显示
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(10);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculator());

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
    }
    // 内部类的使用 ，最大的好处就是可以畅通五组无阻的访问外部的属性和方法
    private class MyCalculator implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. 获得加数和被加数
            // 2.将这个值 + 法运算后，放到第三个框
            // 3.清除前两个框

            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(""+(n1+n2));// 字符串拼接
            num1.setText("");
            num2.setText("");
        }
    }

}

// 面向过程式写法
/*

    // 计算器类
    class Calculator extends Frame {
        public Calculator() {
            // 3个文本框
            TextField num1 = new TextField(10); // 字符数
            TextField num2 = new TextField(10);
            TextField num3 = new TextField(10);
            // 一个按钮
            Button button = new Button("=");// 默认按钮显示
            MyCalculator myCalculator = new MyCalculator(num1,num2,num3);// 构造器传参
            button.addActionListener(myCalculator);
            // 标签
            Label label = new Label("+");// 设置默认标签显示
            // 布局
            setLayout(new FlowLayout());

            add(num1);
            add(label);
            add(num2);
            add(button);
            add(num3);

            pack();
            setVisible(true);
        }
    }

    class MyCalculator implements ActionListener{
        // 获取三个变量，用构造器传参方式
        private TextField num1,num2,num3;

        public MyCalculator(TextField num1,TextField num2,TextField num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. 获得加数和被加数
            int i1 = Integer.parseInt(num1.getText());
            int i2 = Integer.parseInt(num2.getText());

            // 2.将这个值 + 法运算后，放到第三个框
            num3.setText(""+(i1+i2));// 转换为String 类

            // 3.清除前两个框
            num1.setText("");
            num2.setText("");
        }
    }
 */

// 面向对象(组合方式)写法
/*
    // 计算器类
    class Calculator extends Frame {
        // 属性
        TextField num1,num2,num3;
        // 方法
        public void LoadFrame(){
            // 拼组件 ——>  组件需要的监听器 ——> 布局 ——> 显示
            num1 = new TextField(10);
            num2 = new TextField(10);
            num3 = new TextField(10);
            Button button = new Button("=");
            Label label = new Label("+");

            MyCalculator myCalculator = new MyCalculator(this);
            button.addActionListener(myCalculator);

            setLayout(new FlowLayout());
            add(num1);
            add(label);
            add(num2);
            add(button);
            add(num3);

            pack();
            setVisible(true);
        }
    }
    class MyCalculator implements ActionListener{
        //获取 Calculator 这个对象 ,在一个类中组合另外一个类。 组合 > 继承
        Calculator calculator = null;

        public MyCalculator(Calculator calculator) {
            this.calculator = calculator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. 获得加数和被加数
            // 2.将这个值 + 法运算后，放到第三个框
            // 3.清除前两个框

            int n1 = Integer.parseInt(calculator.num1.getText());
            int n2 = Integer.parseInt(calculator.num2.getText());
            calculator.num3.setText(""+(n1+n2));// 字符串拼接
            calculator.num1.setText("");
            calculator.num2.setText("");
        }
    }

 */