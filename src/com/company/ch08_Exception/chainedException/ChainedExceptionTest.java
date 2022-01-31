package com.company.ch08_Exception.chainedException;

public class ChainedExceptionTest {
    public static void main(String[] args) {

        // 왜? 여러개의 예외를 하나로 묶어서 사용하기 위해서.. 왜왜??
        /**
         *
         * 예외가 발생하면 InstallException이라고 발생하고
         * 밑에 Caused by로 원인이 출력하게 된다..
         *
         * */

//        try {
////            install();
//        } catch (InstallException e) {
//            e.printStackTrace();
//        }
    }

//     void install() throws InstallException{
//        try{
//            startInstall();
//        }catch (SpaceException se){ //spaceException을 발생 했지만
//            InstallException ie = new InstallException("error!!", 501); // installExcpetion을 다시 선언 한 뒤
//            ie.initCause(se); // ie에 se를 포함 시킨다.. se를 원인 예외로 등록 한다.
//            throw ie; // 그리고 다시 ie를 던짐... se는 에러를 발생 시키기 위해 존재.. 실제 에러 처리는 ie에서 함
//            se.getMessage();
//        }
//    }


    public static void startInstall(){
        System.out.println("start Install");
    }
}
