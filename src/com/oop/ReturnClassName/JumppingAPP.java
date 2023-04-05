package com.oop.ReturnClassName;

public class JumppingAPP {
    public static void main(String[] args) {
        JumppingOperator j0 = new JumppingOperator();
        Jumpping j   = new JumppingImp();
        j0.UseJumpping(j);

        Jumpping j2 = j0.getJumpping();//new JumpingImp
        j2.jump();

    }
}
