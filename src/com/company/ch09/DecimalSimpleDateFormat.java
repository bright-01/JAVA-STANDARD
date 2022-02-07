package com.company.ch09;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DecimalSimpleDateFormat {
    /**
     * 숫자와 날짜를 원하는 형시으로 쉽게 출력 가능 ( 숫자, 날짜 -> 형식 문자열 )
     *
     *
     *
     * */

    public static void main(String[] args) throws ParseException {
        // DecimalFormat -- 숫자를 형식화 할때 사용 ( 숫자 -> 형식 문자열 )
        double number= 123457.89;
        DecimalFormat df = new DecimalFormat("#.#E0");
        String result = df.format(number);

        DecimalFormat df2 = new DecimalFormat("#,###.##");
        Number num = df2.parse("1,234,567.89"); // Number는 모든 숫자 래퍼 클래스
        double d = num.doubleValue();


        // SimpleDateFormat - 날짜와 시간을 다양한 형식으로 풀력할 수 있게 해준다.
        Date today = new Date();
        SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
        String result2 = df.format(today); // Date to String

        Date d2 = df3.parse("2029-03-23"); // String to Date




    }

}
