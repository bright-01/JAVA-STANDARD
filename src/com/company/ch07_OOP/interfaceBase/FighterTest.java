package com.company.ch07_OOP.interfaceBase;

public class FighterTest {
    public static void main(String[] args) {
        Unit2 u =  new Fight();
        u.move(1,2 );
        u.stop();
//        u.attack(new Fight()) // unit2의 클래스에는 attack가 없음 --> 항상 객체가 어떤게 만들어졌는지가 중요

        Fightable f = new Fight();
        f.move(1,2);
        f.attack(new Fight());
//        f.stop() // fightable에는 move가없다





    }
}
