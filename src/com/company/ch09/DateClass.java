package com.company.ch09;

import java.util.Calendar;

public class DateClass {
    /**
     * java.util.Date
     * - 날짜와 시간을 다룰 목적으로 만들어진 클래스 jdk1.0
     * - Date 메서드는 거의 deprecated되었지만, 여전히 쓰이고 있음
     *
     * java.util.Calendar
     * - Date클래스를 개선한 새로은 클래스 jdk 1.1 여전히 단점 존재
     * -정의된 필드
     * -- 날짜
     *  YEAR                년
     *  MONTH               월( 0월부터 시작 그래서 +1해주는거 )
     *  WEEK_OF_YEAR        일 (1월1일 부터 지금이 몇번째 주인지)
     *  WEEK_OF_MONTH       그 달의 몇 번쨰 주
     *  DATE                일
     *  DAY_OF_MONTH        그 달의 몇 번째 일
     *  DAY_OF_YEAR         그 해의 몊 번째 일
     *  DAY_OF_WEEK         요일 ( 1 ~ 7 )
     *  DAY_OF_WEEK_IN_MONTH 그 달의 몇 번째 요일
     * -- 시간
     *  HOUR                시간 ( 0 ~ 11)
     *  HOUR_OF_DAY         시간 ( 0 ~ 23 )
     *  MINUTE              분
     *  SECOND              초
     *  MILLISECOND         천분의 일초 1/1000 | 1000 => 1초
     *  ZONE_OFFSET         GMT 기준 시차
     *  AM_PM               오전/오후후     * java.time패키지
     * - Date 와 Calendar의 단점을 개선한 새로운 클래스들을 제공 JDK1.8
     * - localDate / localTime / localDateTime
     *
     * * */

    public static void main(String[] args) {
//        Calendar cal = new Calendar();  // 에러! Calendar 클래스는 추상클래스라서 인스턴스를 생성 할 수 없다.
        Calendar cal = Calendar.getInstance(); // getInstance()메서드는 Calendar 클래스를 구현한 클래스의 인스턴스를 반환한다.
        // 처음에 인스턴스를 생성하면 현재 날짜와 시간으로 세팅이된다.
        int thisYear = cal.get(Calendar.YEAR); // 올해가 몇년인지 알아낸다.
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이달의 마지막

        //set으로 날짜 지정
        // 다양한 날짜와 시간을 받는다..
        cal.set(2019, 4, 15); // 2019년 5월 15일

        //시간지정
        cal.set(Calendar.HOUR_OF_DAY, 10); // 10시 20분 30초로 지정 하는 방법
        cal.set(Calendar.MINUTE, 20);
        cal.set(Calendar.SECOND, 30);


        // 날짜 예제
        // 요일은 1부터 시작하기 때문에 0번째 인덱스를 비워둠
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // month의 경우 0부터 시작하기 때문에 4월인 경우에는 3으로 지정해야한다.
        // date1.set(2019, Calendar.APRIL, 29)와 같이 할 수도 있음
        date1.set(2019, 3, 29); // 2019년 4월 29일로 날짜를 지정
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[2]+"요일이고,") ;
        System.out.println("date2"+toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일이다");

        //날짜 차이를 얻으려면, getTimeInMillis()로 변환해서 구함
        long difference = (date2.getTimeInMillis()) - (date1.getTimeInMillis())/1000;
        // 이러면 초가 떨어짐
        // 일로 계산하려면 difference / (24*69*60 ) 하면됌


        // 시간
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME={"시간", "분", "초"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10); // time1을 10시 20분 30초로 설정
        time1.set(Calendar.MINUTE, 30);
        time1.set(Calendar.SECOND, 10);

        time2.set(Calendar.HOUR_OF_DAY, 20); // time1을 20시 20분 30초로 설정
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        long diff = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000; // 차이나는 시간이 -수도 있으니까 절대값으로 표시
        String tmp = "";
        for(int i = 0; i < TIME_UNIT.length; i++){
            tmp+= diff/TIME_UNIT[i] + TIME_UNIT_NAME[i];
            diff %=TIME_UNIT[i];
        }
        // tmp에 시분초로 변환한 값이 들어가 있다.


        //Clear()
        Calendar dt = Calendar.getInstance();

        System.out.println(dt.getTimeInMillis());; // 현재값이 들어가지만
        dt.clear(); // 항상 초기화 하고 클리어를 하고 set으로 날짜를 세팅해야한다!!
        System.out.println(dt.getTimeInMillis());; // 1970년1월1일 00:00:00이 들어감

        // add -- add는 다른 필드의 영향을 준다. 2020, 12, 31 에 +1일을 하면 2021, 1, 1 이 되지만
        dt.set(2020, 7, 31);
        dt.add(Calendar.DATE, 1);
        dt.add(Calendar.MONTH, -8);

        //roll -- 다른 필드에 영향을 주지 않는다, 2020, 12, 1이 된다.
        dt.roll(Calendar.DATE, 1);
        dt.roll(Calendar.MONTH, 1);



   }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONDAY)+1) + "월" + (date.get(Calendar.SECOND)) + "초";
    }
}
