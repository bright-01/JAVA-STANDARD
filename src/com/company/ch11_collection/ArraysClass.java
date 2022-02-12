package com.company.ch11_collection;

public class ArraysClass {
    /**
     * Arrays Class : 배열을 다루기 편리한 메서드 (static) 제공
     *
     * toString() - 배열의 출력력
     * copyOf(), copyOfRange() - 배열 복사 --> 새로운 배열을 생성 해서 줌 )) 주의 copyOfRange()는 from - to from은 포함, to는 미포함
     * fill(), setAll() - 채우기  ) setAll()- 람다로 채우기
     * sort(), binarySearch() - 정렬과 이진탐색 )) binarySearch는 정렬이 된 다음에 사용한다
     * >> int[] i = {1,4,5,2,3};
     * int index = Arrays.binarySearch(i, 2) // -5 잘못된 출력
     * Arrays.sort(i);
     * int index = Arrays.binarySearch(i, 2)
     * >>
     *
     * deepToString() - 다차원 배열 출력 할 때 사용
     * deepEquals() - 다차원 배열 비교
     *
     * asList(Object ...a) < 배열 넣으면 된다 - 배열을 리스트로 변환
     * List list = asList(new Integer[]{1,2,3,4,5})
     * List list = asList(1,2,3,4,5);
     * 읽기전용이라서
     * list.add(6) // 에러 발생
     * List list = new ArrayList(Arrays.asList(1,2,3,4,5)); << 이렇게 하면 새로운 List가 생성되서 쓰기가 가능하다
     * list.add(6) // 가능
     * ***
     *
     *
     * parallelXXX, splitertor, stream - 람다와 관련
     *
     * */
}
