package com.company.ch07_OOP.interfaceBase;

public interface Fightable {
    void move(int x , int y);
    void attack(Fightable f); // 이건 fightable 인터페이스를 구현한 클래스의 인스턴스만 받는다
}


// method의 return 타입이 인터페이스의 경우도 인터페이스를 구현한 인스턴스를 반환한다는 뜻.
