package com.company.ch09;

import java.util.Objects;

public class HasCodeToString {
    String kind;
    int number;

    HasCodeToString(){
        this("SPADE", 1);
    }

    HasCodeToString(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public int hashCode(){ // equals를 오버라이딩 하면 필수적으로 hashCode를 같이 오버라이딩 해야한다.
        return Objects.hash(kind, number); // 가변인자라 여러개 넣어도 상관없다..
    }

    public boolean equals(Object obj){
        if(!(obj instanceof HasCodeToString)){
            return false;
        }
        HasCodeToString hasCodeToString = (HasCodeToString) obj;
        return this.kind.equals(hasCodeToString.kind) && this.number == hasCodeToString.number;

    }

    public String toString(){ // 객체 toString 오버라이딩 하는 방법
        return "kind : " + kind + " number : "+ number;
    }

    public static void main(String[] args) {
        HasCodeToString hasCodeToString1 = new HasCodeToString();
        HasCodeToString hasCodeToString2 = new HasCodeToString();

        System.out.println(hasCodeToString1.toString());
        System.out.println(hasCodeToString2.toString());
    }


}
