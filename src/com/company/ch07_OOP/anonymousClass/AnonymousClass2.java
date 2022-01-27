package com.company.ch07_OOP.anonymousClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class AnonymousClass2 {
//    public static void main(String[] args) {
//        Button b = new Button("start");
//        b.addActionListener(new EventHandler());;
//    }
//}
//
//class EventHandler implements ActionListener{
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("ActionEvent Occurred!!!");
//    }
//}

// 위에 있는 클래스를 익명클래스로 바꾸면

public class AnonymousClass2 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() { // 이름이 없기 때문에 조상의 이름을 써서 인스턴스를 생성한다 ( 인터페이스 )
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent Occurred!!!");
            }
        });
    }
}


