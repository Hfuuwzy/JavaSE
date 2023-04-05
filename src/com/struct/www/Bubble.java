package com.struct.www;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int []a = {2,4,24,64,32,23,18};
        int[] sort = sort(a);
            System.out.println(Arrays.toString(sort));//引用方法直接输出数组
    }

    //冒泡排序
    /*
    1.比较数组中，两个相邻的元素，如果第一个数比第二个大，交换位置
    2.每一次比较，都会产生一个最大数和最小数
    3.下一轮循环可以少一次排序
    4.依次循环，直至结束！
     */

    public static int [] sort(int [] arrays){
        int temp;
        //定义一个临时变量
        for (int i = 0; i < arrays.length-1; i++) {
            boolean flag = false;
            //优化不必要的循环
            for (int j = 0; j < arrays.length-1-i; j++) {
                if(arrays[j+1]<arrays[j]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
                //没有进行比较，说明排序结束
            }

        }
        return arrays;
    }

}
