package com.company.ch07.tv;

// 조상이 될수 없음 왜냐면 private로 생성된 생성자를 자식에서 호출 할 수 없기 떄문에 ==> 클래스를 final로 만들어 줘서 상속하지 못하게 만든다.
public final class StaticTimeTest {

    private static StaticTimeTest staticTimeTest = new StaticTimeTest(12,34,56);

    private int hour, minute, second;
    private StaticTimeTest(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public static StaticTimeTest getInstance(){
        return staticTimeTest;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
