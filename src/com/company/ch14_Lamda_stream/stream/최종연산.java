package com.company.ch14_Lamda_stream.stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 최종연산 {
    /**
     * stream의 연산
     * 중간연산 - n 번 , stream을 반환, limit, skip, filter, distinct, map, peek ..
     * 최종연산 - 1번, 스트림 닫힘, foreach, allMatch, anyuMatch, reduce, collect ..
     *
     * 최종연산
     * forEach() - 병렬 스트림인 경우 순서가 보장되지 않음
     * forEachOrdered() - 병렬 스트림인 경우에도 순서가 보장됨
     * IntStream.range(1, 10).sequential().forEach(System.out::print); //123456789
     * IntStream.range(1, 10).sequential().forEachOrdered(System.out::print); //123456789
     * IntStream.range(1, 10).parallel().forEach(System.out::print); //652341798 병렬일 경우에 순서 보장이 안된다.
     * IntStream.range(1, 10).parallel().forEachOrdered(System.out::print); //123456789
     *
     * 스트림의 조건 검사
     * allMatch() - boolean allMatch( Predicate< ? super T> predicate) 모든 요소가 조건을 만족시키면 ture
     * anyMatch() - boolean anyMatch( Predicate< ? super T> predicate) 한 요소라도 조건을 만족 시키면 true
     * noneMatch() -  boolean noneMatch( Predicate< ? super T> predicate) 모든 요소가 조건을 만족시키지 않으면 ture
     *
     * 조건에 일치하는 요소 찾기
     * findFirst() - Optional<T> FindFirst() // 첫 번째 요소를 반환. 순차 스트림에 사용. 찾는게 null수도 있으니까
     * findAny() - Optional<T> FindAny() // 아무거나 하나를 반환. 병렬 스트림에 사용
     * Optional<Student> result = stuStream.filter(s->s.getTotalScore()) <= 100).findFirst();
     * Optional<Student> result = parallelStream.filter(s->s.getTotalScore()) <= 100).findAny();
     *
     * 스트림의 요소를 하나씩 줄여가며 누적연산을 수행
     * reduce()
     * int count = intStream.reduce(0, (a,b)->a+1);
     * int sum = intStream.reduce(0, (a,b)->a+b);
     * int max = intStream.reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b); //max
     * int max = intStream.reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b); //min
     *
     *
     * */

    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);
        Stream.of(strArr).parallel().forEachOrdered(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
        Optional<String> sWord = Stream.of(strArr).filter(s->s.charAt(0)=='s').findFirst();
        Optional<String> sWord2 = Stream.of(strArr).parallel().filter(s->s.charAt(0)=='s').findAny();

        System.out.println(noEmptyStr);
        System.out.println(sWord);

        //Stream<Strin[]>을 IntStream으로 변환
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b)-> a+ 1);
        int sum = intStream1.reduce(0, (a, b)-> a+b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println(count);
        System.out.println(sum);
        System.out.println(max.getAsInt());
        System.out.println(min.getAsInt());



    }
}
