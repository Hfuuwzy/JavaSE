package com.Example.Basis;

import java.util.Scanner;

public class Threecompaper {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int max = a>b ? a : b;
            int themaxx = max > c ? max : c;
            System.out.println(themaxx);



        }
    }

