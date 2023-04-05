package com.struct.www;
import java.util.Scanner;     //题目有输入，所以要引入输入

         public class Calculator {
            // 计算器
             public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
               while (true){      //循环实现循环接受新的数据

                       System.out.println("请输入第一个数：");
                       double a = scanner.nextDouble();
                       System.out.println("请输入第二个数：");
                       double b = scanner.nextDouble();                  //使用两个变量记录用户输入的两个数
                       menu(a,b);                                               //进入menu方法进行计算

                       exit();//判断用户是否继续传入新的数据进行新的计算

                       int Select2 = scanner.nextInt();
                       switch (Select2){
                               case 1:
                                       System.out.println("正在加载...");
                                        break;
                               case 2:
                                        System.out.println("谢谢您的使用，再见！");
                                        scanner.close();//关闭输入
                                        return;
                              default:
                                     System.out.println("输入序号非法，程序即将结束！");
                                     scanner.close();return;
                           }
                    }
             }


             public static void exit(){   //输出交互相关文字
                System.out.println("***您需要继续计算吗？***");
                System.out.println("***1.需要，请继续******");
                System.out.println("***2.不需要，退出程序***");
                System.out.println("*请输入对应序号进行选择:*");
            }

           public static double menu(double a,double b){
                Scanner scanner = new Scanner(System.in);
                System.out.println("==========MENU==========");//输出交互相关文字
                System.out.println("=======1.计算加法=========");
               System.out.println("=======2.计算减法=========");
               System.out.println("=======3.计算乘法=========");
               System.out.println("=======4.计算除法=========");
              System.out.println("请输入菜单对应序号进入对应功能:");
               int Select1 = scanner.nextInt();
              switch (Select1){//判断用户交互内容，并执行
                       case 1:
                                jia(a,b);
                              break;
                       case 2:
                              jian(a,b);
                             break;
                         case 3:
                              cheng(a,b);
                               break;
                      case 4:
                              chu(a,b);
                              break;
                        default:
                                System.out.println("输入序号有误，请重新输入！");//输入不相关字符，让用户重新输入
                                return menu(a,b);
                     }
                 return 0;
             }

             public static void jia(double a,double b){//加法方法
                 System.out.println("计算结果为："+(a+b));
             }

             public static void jian(double a,double b){//减法方法
                 System.out.println("计算结果为："+(a-b));
             }

             public static void cheng(double a,double b){//乘法方法
                 System.out.println("计算结果为："+(a*b));
             }
     public static void chu(double a,double b){//除法方法
                 System.out.println("计算结果为："+(a/b));
             }
 }


