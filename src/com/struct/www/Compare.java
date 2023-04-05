package com.struct.www;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
       int max = max(12,13);
        System.out.println(max);
    }
    public static int max(int num1,int num2){
        int result = 0;
        if (num1>num2){
            result = num1;
        }else if (num1==num2){
            System.out.println("num1 == num2");
        }else {
            result = num2;
        }
        return result;
    }
}

