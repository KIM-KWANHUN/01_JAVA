package com.ohgiraffers.Test;

public class Calculrator { //클래스 생성


    public void plus(int num1, int num2) { // 더하기 메소드

        System.out.println("값 : " + num1+num2 );
    }

    public void minus(int num1, int num2) { // 빼기 메소드

        System.out.println("값 : " + (num1-num2));
    }

    public void multi(int num1, int num2) throws MultipleNotZeroException { // 곱하기 메소드 단 곱하는수가 0이 되면 안되므로
        // 조건문을 사용해서 0이되면 throw 로 갈수있게 해둠

        if(num2 == 0 || num1 == 0) {
            throw new MultipleNotZeroException("곱하는 수는 0이 될 수 없습니다");
        }else{
        System.out.println("값 : " + num1 * num2);}
    }

    public void divide(int num1, int num2) throws DivideNotZeroException { // 나누기 메소드 나눌수가 0이 되면 안되므로
        // 조건문을 사용해서 0이되면 throw 로 갈수있게 해둠

        if(num2 == 0 || num1 ==0) {
            throw new DivideNotZeroException("나눌 수는 0이 될 수 없습니다");
        }else{
            System.out.println("값 : " + num1 / num2);
        }
    }

    public void divide2(int num1, int num2) throws DivideNotZeroException { // 나누기 메소드와 마찬가지로 함

        if(num2 ==0 || num1 == 0) {
            throw new DivideNotZeroException("나눌 수는 0이 될 수 없습니다");
        }else{
            System.out.println("값 : " + num1 % num2);
        }
    }
}
