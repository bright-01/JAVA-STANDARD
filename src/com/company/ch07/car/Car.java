package com.company.ch07.car;

public class Car {
    private boolean power;
    private int number;



    Car(){
        this(false, 23);
    }

    Car(boolean power, int number){
        this.power = power;
        this.number = number;
    }


    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
