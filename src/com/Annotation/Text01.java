package com.Annotation;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

/*
    什么是注解：
    从JDK5开始,Java增加对元数据的支持，也就是注解，注解与注释是有一定区别的，可以把注解理解为代码里的特殊标记，
    这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。通过注解开发人员可以在不改变原有代码和逻辑的情况下在源代码中嵌入补充信息。
 */

@MyAnnotation()
public class Text01{
    @Override   //  重写的注解
    public String toString(){
        return super.toString();
    }
    @Deprecated // 不推荐程序员使用，但是可以使用，或者存在更好的方式
    public static void text(){
        System.out.println("条形图");
    }
    @SuppressWarnings("all") // 取消所有的提醒
    public void  text2(){
        List<String> arrayList = new ArrayList<>();
    }

    public static void main(String[] args) {

        text();
    }
}
/*
    元注解
 */
// 自定义注解： 使用@interface ,自动继承了java.lang.annotation.Annotation接口
// Target 表示我们的注解可以用在哪些地方
@Target(value = {ElementType.TYPE,ElementType.METHOD})

// Retention表示我们的注解在什么地方有效(runtime>class>source)
@Retention(value = RetentionPolicy.RUNTIME)

// 表示是否将我们的注解生成在JAVADOC中
@Documented

// 子类可以继承父类的注解
@Inherited

// 注解可以显示赋值，如果没有默认值，我们就必须给注解赋值
@interface MyAnnotation{
    // 注解的参数: 参数类型 + 参数名（）；
    String name() default "";
    int age() default 0;
    int id() default -1;// 如果默认值为-1，代表不存在
    String [] schools() default {"HFUU"};
}











