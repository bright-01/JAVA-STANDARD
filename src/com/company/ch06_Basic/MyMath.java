package com.company.ch06_Basic;

public class MyMath {
    int num1;
    static int num2;

    void soutNum1 (){
        System.out.println(num1);
        System.out.println(num2);
    }

    static void soutNum2(){
//        System.out.println(num1); // static method (클래스 메서드는 인스턴스 변수를 사용 할 수 없다.. )
        System.out.println(num2);
    }


}
