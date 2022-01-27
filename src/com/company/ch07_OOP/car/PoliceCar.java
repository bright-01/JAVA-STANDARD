package com.company.ch07_OOP.car;

public class PoliceCar extends Car{
    private boolean isSound;


    private int sound;


    PoliceCar(){
        this(5, false);
    }

    PoliceCar(int sound, boolean isSound){
        this.sound = sound;
        this.isSound = isSound;
    }

    public boolean isSound() {
        return isSound;
    }

    public void setSound(boolean sound) {
        isSound = sound;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }



}
