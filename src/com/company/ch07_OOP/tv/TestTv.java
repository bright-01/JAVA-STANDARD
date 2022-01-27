package com.company.ch07_OOP.tv;

public class TestTv {
    private boolean power;
    private int ch;
    private int vol;

    public void operPower(){
        this.power = !this.power;
    }

    public void upCh(){
        this.ch++;
    }

    public void downCh(){
        this.ch++;
    }

    public void upVol(){
        this.vol++;
    }

    public void downVol(){
        this.vol--;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }
}
