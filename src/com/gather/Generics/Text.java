package com.gather.Generics;

import com.UsuallyClass.StringClass.E;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 4, 5, 1, 4};
        bubbleSort(arr);
//        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j + 1].compareTo(arr[j]) < 0) {
//                    Integer temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
////        }System.out.println(Arrays.toString(ae));
//        }
    }
    public static <T extends Comparable> void bubbleSort(T [] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j + 1].compareTo(arr[j]) < 0) {
//                    com.UsuallyClass.StringClass.E temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i + 1].compareTo(arr[i]) < 0;
//        }
        for ( T element : arr){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

}
