package com.company.ch08_Exception;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(0/0);
            System.out.println(2);
        }catch (ArithmeticException ae){
            // 발생한 예외와 일치하는 캐치 블럭이 있는지 확인 후 찾아 내려감
            System.out.println("ArithmeticException");
            System.out.println(3);
        }catch(ArrayIndexOutOfBoundsException aobe){
            System.out.println("aobe");
        }
        catch (Exception e){
            //Exception이 선언된 catch 블럭은 모든 예외를 처리 한다 ==> 맨 마지막에 와야함!!
            System.out.println(33);
        }
        System.out.println(4);
    }
}

/**
 * 자주 쓰이는 exception method
 * 1. printStackTrace() - 예외발생 당시의 호출스택 (Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다
 * 2. getMessage() - 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
 *
 *
 * catch( ExceptionA | ExceptionB e){
 *     를 사용할 A, B 공통 메서드를 사용해야한다. 둘중 하나는 그 메서드가 없을 수 있으니까
 *     정 쓰고 싶으면 if문으로 instanceof로 객체를 확인 후 형변환 해서 사용한다.
 *
 *     if( e instanceof ExceptionA){
 *         Exception e1 = (ExceptionA) e;
 *         e1.method!();
 *     }
 *
 * }
 *
 * */
