package com.company.ch07_OOP.interfactLift;

public class LiftableImpl implements Liftable{
    @Override
    public void liftOff() {
        System.out.println("liftOff");
        System.out.println("liftOff");
        System.out.println("liftOff");
        System.out.println("liftOff");
        System.out.println("liftOff");
        System.out.println("liftOff");
        System.out.println("liftOff");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("move");
    }

    @Override
    public void stop() {
        System.out.println("stop");

    }

    @Override
    public void land() {
        System.out.println("land");

    }
}
