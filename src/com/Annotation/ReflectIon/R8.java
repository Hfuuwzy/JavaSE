package com.Annotation.ReflectIon;

import javax.naming.Name;
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/*
    获取注解信息
 */
public class R8 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student2> c = Student2.class;

        // 通过反射获取注解
//        Annotation[] annotations = c.getAnnotations();
//        for (Annotation annotation : annotations) {
//            System.out.println(annotation);
//        }
        // 获取注解value的值
        tableWzy tableWzy = c.getAnnotation(tableWzy.class);
        String value = tableWzy.value();
        System.out.println(value);

        // 获得类的指定注解
        //Field getDeclaredField(String name) 返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。
        Field f = c.getDeclaredField("age");
        FieldWzy fieldWzy = f.getAnnotation(FieldWzy.class);
        System.out.println(fieldWzy.name());
        System.out.println(fieldWzy.age());
        System.out.println(fieldWzy.id());

        Field ff = c.getDeclaredField("name");
        FieldWzy fieldWzyy = ff.getAnnotation(FieldWzy.class);
        System.out.println(fieldWzyy.name());
        System.out.println(fieldWzyy.age());
        System.out.println(fieldWzyy.id());
    }
}

@tableWzy("学生信息")
class Student2 {
    @FieldWzy(name = "杨幂", age = 18, id = 1)
    private String name;
    @FieldWzy(name = "胡歌", age = 28, id = 2)

    private int age;
    @FieldWzy(name = "彭于晏", age = 27, id = 3)

    private int id;

    public Student2() {
    }

    public Student2(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface tableWzy {
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldWzy {
    String name();

    int age();

    int id();
}