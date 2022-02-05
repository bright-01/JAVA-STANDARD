package com.company.ch09;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WrapperClass {
    /**
     * 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
     * 모든 래퍼 클래스는 크기에 대한 정보를 갖는다..
     * 모든 숫자 래퍼 클래스의 조상은 Number
     *
     * + BiGInteger 아주 큰 정수
     *   BigDecimal 아주 큰 실수
     * */

    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i==i2); // false 둘다 객체라서 주소가 다르다..
        System.out.println(i.equals(i2)); // true 이건 내용 비교를 하기 때문에
        System.out.println(i.compareTo(i2)); //0으로 나옴 같0, 작+, 크- --<정렬에 사용
        System.out.println(i.toString()); // 100


        /**
         * 문자열을 숫자로 변환
         * */
        int ii = new Integer("100").intValue(); // flatValue(), longValue()
        int ii2 = Integer.parseInt("100"); // 주로 많이 사용
        Integer ii3 = Integer.valueOf("100");
        // 나머지 래퍼 클래스들도 동일함.
        // 문자열 -> 기본형 :  WrapperClass.parse래퍼클래스형,
        // 문자열 -> 래퍼 클래스 : .valueOf()
        // 래퍼클래스 -> 문자열 : .toString()


        /**
         * 오토박싱 & 언박싱
         * int -> Integer 오토박싱
         * Integer -> int 언박싱
         * jdk1.5 이전에는 기본형과 참조형간의 연산이 불가능 했다
         *
         * */
        int iii = 5;
        Integer iObj = new Integer(7);
        int sum1 = iii + iObj; // 이게 이전에는 자동으로 연산이 안됐는데,
        int sum2 = iii + iObj.intValue(); // 이렇게 자동으로 컴파일러가 변경해서 연산을 해준다 Integer -> int로 바꿔줌 언박싱!


        ArrayList<Integer> list = new ArrayList<Integer>(); // ArrayList는 객체만 저장이 가능.. 근데 컴파일러가 자동으로 저장할 수 있게 오토박싱, 언박싱
        list.add(1); // 이것도 오토박싱이 적용된것임
        list.add(new Integer(2)); // 이렇게 넣어줘야함 왜 냐면 제네릭 타입이 Integer니까

        int val1 = list.get(0); // 이것도 언박싱이 적용된것.
        int val2 = list.get(0).intValue(); // 이렇게 변환해줘야하는데..

        // 형변환
        int iiii = 10;
        Integer intg = iiii; // 이것도 자동으로 허용해준다 오토박싱
        Integer intg2 = (Integer) iiii; // 이것도 같은 내용이고
        Integer intg3 = Integer.valueOf(iiii); // 이렇게 써줘야하는걸 위 처럼 해줌



    }
}
