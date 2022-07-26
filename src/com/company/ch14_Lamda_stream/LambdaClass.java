package com.company.ch14_Lamda_stream;

public class LambdaClass{
    /**
     * 람다식은 익명 함수가 아니라 익명객체이다
     * 이름과 반환 타입을 제거 하고 매개변수 선언부와 몸통 {} 사이에 -> 를 추가한다.
     * int max ( int a, int b){
     *     return a>b ? a:b;
     * }
     * -->
     * (int a,  int b) -> { return a>b?a:b;}
     * -->
     * (a, b) -> { return a>b?a:b;}
     * -->
     * (a,b) -> a>b ? a:b
     * (a,b) -> a>b ? a:b
     * (a,b) -> a>b ? a:b
     * */
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a: b; // 람다식, 익명객체 아래와 같다.
//        Object obj = new Object(){
//            int max(int a, int b){
//                return a>b?a:b;
//            }
//        };
//        int value = obj.max(3,5); // 함수형 인터페이스가 필요
//        int value = obj.max(3,5); // 함수형 인터페이스가 필요
//        int value = obj.max(3,5); // 함수형 인터페이스가 필요
//        int value = obj.max(3,5); // 함수형 인터페이스가 필요

    }
}