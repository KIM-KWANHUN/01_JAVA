package com.ohgiraffers.section02.userexception.exception;

public class MoneyNegativeException extends NegativeException {  // 가진 돈이 음수일때 처리할 클래스!!

    public MoneyNegativeException(String message) {
        super(message);
    }


}
