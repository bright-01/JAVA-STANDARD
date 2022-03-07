package com.company.ch14_Lamda_stream.stream;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTClass {
    /**
     * Optional<T>
     * T 타입 객체의 래퍼클래스
     * public final class Optional<T> {
     *     private final T value; // T 타입의 참조변수
     *     1. null을 직접 다루는 것은 위험
     *     2. 간접적으로 null을 다루기
     *     3. null체크를 하게 되면 if로 코드가 길어짐
     *
     * }
     *
     * Optional<T> 객체를 생성하는 다양한 방법
     * String  str = "abc";
     * Optional<String> optVal = Optional.of(str);
     * Optional<String> optVal = Optional.of("abc");
     * Optional<String> optVal = Optional.of(null); // NullPointerException 발생
     * Optional<String> optVal = Optional.ofNullable(null); // OK
     *
     *  null 대신 빈 Optional<T> 객체를 사용하자
     *  Optional<String> optVal = null; // 널 초기화. 바람직하지 않음
     *  Optional<String> optVal = Optional.<String>empty(); // 빈객체로 초기화
     *
     *  Optional<T> 객체의 값을 가져오는
     *  get, orElse, orElseGet, orElseThrow
     *  String str1 = optVal.get(); // optVal에 저장된 값을 반환 , null일 시 예외 발생
     *  String str1 = optVal.orElse(""); // optVal에 저장된 값이 null 일 때는, ""를 반환
     *  String str1 = optVal.orElseGet(String::new); // 람다식 사용 가능 () -> new String()
     *  String str1 = optVal.orElseThrow(NullpointerException::new); // 널이면 예외발생
     *
     * isPresent() optional객제의 값이 null이면 false,  아니면 true를 반환
     *  if(Optional.ofNullable(str).isPresent()){
     *      System.out.println(str);
     *  }
     *
     *  ###OptionlInt, OptionalLong, OptionalDouble
     *  기본형 값을 감싸는 래퍼 클래스
     *  public fincal class OptionalInt {
     *      private final boolean isPresent;
     *      private final int val;
     *  }
     *
     * */
    public static void main(String[] args) {
//        int [] arr = null;
        int[] arr = new int[0]; // 이렇게하면 에러가 안나
        System.out.println(arr.length); // null로 초기화 하면 exception이 발생
//        Optional<String> opt = null; // ok. 하지만 바람직하지 않다
        Optional<String> opt = Optional.empty(); // 이렇게 초기화 해주는게 좋다
        System.out.println("opt = " + opt);
        System.out.println("opt = " + opt.get()); // 에러 발생

        String str = "";

//        try{
//            str = opt.get();
//        } catch (Exception e){
////            e.printStackTrace();
//            str = ""; // 예외가 발생하면 빈문자열로 초기화
//        } 번거로움
        str = opt.orElse(""); // Optional에 저장된 값이 null이면 "" 반환
        str = opt.orElseGet(() -> new String());
        str = opt.orElseGet(String::new);
        System.out.println(str);


        //====================
        Optional<String> optStr = Optional.of("abc");
        Optional<Integer> optInt = optStr.map(String::length);
        Optional<Integer> optInt2 = optStr.map(s -> s.length());
        System.out.println(optStr.get());
        System.out.println(optInt.get());

        int result1 = Optional.of("123").filter(x->x.length() > 0 ).map(Integer::parseInt).get();
        int result2 = Optional.of("").filter(x->x.length()>0).map(Integer::parseInt).orElse(-1);
        System.out.println(result1);
        System.out.println(result2);

        Optional.of("456").map(Integer::parseInt).isPresent(x -> System.out.printf("result3=%d%n", x));
        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt22 = OptionalInt.empty();

        System.out.println(optInt1.isPresent());
        System.out.println(optInt2 .isPresent());




    }
}
