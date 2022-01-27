package com.company.ch07_OOP.interfactLift;

public class Factory extends Building implements Liftable {

    LiftableImpl l = new LiftableImpl();
    private int z;

    @Override
    public void liftOff() {
        l.liftOff();
    }

    @Override
    public void move(int x, int y) {
        if(x>y){
            setZ(3);
        }
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
