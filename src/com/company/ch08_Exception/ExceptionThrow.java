package com.company.ch08_Exception;

/**
 * 예외 발생시키기
 * 1. 연산자 new를 이용해서 발생시기려는 예외클래스의 객체를 만든다
 * Exception e = new Exception("고의로 발생")
 * 2.키워드 throw를 이용해서 예외를 발생
 * thorw e;
 *
 * checked 예외 - 컴파일러가 예외 처리 여부를 체크 ( 예외 처리 필수 )
 * unchecked 예외 - 컴파일러가 예외 처리 여부를 체크 안함 ( 예외 처리 선택 )
 *
 */
public class ExceptionThrow {
    public static void main(String[] args) throws Exception { // 자바 jvm에 넘겨버림, 프로그램 비정상 종료 --> 넘기기만 하지말고 한곳은 반드시 try catch로 처리 해야한다.
        try {
            Exception e = new Exception("고의로 발생"); // 예외 객체를 생성하고
            throw e;  // 예외를 발생 시킴 -> catch로 던짐

            // throw new Exception("고의로 발생 ");
        } catch (Exception e) {
            // 여기서 예외를 처리
            System.out.println("에러메시지 : " + e.getMessage()); // getMessage()에서는 '고의로 발생'이 나옴
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        throwTest();
    }

//    throw new Exception(); // checked 예외 컴파일러가 발생 시킴 --> try catch로 예외를 처리 해줘야 한다.


    public static void throwTest() throws Exception {

    }

}
