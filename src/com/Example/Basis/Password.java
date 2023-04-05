package com.Example.Basis;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String name = "wzy";
        int password = 123321;
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name1 = scanner.nextLine();
            System.out.println("请输入密码");
            int password1 = scanner.nextInt();
            if (name1.equals(name) && password1 == password) {
                System.out.println("登陆成功");
                break;
            }else {
                if (2 - i == 0) {
                    System.out.println("你的账户被锁定，请与管理员联系");
                } else {
                    System.out.println("登陆失败你还有" + (2 - i) + "次机会");
                }
            }

        }

    }
}
