package com.company.ch14_Lamda_stream.stream;

public class StreamOperator {
    /**
     * 스트림의 연산
     * 스트림이 제공하는 기능 - 중간 연산과 최종 연산
     * *중간 연산 - 연산결과가 스트림인 연산. 반복적으로 적용가능
     * *최종 연산 - 연산 결과가 스트림이 아닌 연산. 단 한번만 적용 가능( 스트림의 요소를 소모)
     * Stream.distinct().limit(5).sorted().forEach(System.out::println)
     *         중간연산     중간연산   중간연산         최종연산
     *
     * Stream<T> distinct() : 중복 제거
     * Stream<T> filter(Predicate<T> predicate) 조건에 맞는 요소 제외
     * Stream<T> limit(long maxSize) : 스트림의 일부를 잘라낸다.
     * Stream<T> skip(long n ) : 스트림의 일부를 건너뛴다.
     * Stream<T> peek ( Consumer<T> action ) 스트림의 요소에 작업 수행
     * Stream<T> sorted()
     * Stream<T> sorted(Comparator<T>, comparator) 스트림의 요소를 정렬한다.
     * Stream<R>            map(Function<T, R> mapper)
     *     DoubleStream     mapToDouble(toDoubleFunctoin<T> mapper)
     *     IntStream        mapToInt(toIntFunction<T> mapper)
     *     LongStream       mapToLong(ToLongFunction<T> mapper)
     *     스트림의 요소를 변환한다.
     * Stream<R>            flatMap(Function<T, Stream<R>> mapper)
     *
     *
     * 스트림의 최종 연산
     * void forEach(Consumer< ? super T> action) 각요소에 지정된 작업 수행
     * void forEachOrdered (consumer <? super T > action 순서유지. 병렬스트림.
     * long count()
     * Optional<T> max(Comparator<? super T> Comparator )
     * Optional<T> min (Comparator<? super T> Comparator )
     * Optional <T> findAny 병렬 filter와 함께 사용
     * Optional <T> findFirst 직렬 filter와 함께 사용
     * boolean allMatch(Predicate<T> P) 모두 만족?
     * boolean anyMatch(Predicate<T> P) 하나라도 만족?
     * boolean noneMatch(Predicate<T> P) 모두 만족하지 않는지
     * Object[] toArray()
     * A[]      toArray(IntFunction<A[]> generator 스트림의 모든 요소를 배열로 반환
     *
     * 스트림의 요소를 하나씩 줄여가며 (리듀싱 ) 계산한다
     * Optional<T> reduce (BinaryOperator<T> accumulator)
     * T reduce(T identity, BinaryOperator<T> accumulator)
     * U reduce(U identity, BinaryOperator<T> accumulator, BinaryOperator<U> combiner)
     *
     * 스트림의 요소를 수집한다. 주로 요소를 그룹화 하거나 분활 하는 결과를 컬렉션에 담아 반환하는데 사용한다.
     * R collect(Collector<T,A,R> collector)
     * R collect(Supplier<R> supplie, BiComsumer <R, T> accumulator, Biconsumer<R, R> combiner)
     *
     * */
}
