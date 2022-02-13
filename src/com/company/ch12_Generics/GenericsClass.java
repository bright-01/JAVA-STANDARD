package com.company.ch12_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericsClass {
    /**
     * 컴파일시 타입을 체크해주는 기능 ( compile -time type check)
     *
     * 타입 변수
     * - 클래스를 작성할때 Object 타입 대신 타입변수 ( (E) ) 를 선언해서 사용
     * - 제네릭의 참조변수와 생성자의 대입된 타입은 일치해야한다. 조상, 자손 ==> 에러
     *
     * iterator<E>
     *     클래스를 작성할때 Object 대신 T와 같은 타입 변수를 사용
     *
     * HashMap<K, V>
     *     여러개의 타입 변수가 필요한 경우, 콤마를 구분자로 선언
     *
     * extends로 대입할 수 있는 타입 제한
     *  class FruitBox <T extends Fruit> {} ==> fruit의 자손만 들어 올 수 있다.
     *  인터페이스 경우도 extends를 사용한다
     *
     *
     * static 멤버에 사용불가
     * 배열 생성 할 때 타입변수 사용 불가 -> 타입 변수로 배열 선은은 가능
     *
     * */

    public static void main(String[] args) {
        ArrayList<Tv> tvList = new ArrayList<Tv>(); // Tv만 객체로 들어올 수 있다.
        ArrayList<Integer> listTest = new ArrayList<Integer>();
        ArrayList<Product> ProductTest = new ArrayList<Product>();
//        listTest.add("s"); // error ClassCastException
//        ArrayList<Product> list2 = new ArrayList<>(Tv); // 에러

        ProductTest.add(new  Tv());
        ProductTest.add(new Audio()); // 자손 객체만 넣을 수 있다


        printAll(ProductTest);
//        printAll(tvList); // 에러!!

        Iterator<Tv> it = tvList.iterator();
        while(it.hasNext()){
            System.out.println();
        }

        HashMap<String, Tv> map = new HashMap<String, Tv>();
        map.put("a", new Tv());


        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();






    }
    public static void printAll(ArrayList<Product>list){

    }


}
class Tv extends Product {}
class Audio extends Product {}
class Product {}

interface Etable {}
class Fruit implements Etable {
    public String toString() {return "Fruit!"; };
}

class Apple extends Fruit{
    @Override
    public String toString() {
        return "Apple";
    }
}
class Grape extends Fruit{
    @Override
    public String toString() {
        return "Apple";
    }
}
class Toy{
    @Override
    public String toString() {
        return "Toy";
    }
}

class FruitBox<T extends Fruit & Etable> extends Box<T>{

}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add (T item) { list.add(item); };
    T get(int i) { return list.get(i); };
    int size() {return list.size(); };
    public String toString(){
        return list.toString();
    }
}