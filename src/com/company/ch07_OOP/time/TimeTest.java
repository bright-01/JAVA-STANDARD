package com.company.ch07_OOP.time;

public class TimeTest {
    private int hour;
    private int minute;
    private int second;


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 && 24 > hour) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }



}
