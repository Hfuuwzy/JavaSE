package com.IOstream.SpecialOperationStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

/*
    需求：猜数字小游戏，试玩三次，如果还想玩，提示：试玩次数结束，想玩请充值(www.chongqian.com)
 */
class Demo{
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\杂文件\\IOText\\game.txt");
        prop.load(fr);
        fr.close();
        String value = prop.getProperty("count");
        int number = Integer.parseInt(value);
        if (number >= 1) {
            System.out.println("试玩次数结束，想玩请充值(www.chongqian.com)");
        }else {
            GuessNumber.start();
            number++;
//            prop.setProperty("count",String.valueOf(number++));//在'number++'更改的值是不会被使用的
            prop.setProperty("count",String.valueOf(number));//在'number++'更改的值是不会被使用的
            // 修改玩别忘了重新写
            FileWriter fw = new FileWriter("D:\\杂文件\\IOText\\game.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        Random rd = new Random();
        int guessNumber = rd.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字： ");
            int number = sc.nextInt();
            if (number > guessNumber) {
                System.out.println("你猜的数字" + number + "大了");
            } else if (number < guessNumber) {
                System.out.println("你猜的数字" + number + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
