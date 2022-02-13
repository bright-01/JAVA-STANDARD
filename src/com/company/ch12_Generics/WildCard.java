package com.company.ch12_Generics;

import java.util.ArrayList;

public class WildCard {
    /**
     * 와일드 카드
     * 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
     * < ? extends T > 와일드 카드의 상한 제한. T와 그 자손들만 가능
     * < ? super T> 와일드 카드의 하한 제한. T와 그 조상들만 가능
     * <?> 제한없음 모든 타입이 가능 < ? extends Objecdt> 와 동일
     *
     *
     * 제네릭 타입과 원시타입 간의 형변환은 바람직하지 않다
     *
     * */

    public static void main(String[] args) {
        ArrayList<? extends Product> list1 = new ArrayList<Tv>();
        ArrayList<? extends Product> list2  = new ArrayList<Audio>();
        ArrayList<? super Tv> list3  = new ArrayList<Product>();
//        ArrayList<Product> list3 = new ArrayList<Tv>();
    }
}
