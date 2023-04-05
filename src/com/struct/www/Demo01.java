package com.struct.www;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            count++;
            sum+=x;
        }
        System.out.println(count+"个数的和是"+sum);
        System.out.println(count+"个数的平均值是"+(sum/count));
        scanner.close();
    }
}
