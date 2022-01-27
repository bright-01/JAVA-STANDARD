package com.company.ch07_OOP.product;

public class Product {
    public int price;
    public int bonusPoint;

    Product(){
        this(10000);
    }

    Product(int price){
        this.price = price;
        this.bonusPoint = (int) (price/10.0);
    }

}
