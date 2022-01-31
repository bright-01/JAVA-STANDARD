package com.company.ch08_Exception;

public class ExceptionReThorws {
    // 양쪽에서 예외를 처리 하도록 만든다.. 조금씩 나눠서 할 수 도있는거고..
    public static void main(String[] args) {
        try{
            method1(); // 발생한 에러를
        } catch(Exception e){
            e.getMessage(); // 다시 한번 더 처리
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception(); // 예외를 발생 시키고
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e; // 예외 catch에서 처리 후 다시 예외를 조상에게 던진다.
        }
    }

}
