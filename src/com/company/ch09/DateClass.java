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



    }
}
