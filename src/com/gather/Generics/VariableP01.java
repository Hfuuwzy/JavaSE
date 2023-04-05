package com.gather.Generics;
/*
    可变参数:
        可变参数又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了；
        格式 ： 修饰符 返回值类型 方法名(数据类型...变量名){ }
        范例 ： public static int getSum(int...a){ }

    可变参数注意事项:
        这里的变量其实是一个数组
        ；就如果一个方法有多个参数，包含可变参数，可变参数要放在最后
 */
public class VariableP01 {
    public static void main(String[] args) {
        System.out.println(getSum(10,20));
        System.out.println(getSum(10,20,30));
//        System.out.println(Sum(10,10,30,40));
    }

//    public static int Sum(int b,int...a){
//        return 0;
//    }

    public static int getSum(int...a){
//        System.out.println(a);// [I@1b6d3586  [I@4554617c ,实际是个数组
//        return 0;// 0 0
        int sum = 0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }

//    public static int getSum(int a,int b){
//        return a+b;
//    }
//
//    public static int getSum(int a,int b,int c){
//        return a+b+c;
//    }
}
