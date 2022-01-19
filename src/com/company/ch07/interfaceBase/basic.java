package com.company.ch07.interfaceBase;

public interface basic {
    /**
     * public static final 타입 상수이름 = 값; 무조건 상수만 들어 갈수있다
     * public abstract 메서드 이름 ( 매개변수 ) << abstract
     *
     * 인터페이스의 접근제어자는 무조건 public
     *
     * 인터페이스의 조상은 인터페이스만 가능 오브젝트가 최고 조상이 아님
     * 다중상속이 가능하다 ==> 왜냐하면 인터페이스의 조상은 추상메서드만 될 테니까.. 충돌해도 상관없음
     * */

    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;
    // 이렇듯 인터페이스에서 자료형 말고 모두 생략이 가능 하다 어차피 인터페이스는 저거밖에 못 쓰거든

    public abstract String getCardNumber();
    String getCardKind();
    // 이렇게 생략이 가능

}
