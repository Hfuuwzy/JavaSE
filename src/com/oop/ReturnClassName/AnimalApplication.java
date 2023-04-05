package com.oop.ReturnClassName;

public class AnimalApplication {
    public static void main(String[] args) {
        AnimalOperator a0 = new AnimalOperator();
        Animal a = new Dog();//多态的思想
        a0.UseAnimal(a);

        Animal a2 = a0.getAnimal();//new Dog()
        a2.eat();

    }
}
