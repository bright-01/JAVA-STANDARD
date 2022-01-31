package com.company.ch08_Exception;

public class CustomException extends Exception{

    private final int ERROR_CODE;

    CustomException(String message, int error_code){
        super("message");
        ERROR_CODE = error_code;
    }

    public String getErrorMessage(){
        return "error + ["+ERROR_CODE+"] - "+getMessage();
    }

}
