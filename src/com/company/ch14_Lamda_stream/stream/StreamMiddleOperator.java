package com.company.ch14_Lamda_stream.stream;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMiddleOperator {
    /**
     * 중간연산
     * 스트림 자르기 skip(), limit()
     * Stream<T> skip(long n ) // 앞에서부터 n개 건너뛰기
     * Stream<T> limit(long maxSize) // maxSize 이후의 요소는 잘라냄
     *
     * 스트림 요소 걸러내기 - filter(), distinct()
     * Stream<T> filter(Predicate<? super T> predicate) // 조건에 맞지 않는 요소 제거
     * Stream<T> distinct() // 중복 제거
     *
     * 스트림 정렬 - sorted()
     * Stream<T> sorted()
     * Stream<T> sorted(Comparator comparator) // 지정된 Compartor로 정렬
     *
     * Comparator의 comparing()
     *
     * */
    public static void main(String[] args) {
        //스트림 자르기 skip(), limit()
        IntStream intStream = IntStream.rangeClosed(1, 10) ; //12345678910
        intStream.skip(3).limit(5).forEach(System.out::print); // 45678

        //스트림 요소 걸러내기 - filter(), distinct()
        IntStream intStream1 = IntStream.of(1,2,3,4,5,6,7,4,1,2,3,4);
        intStream1.distinct().forEach(System.out::println);

        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.filter(i->i%2==0).forEach(System.out::println);
        intStream2.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::println);

        Stream<Student> studentStream = Stream.of(
                new Student("김자바", 3, 300),
                new Student("이자바", 2, 200),
                new Student("안자바", 1, 100),
                new Student("박자바", 2, 200),
                new Student("소자바", 1, 299),
                new Student("나자바", 3, 179),
                new Student("가자바", 3, 123)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan) // 반별정렬
                .thenComparing(Comparator.naturalOrder())) // 기본정렬
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student>{

    String name;
    int ban;
    int totalScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public Student(String name, int ban, int totalScore) {
        this.name=name;
        this.ban=ban;
        this.totalScore=totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}