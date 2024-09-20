package com.ohgiraffers.section01.exception;

public class Application03 {

    public static void main(String[] args) throws RuntimeException {

        /* title. try-catch 블럭을 이용하여 예외처리를 할 수 있다. */

        /* index 3. try-catch 블럭을 이용항 방법 (예외 상황 발생) */

        ExceptionTest et = new ExceptionTest();

        try {
            // 상품의 가격이 더 높게 만들것이다.
            et.checkEnoughMoney(50000,10000);
            // throw new Exception(); 뜻과 같다.

            System.out.println("====================상품 구입 가능======================");
        } catch (Exception e) {
            System.out.println("====================상품 구입 불가======================");
        }

        System.out.println("프로그램이 종료합니다.");
    }
}

