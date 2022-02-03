package com.company.ch09;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "2";
         s1 = s1+s2; // s1의 주소에 "12"가 저장 되는것이 아니라 "12"가 새로운 주소에 저장 된다.
        //String가 +로 합쳐질때마다 새로운 주소에 저장된다. 그래서 효율이 좋지 않음 ( Stringbuffer 을 사용 해야함 )
        // s1에는 새로운 주소값이 들어감

        String emptyString = ""; // 빈문자열로 초기화  null로 초기화 하기보다는 빈문자열이 낫다.


        // join
        String animals = "dog,cat,bear";
        String[] arr = animals.split(","); // ,를 구분자로 배열에 저장
        String str = String.join("-", arr); // - 로 구분해서 결합
        System.out.println(str); // dog-cat-bear

        // 숫자 to 문자열
        int i = 100;
        String str10 = i +""; // 편리함
        String str11 = String.valueOf(i); // 빠름

        // 문자 to 숫자
        int ii = Integer.parseInt("100"); // 옛날 방법
        int iii = Integer.valueOf("100"); // 새로운 방법
        Integer iiii = Integer.valueOf("1000"); // 오토박싱
    }
}
