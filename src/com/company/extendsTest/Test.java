package com.company.extendsTest;

public class Test {
    public static void main(String[] args) {

        MyPoint myPoint = new MyPoint(2,4);

        Circle circle = new Circle(myPoint, 10);

        System.out.println(circle.point.x);
        System.out.println(circle.point.y);
        System.out.println(circle.r);

        System.out.println("==================");
        circle.showTest();

        Circle2 circle2 = new Circle2(new MyPoint(3,2), 11);
        circle2.showTest();



    }

}

class Circle2 extends Circle{

    Circle2(MyPoint point, int r) {
        super(point, r);
    }

    @Override
    void showTest() {
       super.showTest();
        System.out.println("zzzz");
    }
}


class Circle{
    MyPoint point;
    int r;

    Circle(MyPoint point, int r){
        this.point = point;
        this.r = r;
    }

    void showTest(){
        System.out.println("point y= "+ point.y);
        System.out.println("point x= "+ point.x);
        System.out.println("r= "+ r);
    }

}

class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

}