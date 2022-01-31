package com.company.ch08_Exception.chainedException;

public class InstallException extends Exception{
    private final int ERROR_CODE;
    InstallException(String msg, int error_code){
        super(msg);
        ERROR_CODE = error_code;
    }

    public void getErrorCode(){
        System.out.println(ERROR_CODE);
    }
}
