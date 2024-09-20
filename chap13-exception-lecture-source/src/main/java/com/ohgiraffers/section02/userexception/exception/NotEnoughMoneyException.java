package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception { // 내돈이 상품의 가격보다 적을때 처리하는 클래스!!

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

