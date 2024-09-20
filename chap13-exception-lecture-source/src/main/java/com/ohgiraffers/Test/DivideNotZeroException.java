package com.ohgiraffers.Test;

public class DivideNotZeroException extends ZeroException{
    // 나누기할때 나누기수가 0일경우
    public DivideNotZeroException(String message) {
        super(message);
    }
}
