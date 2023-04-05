package com.oop.INTERFACE;

import java.util.Scanner;

// 如果是抽象类则需要继承   extends;
// 类 可以实现接口 implements 接口,但是，实现接口的类，就需要重写接口的方法~
// 利用接口实现多继承~
public class UserServiceImpl implements UserService,TimeService {

    @Override
    public void add() {
    int a=1,b=2;
    System.out.println(a+b);
    }

    @Override
    public void delete() {

    }

    @Override
    public void time() {

    }


}
