package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application02 {

    public static void main(String[] args) {

        /* title. 사용자 정의의 예외클래스 정의 후 발생한 예외를 처리할 수 있다. */

        ExceptionTest2 et2 = new ExceptionTest2();

        try {
            // 1. 상품 가격 음수
            // et2.checkEnoughMoney(-3000,5000);
            // 2. 가진 돈 음수
             et2.checkEnoughMoney(3000,-5000);
            // 3. 물건의 가격이 가진 돈 보다 큼
            // et2.checkEnoughMoney(10000,5000);

        // 예외 상황 별 catch 블럭을 따로 작성해서 처리할 수 있다.
        } catch (PriceNegativeException e) {
            System.out.println("가격이 음수 상황 발생!!!!");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("돈이 음수 상황 발생!!!!");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e){
            System.out.println("돈이 충분하지 않은 상황 발생!!!!");
            System.out.println(e.getMessage());

            // finally 구문 : 예외 발생 여부와 상관 없이 실행할 내용
            /* comment.
            *   finally
            *   사용한 자원을 닫는곳에 많이 쓴다. */
        } finally {
            System.out.println("finally 블럭 예외 상관 없이 동작 확인...");
        }
        System.out.println("프로그램을 종료합니다...");

    }
}
