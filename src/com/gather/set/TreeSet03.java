package com.gather.set;
/*
    用TreeSet集合存储自定义对象，带参构造方法使用的是 比较器排序 对元素进行排序的
    比较器排序，就是  让集合构造方法接受Comparator的实现类对象，重写compare(To1,To2) 方法
    重写方法是，一定要注意排序规则要按照要求的主要条件和次要条件来写
 */
import java.util.Comparator;
import java.util.TreeSet;
/*
    比较器排序Comparator的使用
    存储学生对象并遍历，创建集合使用带参构造方法
    要求:按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSet03 {
    public static void main(String[] args) {
//         TreeSet <People> ts = new TreeSet<>(new Comparator<People>() {//匿名内部类
//             @Override
//             public int compare(People s1, People s2) {
//              //this --- s
//              //s1   --- s2
//              int i =  s1.getAge() - s2.getAge();
//              int i2 = i==0 ? s1.getName().compareTo(s2.getName()):i;
//              return i2;
//             }
//         });

        TreeSet <People> ts = new TreeSet<>((People s1,People s2)-> {//Lambda表达式

                //this --- s
                //s1   --- s2
                int i =  s1.getAge() - s2.getAge();
                int i2 = i==0 ? s1.getName().compareTo(s2.getName()):i;
                return i2;
            });


        People s1 = new People("xishi",22);
        People s2 = new People("diaocahn",21);
        People s3 = new People("wangzahojun",23);
        People s4 = new People("yangyuhuan",18);
        People s5 = new People("yangmi",21);
        People s6 = new People("yangmi",21);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);


        for (People s :
                ts) {
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}

/*
    People类
 */
class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
