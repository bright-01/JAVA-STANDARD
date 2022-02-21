package com.company.ch14_Lamda_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionInterface {
    /**
     * 함수형 인터페이스 - 단 하나의 추상 메서드만 선언된 인터페이스
     * interface Myfunction {
     * public abstract int max(int a, int b);
     * }
     * -->
     * Myfunction f = new Myfunction(){
     * public int max ( int a,  int b){
     * return a>b?a:b;
     * }
     * };
     * 익명 클래스 클래스의 선언, 객체생성 동시에
     * int value = f.max(3,5); MuFunction에는 max가 있음 LambdaClass의 obj는 max가 없었음
     * 함수형 인터페이스 타입의 참조변수로 람다식을 참조 할 수 있음.
     * 단 한수형 인터페이스의 메서드와 람다식의 매개변수 개수와 반환 타입이 일치해야함
     * MyFunction f = (a,b) -> a>b?a:b;
     * int value = f.max(3,5); // 실제로는 람다식 ( 익명 함수)이 호출됨
     *
     *
     *
     * 함수형 인터페이스 타입의 매개변수, 반환타입
     * 매개변수
     * void aMethod(Myfunction f){
     *     f.myMethod(); // myFunction에 정의된 메서드 호출 --> 람다식 호출
     * }
     * -->
     * Myfunction f = () -> System.out.println("myMehtod()");
     * aMethod(f);
     * aMethod(()->System.out.println("myMethod()"));
     *
     * 반환타입
     * MyFunction Mymethod(){
     *     Mufunction f= () ->{};
     *     return f;
     * }
     * -->
     * Myfynction myMethod(){
     *     return () -> {}
     * }
     */

    public static void main(String[] args) {
        // 함수형 인터페이스 사용
        Myfunction f = new Myfunction() {
            @Override
            public int max(int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못 바꾼다.
                return a > b ? a : b;
            }
        };
        int value = f.max(3, 5);

        // 람다식 ( 익명객체)를 다루기 위해서는 참조 변수의 타입은 함수형 인터페이스로 한다
        Myfunction f2 = (a, b) -> a > b ? a : b;
        int value2 = f2.max(3, 5);

        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "ccc");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        // 람다식으로
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));

        // 예제2
        MyFunction2 ff2 = () -> System.out.println("f1.run()");
        MyFunction2 ff22 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("ff22.run()");
            }
        };
        MyFunction2 ff33 = getMyFunction();

        ff2.run();
        ff22.run();
        ff33.run();

        execute(ff2);
        execute(()-> System.out.println("ff44.run"));



    }

    static void execute(MyFunction2 f){
        f.run();
    }

    static MyFunction2 getMyFunction(){
        MyFunction2 myFunction2 = () -> System.out.println("getMyFunction");
        return myFunction2;
    }

}

@FunctionalInterface // 이거 추상메서드 하나만 있을 때 붙일 수 있는거임 안 붙여도 되는데 혹시 함수형 인터페이스로 사용하려고 만들었는데 추상메서드 2개 넣으면 컴파일러가 잡아줌
interface Myfunction {
    public abstract int max(int a, int b);
//    public abstract int max2(int a, int b);
}



@FunctionalInterface
interface MyFunction2{
    void run();
}
