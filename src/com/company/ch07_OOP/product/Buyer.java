package com.company.ch07_OOP.product;

import java.util.Vector;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;
//    Product[] cart = new Product[10];
    Vector cart = new Vector();  // Vector 는 가변 배열.. Object 타입으로 모든 객체를 담을 수 있다.
    int i = 0;


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
        cart.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");

    }

    void refund(Product p){
        if(cart.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " 을/를 반품 하셨습니다.");
        } else {
            System.out.println("구입하신 물품이 없습니다.");
        }
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        if(cart.isEmpty()) {
            System.out.println("구입하신 물품이 없습니다.");
            return;
        }

        for(int i =0; i < cart.size(); i ++){
            Product p = (Product) cart.get(i);
            sum += p.price;
            itemList += (i == 0) ? ""+p :   " ,"+p;
        }

        System.out.println("구입하신 총 금액은 "+ sum + "만원 입니다.");
        System.out.println("구입하신 물품은 "+ itemList+" 입니다.");
    }


}
