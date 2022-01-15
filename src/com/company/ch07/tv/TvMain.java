package com.company.ch07.tv;

public class TvMain {
    public static void main(String[] args) {
        TestTv testTv = new TestTv();
        testTv.setCh(1);
        testTv.upCh();
        System.out.println(testTv.getCh());

        TestTv smartTv = new SmartTv();
        SmartTv smartTv2 = new SmartTv();
        smartTv.setVol(1);
        smartTv2.setName("이게 된다");



    }
}
