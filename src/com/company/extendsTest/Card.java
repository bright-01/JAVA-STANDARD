package com.company.extendsTest;

public class Card {

    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART =2;
    static final int CLOVER = 1;

    int kind ;
    int number;


    // 생성자 첫줄의 this는 오버라이딩 생성자를 호출한다.
    Card(){
        this(SPADE, 1);
    }
   // this 클래스의 속성과 파라미터의 이름이 같을 경우 this를 붙여준다
    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String [] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String number = "123456789JQK";

        return "kind : "+ kinds[this.kind] + ", number : "+number.charAt(this.number);
    }


}
