package com.company.ch07.car;

public class CarTest {
    public static void main(String[] args) {
        Car car = null;
        Car car2 = null;
        FireCar fireCar = new FireCar();
        FireCar fireCar2 = null;

        fireCar.isWater();
        car = fireCar;
//        car.isWater() 안되쥬?!
        fireCar2 = (FireCar) car;
        fireCar2.isWater();

        FireCar fireCar3 = null;
        fireCar3 = (FireCar) car2;
        fireCar3.getNumber(); // nullPointerException!!

        Car car4 = new Car();
        FireCar fireCar4 = (FireCar) car4;
        fireCar4.setWater(false); // << 형변환 에러 fireCar4가 가르키는 객체는 car4인데 car4에는 water라는 인스턴스 변수가 없쥬





    }
}
