package com.Annotation.ReflectIon;
/*
    类加载器
 */
public class R5 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统的类加载器: static ClassLoader getSystemClassLoader() 返回用于委派的系统类加载器。
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统加载器的父类加载器 ——> 扩展类加载器: ClassLoader getParent() 返回父类加载器进行委派。
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器 ——> 根加载器(C++写的)
        ClassLoader parentParent = parent.getParent();
        System.out.println(parentParent);

        // 测试当前类是那个加载器加载的
        ClassLoader classLoader = R5.class.getClassLoader();
        System.out.println(classLoader);

        // 测试JDK内置的类是谁加载的 (根加载器)
        ClassLoader ObjectLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(ObjectLoader);

        // 如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        // 双亲委派机制:当自定义的包名与系统的包名相同时，会使用系统内的包
        /*

            D:\Environment\JDK-8\jre\lib\charsets.jar;
            D:\Environment\JDK-8\jre\lib\deploy.jar;
            D:\Environment\JDK-8\jre\lib\ext\access-bridge-64.jar;
            D:\Environment\JDK-8\jre\lib\ext\cldrdata.jar;
            D:\Environment\JDK-8\jre\lib\ext\dnsns.jar;
            D:\Environment\JDK-8\jre\lib\ext\jaccess.jar;
            D:\Environment\JDK-8\jre\lib\ext\jfxrt.jar;
            D:\Environment\JDK-8\jre\lib\ext\localedata.jar;
            D:\Environment\JDK-8\jre\lib\ext\nashorn.jar;
            D:\Environment\JDK-8\jre\lib\ext\sunec.jar;
            D:\Environment\JDK-8\jre\lib\ext\sunjce_provider.jar;
            D:\Environment\JDK-8\jre\lib\ext\sunmscapi.jar;
            D:\Environment\JDK-8\jre\lib\ext\sunpkcs11.jar;
            D:\Environment\JDK-8\jre\lib\ext\zipfs.jar;
            D:\Environment\JDK-8\jre\lib\javaws.jar;
            D:\Environment\JDK-8\jre\lib\jce.jar;
            D:\Environment\JDK-8\jre\lib\jfr.jar;
            D:\Environment\JDK-8\jre\lib\jfxswt.jar;
            D:\Environment\JDK-8\jre\lib\jsse.jar;
            D:\Environment\JDK-8\jre\lib\management-agent.jar;
            D:\Environment\JDK-8\jre\lib\plugin.jar;
            D:\Environment\JDK-8\jre\lib\resources.jar;
            D:\Environment\JDK-8\jre\lib\rt.jar;
            D:\javaCode\基础语法\out\production\基础语法;D:\IDEA\IntelliJ IDEA 2022.1.2\lib\idea_rt.jar

         */
    }
}
