package com.company.ch14_Lamda_stream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamClass {
    /**
     * 스트림
     * 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
     * 스트림이 제공하는 기능-  중간 연산과 최종 연산
     * 중간 연산 - 연산결과가 스트림인 연산. 반복적으로 적용 가능
     * 최종연산 - 연산결과가 스트림이 아닌 연산. 단 한번만 적용가능( 스트림의 요소를 소모)
     * <p>
     * stream.distinct().limit(5).sorted().forEach(System.out::println)
     * <p>
     * **스트림은 데이터 소스로부터 데이터를 읽기만 할 뿐 변경하지 않는다.
     * **스트림은 Iterator 처럼 1회용이다. ( 필요하면 스트립을 생성해야 한다)
     * strStream.forEach(System.out::println); // 모든 요소를 화면에 출력 (최종연산 )
     * int numOfStr = strStream.count(); 에러 스트림이 이미 닫혔음. 위에서 최종 연산을 했기때문에.
     * <p>
     * ** 최종연산 전까지 중간 연산이 수행되지 않는다. - 지연된 연산
     * IntStream intStream = new Random().ints(1,46); // 무한 스트림
     * intStream.distinct().limit(6).sorted().forEach(i->System.out.print(i+"")); // 중간연산 , forEach 최종연산
     * <p>
     * ** 스트림은 작업 내부 반복으로 처리한다.
     * strea.forEach(System.out::println); 코드가 간결해진다
     * <p>
     * ** 스트림의 작업을 병렬로 처리 - 병렬스트림( 멀티 쓰레드 )
     * Stream<String> strStream = Stream.of("dd", "aaa", "cc", "CC", "b");
     * int sum = strStream.parallel() // 병렬 스트림으로 전환 ( 속성만 변경 )
     * .mapToInt(s -> s.length()).sum(); // 모든 문자열의 길이의 합
     * <p>
     * ** 기본형 스트림 - IntStream, LongStrea, DoubleStream
     * - 오토박싱&언박싱의 비효율이 제거됨 ( Stream<Integer> 대신 IntStream사용)
     * - 숫자와 관련된 유용한 메서드를 Stream<T> 보다 더 많이 제공
     * <p>
     * <p>
     * *** 스트림 만들기
     * ### 컬렉션
     * -Collection 인터페이스의 stream()으로 컬렉션을 스트림으로 변환
     * List<Integer> list = Arrays.asList(1,2,3,4,5);
     * Stream<Integer> intStream = list.stream(); // list를 스트림으로 변환
     * <p>
     * intStream.forEach(System.out::print) // 12345
     * intStream.forEach(System.out::print) // 에러 .. 이미 위에서 써서 닫혔다.
     *
     * ### 배열
     * Stream<T> Stream.of(T... values) // 가변인자
     *
     *
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(System.out::print);
        intStream.forEach(System.out::print); // 이건 에러남 이미 닫혔거든

        // 스트림은 1회용. 스트림에 대해 최종연산을 수행하면 stream이 닫힌다.
        intStream = list.stream();
        intStream.forEach(System.out::print); // 이건 안나 .. 다시 위에서 생성했거든

        // 배열
        Stream<String> strStream = Stream.of("a", "b", "c", "d");
        Stream<String> strStream2 = Arrays.stream(new String[]{"1", "2", "3", "4"});
        Integer[] intArr = {1,2,3,4,5};
        Stream<Integer> intStream3 = Arrays.stream(intArr);

        strStream.forEach(System.out::print);


    }
}
