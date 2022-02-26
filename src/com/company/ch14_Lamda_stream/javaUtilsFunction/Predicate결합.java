package com.company.ch14_Lamda_stream.javaUtilsFunction;

import java.util.PrimitiveIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate결합 {
    /**
     * Predicate의 결합
     * && || !
     * and, or, negate로 두 Predicate를 하나로 결합 ( default 메서드 )
     * Predicate<Integer> p = i -> i < 100;
     * Predicate<Integer> q = i -> i > 200;
     * Predicate<Integer> r = i -> i%2 == 0;
     * 를
     * Predicate<Integer> notP = p.negate(); // i>=100
     * Predicate<Integer> all = notP.and(q).or(r); // 100 <= i && i < 200 || i%2 == 0
     * Predicate<Integer> all2 = notP.and(q).or(r); // 100 <= i && ( i < 200 || i %2 == 0)
     *
     * 등가 비교를 위한 Predicate의 작성에는 isEqual()를 사용 ( static 메서드 사용 )
     * Predicate<String> p = Predicate.isEqual(str1); // isEquals()는 static 메서드.
     * Boolean result = p.test(str2); //  str1 과 str2가 같은지 비교한 결과를 반환
     * ==>
     * boolean result = predicate.isEqauls(str1).test(str2)
     *
     * */

    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
        // f의 출력과 g의 입력의 타입이 같아야 연결 할 수 있다.
        // 그럼 h는 입력이 String, 출력이 String이 된다.

        Function<String, String> h = f.andThen(g);
        Function<Integer, Integer> h2  = f.compose(g);

        System.out.println(h.apply("FF"));
        System.out.println(h2.apply(2));

        Function<String, String> f2 = x -> x;
        System.out.println(f2.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100;

        Predicate<Integer> all = notP.and(q.or(r));

        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);


    }
}
