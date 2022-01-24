package com.company.ch07.interfaceBase;

public class Fight extends Unit2 implements Fightable{
    @Override // 오버라이딩 규칭 : 조상 ( 여기선 public ) 보다 접근 제어자가 범위가 좁으면 안된다.
    public void attack(Fightable f) {

    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void stop() {

    }
}
