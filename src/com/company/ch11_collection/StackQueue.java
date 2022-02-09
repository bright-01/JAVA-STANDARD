package com.company.ch11_collection;

import java.util.*;

public class StackQueue {


    /**
     * Stack : LIFO ( Last In First Out ). 마지막 저장된 것이 제일 먼저 꺼내게 된다. ( push, pop )
     *  ==> 배열이 적합.. 순차적
     *  Stack st = new Stack();
     *  empty() : 비어있는지
     *  peek() : 맨 위에 저장된 객체를 반환, pop와 달리 stack에서 객체를 꺼내지 않음. 비어 있ㅇ르 떄는 EmptyStackException발생
     *  pop() : stack의 맨 위에 저장된 객체를 꺼낸다
     *  push() : 객체를 저장한다.
     *  int search(object O) : stack에서 주어진 객체를 찾아서 그 위치를 반환 못찾으면 -1 ( 0이 아닌 1부터 시작 )
     *===> 수식계산, 수식괄호검사, 워드프로세서의 undo/redo , 웹브라우저의 뒤로 앞으로
     *
     * Queue : FIFO ( Frist In First Out ).  제일 먼저 저장한 것을 제일 먼저 꺼낸다. ( Offer, Poll )
     *  ==> 링크드리스트가 적합, 인터페이스라서 객체 생성이 안된다.
     *  ==> All Known Implementing classes Queue를 구현한 클래스 목록
     *  boolean add(Obejct o) 지정된객체를 추가한다. 성공하면 ture ( 예외발생 )
     *  Ojbect remove () : 삭제 ( 예외발생 )
     *  Object element() : 삭제 없이 요소를 읽어 온다.
     *  offer(object o ) : Queue에 객체를 저장 성공하면 ture; ( 예외발생 x )
     *  poll() : queue에서 객체를 꺼내서 반환 ( 예외 발생 x)
     *  peek() :  삭제 없이 요소를 읽어온다
     *===> 최근사용문서, 인쇄작업 대기목록, 버퍼
     * */


    static Queue q2 = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        while(!st.empty()){
            System.out.println(st.pop());
        }

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        Stack st2 = new Stack();
        String expression = "((3+5)*8)-2)";
         try{
            for ( int i =0 ; i< expression.length() ; i++){
                char ch = expression.charAt(i);
                if(ch == '('){
                    st.push(ch+"");
                }else if(ch ==')'){
                    st.pop();
                }

                if(st.isEmpty()){
                    System.out.println( "괄호가 일치함");
                }else{
                    System.out.println("괄호가 일치하지 않음");
                }
            }
         }catch(EmptyStackException e){
             e.printStackTrace();
             e.getMessage();
         }

         while (true){
             System.out.println(">>");
             try{
                 Scanner s = new Scanner(System.in);
                 String input = s.nextLine().trim();

                 if("".equals(input)){
                     continue;
                 }

                 if(input.equalsIgnoreCase("q")){
                     System.exit(0);
                 }else if(input.equalsIgnoreCase("help")) {
                     System.out.println("help - 도움");
                     System.out.println("q - 종료");
                     System.out.println("history - 최근 입력한 명령어");
                 }else if(input.equalsIgnoreCase("history")){
                     int i = 0;
                     save(input);

                     LinkedList tmp = (LinkedList) q2;
                     ListIterator it = tmp.listIterator();

                     while (it.hasNext()){
                         System.out.println(++i+"."+it.next());
                     }
                 }else {
                     save(input);
                 }

             } catch (Exception e ){
                 e.getMessage();
             }

         }
    }

    public static void save (String input){
        if(!"".equals(input)){
            q2.offer(input);
        }

        if(q2.size() > MAX_SIZE){
            q2.remove();
        }
    }


}
