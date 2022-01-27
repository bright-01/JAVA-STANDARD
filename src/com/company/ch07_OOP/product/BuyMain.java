package com.company.ch07_OOP.product;

public class BuyMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv();
        Car car = new Car();
        Computer computer = new Computer();

        buyer.buyProduct(tv);
        buyer.buyProduct(car);
        buyer.buyProduct(computer);
        buyer.summary();
    }
}
