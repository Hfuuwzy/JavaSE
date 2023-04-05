package com.Annotation.ReflectIon;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    通过反射动态创建对象执行方法
 */
public class R7 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<User> c = User.class;
//        // 构造一个对象: T newInstance() 创建由此 类对象表示的类的新实例。
//        User user = c.newInstance();// 本质是调用了类的无参构造器
//        System.out.println(user);
//
//        // 通过构造器创建对象
//        Constructor<User> constructor = c.getDeclaredConstructor(String.class, int.class, int.class);
//        User user1 = constructor.newInstance("王朝阳", 19, 1);
//        System.out.println(user1);

        // 通过反射调用普通方法
        User user3 = c.newInstance();
        // 通过反射获取个方法  invoke():激活的意思  (对象,方法的参数，无参为null)
        //Object invoke(Object obj, Object... args) 在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
        Method setName = c.getDeclaredMethod("setName", String.class);
        setName.invoke(user3, "wzy");
        System.out.println(user3.getName());

        Method show = c.getDeclaredMethod("show");
        show.invoke(user3, null);// 激活并调用

        // 通过反射操作属性
        User user4 = c.newInstance();
        Field name = c.getDeclaredField("name");
        // 不能直接操作私有属性,我们需要关闭程序的安全检测: .setAccessible(true)
        //void setAccessible(boolean flag) 将此对象的accessible标志设置为指示的布尔值。
        // 提高反射的效率，使得原来无法访问的私有成员也可以访问
        name.setAccessible(true);
        name.set(user4, "大幂幂");
        System.out.println(user4.getName());// IllegalAccessException


    }
}

/*
    调用方法性能对比分析
 */
class Test {
    // 普通方法调用
    public static void test01() {
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行10亿次" + (endTime - startTime) + "ms");
    }

    // 反射调用
    public static void test02() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<User> c = User.class;
        User user = c.newInstance();
        Method getName = c.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法执行10亿次" + (endTime - startTime) + "ms");
    }

    // 反射调用 ，关闭检测
    public static void test03() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<User> c = User.class;
        User user = c.newInstance();
        Method getName = c.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("关闭检测执行10亿次" + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        test01();
        test02();
        test03();
    }
}