package com.struct.www;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

//            强化for  没有下标
//            for (int array : arrays) { //前面是数组里的每一个元素       后面就是代表一个数组
//                System.out.println(array);

            printArray(arrays);
            System.out.println("==========");
            int[] reverse = reverse(arrays);
            printArray(reverse);
    }

        //数组的反转
    public static int [] reverse(int [] arrays){
        int[] result = new int[arrays.length];
        //反转的操作
        for (int i = 0,j = arrays.length-1; i <arrays.length ; i++,j--) {
          result[j] = arrays[i];
        }
        return result;
    }




        //打印数组元素
    public static  void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
       //System.out.println(Arrays.toString(数组名称));

}
