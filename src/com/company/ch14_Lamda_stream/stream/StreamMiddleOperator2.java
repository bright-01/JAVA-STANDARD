package com.company.ch14_Lamda_stream.stream;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMiddleOperator2 {
    /**
     * map
     * Stream<R> map(Function mapper) // Stream<T>->Stream<R>
     * Stream<File> fileStream = Stream.of(new File("F1.java"), new File("F2.java"),new File("F3.java"),new File("F4.java"),new File("F5.java"));
     * Stream<String> fileNameStream = fileStream.map(File::getName);
     * fileNameStream.forEach(System.out::println); // 스트림의 모든 파일 이름 출력
     *
     *
     *  스트림의 요소를 소비하지 않고 엿보기 - peek
     *  Stream<T> peek(Comsumer action) // 중간 연산 스트림을 소비 X
     *  void forEach(Comsumer action) // 최종 연산 ( 스트림을 소비 O)
     *
     *  스트림의 스트림을 스트림으로 변환flatMap()
     *  Stream<String[]> strArrStrm = Stream.of(new String[]{"abc", "def", "ghi"}
     *
     * */

    public static void main(String[] args) {
        File[] fileArr = {
                new File("F1.java"),
                new File("F2.java"),
                new File("F3.java"),
                new File("F4.java"),
        };

        Stream<File> fileStream = Stream.of(fileArr);
        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.')!=-1)
                .map(s->s.substring(s.indexOf('.')+1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);


        //peek
        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.')!=-1)
                .peek(s->System.out.printf("filename =%s%n", s))
                .map(s->s.substring(s.indexOf('.')+1))
                .peek(s->System.out.printf("extension=%s%n", s))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        //flatMap
         Stream<String[]> strArrStream = Stream.of(
                 new String[]{"abc", "def", "jkl"},
                 new String[]{"ABC", "GHI", "JKL"}

         );

         Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
         strStream.map(String::toLowerCase)
                 .distinct()
                 .sorted()
                 .forEach(System.out::println);

         String[]lineArr={
                 "Believe or not It is ture",
                 "Do or do not There is not try"
         };
         Stream<String> lineStream = Arrays.stream(lineArr);
         lineStream.flatMap(line -> Stream.of(line.split(" +")))
                 .map(String::toLowerCase)
                 .distinct()
                 .sorted()
                 .forEach(System.out::println);



    }

}