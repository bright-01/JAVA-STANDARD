package com.company.ch07_OOP.abstractTest;

public class PlayerMain {
    public static void main(String[] args) {

//        Player player = new Player();
        AudioPlayer audioPlayer = new AudioPlayer();
        Player audioPlayer2 = new AudioPlayer();

        audioPlayer.playStart(2);
        audioPlayer.playStop();

        audioPlayer2.playStart(20);
        audioPlayer2.playStop();



    }

}
