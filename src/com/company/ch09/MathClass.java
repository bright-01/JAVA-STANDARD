package com.company.ch09;

public class MathClass {
    /**
     * 수확관련 static 메서드의 집합
     * */
    public static final double E = 2.7413215645615468416156;
    public static final  double PI = 3.14159265358979323846;

    public static void main(String[] args) {
        double test = 90.7552 * 100; // --> 9075.52
        Math.round(test); // --> 9076 소수점 아래 첫자리에서 반올림

        // 주의 할점은 소수점으로 나누고 싶으면 .0 doublue이나 float로 나눠야 한다.
        // 9076 / 100.0 ==> 90.76
        // 9076 / 100  ==> 90

        // abs 절대값
        int i1 = Math.abs(-10); // 10;
        double d = Math.abs(-10.0); // 10.0

        // ceil 올림
        double d2 = Math.ceil(10.1); // 11.0
        double d3 = Math.ceil(-10.1); // -10.0
        double d4 = Math.ceil(10.000015); // 11.0

        // floor 버림
        double dd1 = Math.floor(10.8); // 10.0
        double dd2 = Math.floor(-10.8); // 11.0

        // max 둘중에 큰거
        // min 둘중에 작은거
        // random
        // rint, round 반올림


   }
}
