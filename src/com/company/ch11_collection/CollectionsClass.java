package com.company.ch11_collection;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class CollectionsClass {
    /**
     * Collections
     * Object - 객체
     * Arrays - 배역
     * Collections - 컬렉션
     *
     * fill(), copy(), sort(), binarySearch()
     * 컬렉션 동기화 - synchronizedXXX()
     * ex ) synchronizedCollections, synchronizedList, synchronizedSet, synchronizedMap, synchronizedSortedSet
     * 옛날에는 동기화가 무조건 제공했지만 지금은 필요할때만 동기화를 함
     *
     * ReadOnly - 변경불가 컬렉션 읽기전용 - unmodifiable
     * ex )  unmodifiableCollection,  unmodifiableList,  unmodifiableSet,  unmodifiableMap,  unmodifiableNavigableSet,  unmodifiableSortedSet,  unmodifiableNavigableMap,  unmodifiableSortedMap
     *
     * 싱글톤 컬렉션 만들기  singletonList
     *
     * 한 종류의 객체만 저장하는 컬렉션 만들기
     * checkedXXX
     *
     *
     * */

    public static void main(String[] args) {
        List list = new ArrayList<>();
        addAll(list, 1,2,3,4,5,6);

        rotate(list, 2);// 반시계 반향으로 두번 회전
        // 4,5,1,2,3,

        swap(list, 0, 2); // 첫번째와 세번째를 교환

        shuffle(list); // 임의로 변경

        sort(list, reverseOrder()); // 역순 정렬
        sort(list); // 정렬

        int inx = binarySearch(list, 3); //3이 위치한 곳에 이진탐색
        max(list);
        min(list);
        max(list, reverseOrder()); // == min

        fill(list, 9 ); // list를 9로 채움
        List newList = nCopies(list.size(), 2); // list의 사이즈 만큼 2로 채움
        copy(list, newList); // newList를 복사

        disjoint(list, newList); // 공통요소가 있는지 없는지

        replaceAll(list, 2,1);
    }
}