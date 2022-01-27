package com.company.ch07_OOP.abstractTest;

public class AudioPlayer extends Player {
    @Override
    void playStart(int pos) {
        System.out.println("pos : "+ pos);
    }

    @Override
    void playStop() {
        System.out.println("멈춤");

    }
}
