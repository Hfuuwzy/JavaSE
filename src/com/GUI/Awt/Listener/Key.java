package com.GUI.Awt.Listener;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
    键盘监听事件
 */
public class Key {
    public static void main(String[] args) {
        new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame() {
        setBounds(100,100,100,100);
        setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            // 键盘按下
            public void keyPressed(KeyEvent e) {
                // 获得键盘下的键是哪一个，当前的码
                int keyCode = e.getKeyCode();// 不需要去记录这个值，直接使用静态属性VK_xxx
                System.out.println(keyCode);
                if(keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}

