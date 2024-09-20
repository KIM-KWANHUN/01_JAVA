package com.ohgiraffers.section01.exception;

public class Application03 {

    public static void main(String[] args) throws RuntimeException {

        /* title. try-catch 블럭을 이용하여 예외처리를 할 수 있다. */

        /* index 2. try-catch 블럭을 이용항 방법 (예외 발생하지 않음) */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(10000,50000);
            //try 구문 내에서 예외가 발생하면 catch 구문이 동장을 한다.

            System.out.println("====================상품 구입 가능======================");
        } catch (Exception e) {
            System.out.println("====================상품 구입 불가======================");
        }

        System.out.println("프로그램이 종료합니다.");
    }
}

