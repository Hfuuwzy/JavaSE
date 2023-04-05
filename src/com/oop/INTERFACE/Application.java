package com.oop.INTERFACE;



import java.util.Scanner;

public class Application extends UserServiceImpl {
    public static void main(String[] args) {
        Application s1 = new Application();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
        UserService s2 = new UserServiceImpl();//调用实现抽象或者接口的类，通常使用这个子类，因为它拥有最多的方法
        s2.add();
        s1.add();



    }




}
