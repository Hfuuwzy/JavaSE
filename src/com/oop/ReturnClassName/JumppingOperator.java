package com.oop.ReturnClassName;
//方法的形参是接口名，其实是需要该接口的实现类对象
//方法的返回值是接口名，其实返回的是该接口的实现类对象
public class JumppingOperator {
    public void UseJumpping(Jumpping a){
        a.jump();

    }

    public Jumpping getJumpping(){
        Jumpping a = new JumppingImp();//new JumpingImp
        return a;
    }
}
