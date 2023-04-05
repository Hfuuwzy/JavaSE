package com.oop.WAY;

public class Way02 {
    public static void main(String[] args) {

    }
    //静态方法和类一起加载的
    public static void a(){
        //b.()   这不能调用，存在不能调用不存在
    }
    //类实例化  之后才存在的
    public void b()
    {

    }
}
