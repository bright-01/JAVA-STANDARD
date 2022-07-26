package com.company.ch14_Lamda_stream.reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    /**
     * 하나의 메서드만 호출하는 람다식은 '메서드참조'로 간단하게 할 수 있다
     * 클래스이름::메서드
     * static 메서드 참조 | (x) -> ClassName.Method(x) | ClassName::method
     * 인스턴스메서드 참조  | (obj.x) -> obj.method(x)   | ClassName::method
     * 특정 객체 인스턴스 참조 | (x) -> obj.method(x)     | obj::method
     *
     * ex)
     * Integer method(String s ) {
     *     return Integer.parseInt(s)
     * }
     * >>
     * int result = obj.method("123")
     * int result = Integer.parseInt("123")
     * Function<String, Integer> f = (String s ) -> Integer.parseInt(s); // 여기서 String으로 입력값이 뭔지 알 수 있음
     * Function<String, Integer> f = Integer::parseInt;
     *
     * ** 생성자와 메서드 참조
     * Supplier<MyClass> s = () -> new MyClass();
     * Supplier<MyClass> s = MyClass:new;
     *
     * Function<Integer, MyClass> s = (i) -> new MyClass(i)
     * Function<Integer, MyClass> s = MyClass:new;
     *
     * ** 메열과 메서드 참조
     * Function<Integer, int[]> f = x -> new int[x];
     * Function<Integer, int[]> f = int[]::new;
     *
     *
     *
     * */
    public static void main(String[] args) {
        Function<String, Integer> function = (String s) -> Integer.parseInt(s);
        Function<String, Integer> function2 = Integer::parseInt;
        System.out.println(function.apply("123"));
        System.out.println(function2.apply("123"));

        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s2 = MyClass::new;
        MyClass mc = s.get();
        System.out.println(mc);
        System.out.println(s.get());
        System.out.println(s2.get());

        Function<Integer, MyClass2> ss = (i)->new MyClass2(i);
        Function<Integer, MyClass2> ss2 =  MyClass2::new;

        MyClass2  mc2 = ss.apply(100);
        System.out.println(mc2.iv);
        System.out.println(ss2.apply(200).iv);

        Function<Integer, int[]> f = (i) -> new int[i];
        Function<Integer, int[]> f2 =  int[]::new;

        int [] arr = f.apply(100);
        int [] arr2 = f2.apply(100);

        System.out.println(f.apply(100).length);
        System.out.println(arr.length);
        System.out.println(f2.apply(100).length);
        System.out.println(arr2.length);
        System.out.println(arr2.length);
        System.out.println(arr2.length);
        System.out.println(arr2.length);
        System.out.println(arr2.length);
        System.out.println(arr2.length);


    }
}

class MyClass{}
class MyClass2{
    int iv;
    MyClass2(int iv){
        this.iv = iv;
    }

}
