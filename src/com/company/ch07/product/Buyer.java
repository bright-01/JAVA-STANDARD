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
        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
    }


}
