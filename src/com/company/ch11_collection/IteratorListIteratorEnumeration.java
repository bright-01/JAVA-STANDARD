package com.company.ch11_collection;

import java.util.*;

public class IteratorListIteratorEnumeration {
    /**
     * 컬렉션에 저장된 데이터를 접근하는데 사용하는 인터페이스
     * Iterator
     * ListIterator
     * Enumeration
     *
     * * Iterator 메서드 ( Enumeration 거의 동일
     * boolean hasNext() - 가져올 다음 데이터가 있는지 확인 -> true / false
     * object next() - 다음 요소를 가져온다. 가져오기 전에 hasNext()로 가져올 요소가 있는지 확인하는게 안전하다.
     * void remove() - next()로 읽어온 데이터를 삭제한다. next()를 호출 한 뒤 remove()를 호출 ( 선택적 )
     * void forEachRemaining(consumer < ? super E> action ) - 컬렉션 남아있는 요소들에 대한 지정된 action을 수행
     * ( ListIterator는 방향성을 제공 next() ,  previous() )
     * Iterator 만 알면된다
     *
     * 컬렉션을 바꿔도 이터레이터로 값을 가져올수있다. ( 리스트, 셋 )
     *
     *
     * Map에는 Iterator가 없다 ==> KeySet(), entrySet(), value()를 호출해서 Iterator를 사용해야함
     * Map map = new HashMap();
     * Iterator it = map.keySet().iterator();
다    * */

    public static void main(String[] args) {
        List list = new ArrayList();
        HashSet list2 = new HashSet(); // 이것도 이터레이터로 쉽게 가져올수 있음
        Collection list3 = new HashSet(); // 이렇게 하면 다 받을 수 있음
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 한번 더 쓰면 이미 위에서 다 가져와서 밑에 while문은 그냥 뛰어 넘어 버림
        iterator = list.iterator(); // 다시 얻어와야함.. Iterator는 일회용임
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
