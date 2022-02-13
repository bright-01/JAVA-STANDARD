package com.company.ch11_collection;

public class TreeSet {
    /**
    * 이진탐색 트리고 구현, 범위 탐색과 정렬에 유리
    * 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음
    * 각 요소 노드가 나무형태로 연결 LinkedList의 변형
    * linkedList ==> class Node { Node node; Object obj; } 다음 요소의 주소를 저장
     *
     * 이진 탐색 트리
     * 부모바다 작은 값은 왼쪽 큰값은 오른쪽에 저장하는것
     * 데이터가 많아 질 수록 추가, 삭제에 시간이 더 걸림 ( 비교 횟수 증가 )
     *
    * */
    class TreeNode {
        TreeNode left; // 작은 node
        Object element;
        TreeNode right; // 큰 node
    }
    public static void main(String[] args) {

    }
}
