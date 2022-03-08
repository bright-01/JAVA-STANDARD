package com.company.ch12_Generics_Enum_Annotation;

enum Direction  {EAST, SOUTH, WEST, NORTH};
enum Direction2 {
    EAST(1), SOUTH(2), WEST(-1), NORTH(10);

    private final int value;

    Direction2(int value){
        this.value = value;
    }

    public int getValue(){ return value; };

}

enum Direction3 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(-1, "<"), NORTH(10, "^");
    private static final Direction3[] DIR_ARR = Direction3.values();
    private final int value;
    private final String symbol;

    Direction3(int i, String symbol){
        this.value = i;
        this.symbol = symbol;
    }

    public int getValue() { return value; }
    public String getSymbol() { return symbol; }


}
public class Enum {
    /**
     * 관련 상수들을 같이 묶어 놓은것
     * ==, compareTo 를 사용한다. 비교연산자는 사용 부락
     * <p>
     * 원하는 값을 () 안에 넣는다.
     */


    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        System.out.println(d1);
        Direction d2 = Direction.valueOf("WEST");
        System.out.println(d2);

        Direction d3 = Direction.valueOf("WEST");
        System.out.println(d3);

//        Direction d3 = Enum.valueof(Direction.class, "EAST"); 없어졌나?!

        System.out.println(d1 == d2);
        System.out.println(d1 == d3);
        System.out.println(d1.equals(d3));
//        System.out.println(d1 > d3); // 불가
        System.out.println(d1.compareTo(d3));
        System.out.println(d1.compareTo(d2));

        switch (d1) {
            case EAST: // case에는 그냥 이렇게 상수만 쓴다
                System.out.println();
                break;
        }

        d1.ordinal(); // 순서가 언제인지 반환 순서만 반환하지 상수의 값과는 별개
    }
}

class Card{
    static final int CLOVER = 0;
    static final int HEART = 1;
    static final int DIAMOND = 2;
    static final int SPADE = 3;
    // => 위의 타입들을 묶어 둔게 열거형이다
//    enum Kind2 { CLOVER, HEART, DIAMOND, SPADE }; // 0 1 2 3

    // final Kind2 kind2; //

}


