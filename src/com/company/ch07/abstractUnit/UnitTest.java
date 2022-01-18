package com.company.ch07.abstractUnit;

public class UnitTest {
    public static void main(String[] args) {
        Unit [] group = new Unit[3];
        group[1] = new Marine();
        group[2] = new Tank();
        group[3] = new Dropship();

        Unit[] group3 = { new Marine(), new Tank(), new Dropship()};


    }
}
