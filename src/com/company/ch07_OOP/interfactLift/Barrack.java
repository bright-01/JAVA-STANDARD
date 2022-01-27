package com.company.ch07_OOP.interfactLift;

public class Barrack extends Building implements Liftable{

    LiftableImpl l = new LiftableImpl();

    @Override
    public void liftOff() {
        l.liftOff();
    }

    @Override
    public void move(int x, int y) {
        l.move(2,3);

    }

    @Override
    public void stop() {
        l.stop();

    }

    @Override
    public void land() {
        l.land();
    }
}
