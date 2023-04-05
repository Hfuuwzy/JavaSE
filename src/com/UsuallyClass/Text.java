package com.UsuallyClass;

import java.util.Scanner;

public class Text {
    static int count = 3;

    public static void main(String[] args) {
        interaction();
    }

    public static void interaction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String UID = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        Check user = new Check();
        if (count == 1) {
            System.out.println("您真会输入啊。拜拜了您嘞。");
            return;
        }
        if (user.dualCheck(UID, password)) {
            System.out.println("欢迎！");
        } else {
            System.out.println("错误！您还有" + --count + "次机会！");
            interaction();
        }
    }
}

    class Check {
    private String UID = "Senpai";
    private String password = "114514";

    public boolean dualCheck(String UID, String password) {
        if (UID.equals(this.UID) && password.equals(this.password)) {
            return true;
        }
        return false;
    }
}

