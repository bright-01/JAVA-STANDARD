package com.company.ch07.product;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;


//    void buyTv(Tv t){
//        money = money - t.price;
//        bonusPoint = bonusPoint + t.bonusPoint;
//    }
//
//    void buyCar(Car c){
//        money = money - c.price;
//        bonusPoint = bonusPoint + c.bonusPoint;
//    }
//
//    void buyComputer(Computer c){
//        money = money - c.price;
//        bonusPoint = bonusPoint + c.bonusPoint;
//    }
    // 다형성을 이용해 수많은 제품들을 한번에 살 수 있도록 처리

    void buyProduct(Product p){

        if(money < p.price){
            System.out.println("잔액이 부족해서 물건을 못 사...");
            return;
        }

        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;

        System.out.println(p + "을/를 구입하셨습니다.");

    }


}
