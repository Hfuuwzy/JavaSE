package com.struct.www;

public class Arrays03 {
    public static void main(String[] args) {
        int [][] array = {{1,2},{5,3},{4,9},{0,3}};
        /*
         1,2    array[0]
         5,3    array[1]
         4,9    array[2]
         0,3    array[3]
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }


    }
}
