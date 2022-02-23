package com.company.ch14_Lamda_stream.javaUtilsFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class UtilFunction {
    /**
     * java.util.function 패키지
     * >>자주 사용되는 다영한 함수형 인터페이스를 제공.
     * java.lang.Runnable | void run() | 매개변수도 없고, 반환값도 없음
     * Supplier<T>      | T get()  -> T |   매개변수는 없고, 반환값만 있음.
     * Consumer<T>      | T -> void accept( T t) | Supplier와 반대로 매개변수만 있고, 반환값이 없음
     * Function<T, R>   | T -> R applay ( T t)   | 일반적인 함수. 하나의 매개변수를 받아서 결과를 반환
     * Predicate<T>     | T -> boolean test (T t) -> boolean | 조건식을 표현하는데 사용됨. 매개변수는 하나. 반환 타입은 boolean
     *
     * Predicate<String> isEmptyStr =  s -> s.length() == 0;
     * String s = "";
     * if(isEmptyStr.test(s)){ // if(s.length() == 0 )
     *     System.out.println("This is an empty String. ");
     * }
     *
     * >> 매개변수가 2개인 함수형 인터페이스 ( Bi 두개라는 뜻 )
     * BiConsumer<T,U>      | T,U -> void accept(T t, U u)      | 두개의 매개변수만 있고, 반환값이 없음
     * BiPredicate<T,U>     | T,U -> boolean test(T t, U u) -> boolean | 조건식을 표현하는데 사용됨. 매개변수는 둘, 반환값은 boolean
     * BiFunction<T,U,R>    | T,U -> R apply(T t, U u) -> R     | 두 개의 매개변수를 받아서 하나의 결과를 반환
     *
     * ** Custom FunctionInterface
     * @FunctionInterface
     * interface TriFunction<T, U, V, R> {
     *     R apply(T t, U u, V v);
     * }
     * // 이런식으로 만들면 된다.
     *
     * >> 매개변수의 타입과 반환타입이 일치하는 함수형 인터페이스
     * UnaryOperator<T>     | T -> T apply(T t) -> T | function의 자손. Function과 달리 매개변수와 결과의 타입이 길다.
     * BinaryOperator<T>    | T, T -> T apply ( T t, T t) -> T |    BiFunction의 자손 BiFunction과 달리 매개변수와 결과의 타입이 같다.
     *
     * */

    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 1~100 난수
        System.out.println(s.get());
        Consumer<Integer> c = i -> System.out.print(" " + i);
        c.accept(2);
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(11));
        Function<Integer, Integer> f = i -> (i / 10) * 10;
        System.out.println(f.apply(200));

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);

        printEvenNum(p, c, list);

        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }

    // 입력값이 <T>이고 반환값 List<T> .. 앞에 T의 타입을 바꾸면 매개변수값이 .... 그 타입에 맞게 바
    private static <T> List<T>  doSomething(Function<T, T> f, List<T> list){
        List<T> newList = new ArrayList<T>(list.size());
        for(T t : list){
            newList.add(f.apply(t));
        }
        return newList;
    }

    private static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.print("[");
        for(T t: list){
            if(p.test(t)) c.accept(t);
        }
        System.out.println("]");
    }

    private static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for(int i = 0; i < 10; i++){
            list.add(s.get());
        }
    }
}
