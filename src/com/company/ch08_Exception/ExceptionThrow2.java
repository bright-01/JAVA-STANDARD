package com.company.ch08_Exception;

import java.io.File;

public class ExceptionThrow2 {
    public static void main(String[] args) throws Exception { // 자바 jvm에 넘겨버림, 프로그램 비정상 종료 --> 넘기기만 하지말고 한곳은 반드시 try catch로 처리 해야한다.

        try{
            createFile(args[0]);
            System.out.println("파일이 성공적으로 완성 되었습니다.");
        }catch (Exception e){
            System.out.println(e.getMessage()+ " 다시 만들어줘/");
        } finally {
            System.out.println("무조건 실행된다");
        }



    }


    public static File createFile(String fileName) throws Exception {
        if( fileName == null || "".equals(fileName)){
            throw new Exception("파일 이름이 없습니다.");
        }

        File f = new File(fileName);
        f.createNewFile();
        return f;
    }

}
