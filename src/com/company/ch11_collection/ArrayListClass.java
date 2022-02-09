package com.company.ch11_collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    /**
     * 순서가 있고 중복을 허용
     * 1. Vector ( 벡터는 동기화가 된다 )  === ArrayList ( 동기화는 안된다 )
     * 2. LinkedList
     *  ==> 배열의 구조가 간단하고 데이터 읽는데 걸리는 시간이 짧다. (접근 시간)
     * 3. 데이터의 저장공간으로 배열을 사용한다. ==> List 인터페이스를 구현
     *
     * object[] 배열임.. 값이 들어가는게 아니라 주소값이 들어감.. 당연함. 객체 배열이라 객체만 저장해야해
     *
     * */
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); //사이즈가 10인 ArrayList를 생성
        list1.add(new Integer(1));
        list1.add(new Integer(5));
        list1.add(new Integer(6));
        list1.add(new Integer(7));
        list1.add(3); // 기본형이 참조형으로 자동 저장됨 --> 오토박싱

        ArrayList list2 = new ArrayList(list1.subList(1,2)); // subList 범위 만큼의 새로운 ArrayList를 생성함. 읽기전용임..
        print(list1, list2);

        // 오름차순으로 정렬을 한다.
        // Collections는 유틸 클래스!! Collection은 인터페이스!
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println(list1.containsAll(list2)); // list1의 내용을 list2가 다 포함하고 있는지

        // 추가할 위치 지정
        list2.add('B');
        list2.add('C');
        list2.add(3, 'A'); // 앞에 인덱스를 붙이면 추가할 위치를 지정 할 수 있다. 안 붙으면 밑 뒤에 추가된다.

        // 변경
      list2.set(3, "AA");

      // 삭제
        list1.remove(1); // 인덱스 1을 지움

        list1.retainAll(list2); // list2랑 겹치는건 다 지움
        // 배열의 객체를 삭제하는경우 복사가 이루어지지 않고 그냥 null로 복사 ( 중간에 삭제하면 뒤에꺼 복사해서 당겨 넣고 마지막 null로 세팅 --> 성능 올라감 )




    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }
}
