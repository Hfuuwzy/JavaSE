package com.oop.Exception;

public class Text {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        //ctrl + alt + t
        //假设捕获多个异常
        try {//try 监控区域
            System.out.println(a/b);
        } catch (Exception e) {//catch 捕获异常
            System.out.println("b不能为0");
        e.printStackTrace();
        }catch (Error error){
            System.out.println("Error");
        }catch (Throwable throwable){
            System.out.println("Throwable");
        }//同时检测多个异常时，把检测范围大的放在前面
        finally {//处理善后工作，总是会执行
            System.out.println("finally");
        }
        System.out.println("end");
        //finally 可以不要finally       假设IO，资源，关闭！能用到；

    }
}
