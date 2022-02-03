package com.company.ch09;

public class StringBufferTest {
    /**
     * String처럼 문자열 배열을 내부적으로 가지고 있다. 문자열을 저장할 때 사용한다.
     * String은 불변이다. 변경불가. String을 더하거나 할 때 늘 새로운 String이 생김 ==> 메모리에 새로 할당
     *  ==> 배열은 길이 변경 불가능 하기 때문에 공간이 부족하면 새로운 배열을 생성 해야한다. 1. 새로운 메모리에 공강 할당 2. 배열값 복사 3. 메모리 주소 변경
     * StringBuffer은 가변
     * append로 내용 변경이 가능하다. ( append, delete, insert ) ==> 반환타입이 StringBuffer ( 자기 주소를 반환함 )
     *
     *
     * StringBuffer은 equals()가 오버라이딩 되어 있지 않다 ( 그래서 주소비교함)
     * ==> String으로 변환 후 equals로 비교 해야한다.
     * */

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append("cdf");

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println(sb1 == sb2); // false 주소 비교니까..
        System.out.println(sb.equals(sb2)); // false

        // StringBuffer을 String으로 변환 후 equals로 비교
        String s1 = sb1.toString();
        String s2 = sb2.toString();

        System.out.println(s1.equals(s2)); // true



    }
}
