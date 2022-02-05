package com.company.ch09;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("usage : ");
            return;
        }

        int year = 2020;
        int month = 8;
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 종료일

        // 월의 경우 0~11 을 가진다 그래서 1을 빼줘야함
        // 예를 들어, 2019년 11월 1일은 sDay.set(2019, 10, 1)과 같이 해줘야한다.
        sDay.set(year, month-1, 1);
        eDay.set(year, month, 1);

        // 다음달의 첫날( 12월 1일)에서 하루를 빼면 현재달의 마지말날 (11월 30일)이
        eDay.add(Calendar.DATE, -1);

        // 첫번째 요일이 무슨요일인지 알아낸다
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        //eday에 지정된 날짜를 얻어온다
        END_DAY = eDay.get(Calendar.DATE);

        for(int i =0; i < START_DAY_OF_WEEK; i++){
            System.out.println("     ");
        }

        for(int i = 0,  n=START_DAY_OF_WEEK; i<31;  i++,  n++ ){
            System.out.println((i<10) ? "  "+i : " " +i);
            if(n%7 == 0) System.out.println();
        }



    }
}
