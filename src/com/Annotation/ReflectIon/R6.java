package com.Annotation.ReflectIon;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    获取运行时类的完整结构
        Field、Method、Constructor、SuperClass、Interface、Annotation
 */
public class R6 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class<User> c = User.class;
        // 获得类的名字
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println("==========================");

        // 获取类的属性
        Field[] fields = c.getFields();// 只能获取public属性
        for (Field field : fields) {
            System.out.println(field);
        }
        fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }  // private int com.Annotation.ReflectIon.User.id
        //获得指定属性的值
        Field age = c.getDeclaredField("age");
        System.out.println(age);
        System.out.println("==========================");

        // 获得类的方法
        Method[] methods = c.getMethods();// 获得本类和父类的所有方法
        for (Method method : methods) {
            System.out.println("正常的：" + method);
        }
        methods = c.getDeclaredMethods();// 获得本类的所有方法
        for (Method method : methods) {
            System.out.println("本类：" + method);
        }
        // 获得指定方法
        Method getId = c.getDeclaredMethod("getId", null);
        Method setId = c.getDeclaredMethod("setId", int.class);
        System.out.println(getId);
        System.out.println(setId);

        System.out.println("==========================");
        // 获得指定的构造器
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        constructors = c.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        // 获得指定的构造器
        Constructor<User> constructor = c.getConstructor(String.class, int.class, int.class);
        System.out.println(constructor);
        // ······
    }
}
