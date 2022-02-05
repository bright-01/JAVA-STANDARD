package com.company.ch09;

import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
    /**
     * Date의 메서드는 대부분 Deprecated되었지만 여전히 사용
     *
     * */
    public static void main(String[] args) {
        // Calendar to Date
        Calendar cal = Calendar.getInstance();
        Date d = new Date(cal.getTimeInMillis()); // Date(long date)

        // Date to Calendar
        Date d2 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal.setTime(d2);

    }
}
