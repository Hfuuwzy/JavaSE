package com.UsuallyClass.DatesClass;
/*
     SimpleDateFormat():构造一个 SimpleDateFormat,使用默认模式和日期格式
    SimpleDateFormat(String pattern):构造一个 SimpleDateFormat并使用给定的模式和默认的日期格式
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat类
public class SimDateFor {
    public static void main(String[] args) throws ParseException {
        //格式化 从 Date ---> String
        //pubic final String format(Date date): 将日期格式化成日期/时间字符串
        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();//无参构造得到的格式  22-4-21 下午9:01
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//2022年04月21日 21:03:15
        String s = sdf.format(d);
        System.out.println(s);

        //解析   从 String ---> Date
        String ss = "2022年04月21日 11:11:21";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//格式必须一致才能对比
        Date dd = sdf.parse(ss);
        System.out.println(dd);
    }
}

//class app{
//    public static void main(String[] args) throws ParseException {
//        Date d = new Date();
//        SimpleDateFormat sdf1 = new SimpleDateFormat();
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//
//        // 格式化：Date to String
//        // public final String format(Date date)
//        String str1 = sdf1.format(d);
//        System.out.println(str1);
//        String str2 = sdf2.format(d);
//        System.out.println(str2);
//
//        // 解析：String to Date
//        // public Date parse(String source)
//        String str3 = "2019年08月10日 11:45:14";
//        Date dd = sdf2.parse(str3);
//        System.out.println(dd);
//    }
//}
