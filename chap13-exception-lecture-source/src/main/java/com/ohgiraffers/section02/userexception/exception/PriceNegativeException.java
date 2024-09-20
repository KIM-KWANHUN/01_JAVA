package com.ohgiraffers.section02.userexception.exception;

public class PriceNegativeException extends NegativeException {// 상품 가격이 음수일때 처리할 클래스!!

    public PriceNegativeException(String message) {
        super(message);
    }

}
