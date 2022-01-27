package com.company.ch07_OOP.interfaceRepair;

public class UnitTest {
    public static void main(String[] args) {
        Tank tank = new Tank(10);
        Dropship dropship = new Dropship(10);
        Marine marine = new Marine(5);
        SCV scv = new SCV(4);

        scv.repair((tank));
        scv.repair(dropship);
//        scv.repair(marine);
    }
}
