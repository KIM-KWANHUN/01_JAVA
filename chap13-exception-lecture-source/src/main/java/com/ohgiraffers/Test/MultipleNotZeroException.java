package com.ohgiraffers.Test;

public class MultipleNotZeroException extends ZeroException { // 곱하기로할때 곱하는수가 0인경우 클래스

    public MultipleNotZeroException(String message) {
        super(message);
    }
}
