package com.company.ch07_OOP.car;

public class FireCar extends Car{
    private boolean water;

    FireCar(){
        this(false, 34, true);
    }

    FireCar(boolean power, int number, boolean water){
        super(power, number);
        this.water = water;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }
}
