package com.company;

import com.company.ch06.Tv;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(Arrays.toString(args));


        int integer1 = 1000000000;
        long long1 = 11_00_000_000_000l;

//        System.out.println(integer1);
//        System.out.println(long1);

        LOOP1:
        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                if (j == 4) {
                    break LOOP1; // >> 이중 반복문일 경우

                } else {
                    break; // >> 이건 하나만
                }
            }
        }

        // 배열
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        // 출력
        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
        }

//        System.out.println(Arrays.toString(arr1));

        String[] strArr = {"abc", "def", "ghi"};
        String[] strArr2 = {"abc", "def", "ghi"};

        int[][] strArr2D = {
                {123, 456, 789},
                {321, 654, 987}
        };
        int[][] strArr2D2 = {
                {123, 456, 789},
                {321, 654, 987}
        };


//        System.out.println(Arrays.toString(strArr));
//        System.out.println(Arrays.deepToString(strArr2D));
//
//        System.out.println(Arrays.equals(strArr, strArr2));
//        System.out.println(Arrays.deepEquals(strArr2D, strArr2D2));
        System.out.println(Tv.user);;
        System.out.println(Tv.componentNumber);;

        Tv[] tvArr = new Tv[3];
        System.out.println(tvArr);

        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();

        System.out.println(tvArr);
        System.out.println(tvArr[0]);







    }
}
