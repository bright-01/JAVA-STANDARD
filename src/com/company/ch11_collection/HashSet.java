package com.company.ch11_collection;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSet {
    /**
     * 순서와 중복이 안된다
     *
     * HashSet
     * Set 인터페이스를 구현한 대펴적인 컬렉션 클래스
     * 순서를 유지하려면 LinkedHashSet을 이용
     *
     * TreeSet  ( from ~ to )
     * 범위 검색과 정렬에 유리한 컬랙선
     *
     * 메서드
     * HashSet() : 생성자
     *
     * add, addAll 추가
     * remove, removeAll : 삭제
     * retainAll : 조건부 삭제
     * clear 모두 삭제
     * contrain 포함되어 있는지
     * iterator
     * isEmpty
     *
     *
     *
     *
     * */

    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4"};
        Set set = (Set) new HashSet();
        for (int i =0; i<objArr.length; i++){
            set.add(objArr[i]); // 중복이 제거 되고 저장 된다. "1", Integer 1 은 다
            // add 메서드를 호출하기 전에 equals와 hashCode를 호출 하고 같은 객체가 있는지 확인하고 없으면 저장하고 있으면 저장하지 않는다.
            // equals와 hashCode가 오버라이딩이 되어 있어야함.
            // HashSet에 objArr의 요소들을 저장
        }

        System.out.println(set);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet set1 = new HashSet();
    }

    class Person {
        @Override
        public boolean equals(Object o) {
            if(!(o instanceof Person)) return false;
            Person p = (Person) o;
            return this.name.equals(p.name) && this.age == p.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        String name;
        int age;

        Person( String name, int age){
            this.name = name;
            this.age = age;
        }

        public String toString(){
            return name + ":" + age;
        }
    }
}
