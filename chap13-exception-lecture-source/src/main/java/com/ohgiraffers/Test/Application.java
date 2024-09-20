package com.ohgiraffers.Test;

import com.ohgiraffers.section02.userexception.Application02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args)  {
//        Application 클래스와 Calculrator 클래스 구현 ok
//        Application 클래스에서는 main 메소드 구현 ok
//        Application 클래스에서 Scanner 객체를 사용해서 2 개의 정수, 1 개의 사칙연산 기호를 받는다. ok
//        입력 한 정수를 Calculrator 클래스의 메소드로 전달한다.
//                사칙연산이 수학적으로 통용되는 상식선에서 정상적으로 돌아가도록 구현
//        모든 사칙 연산은 정수로 계산되도록 할 것 ok
//        나누기의 경우 나눌 수 가 0인 경우 사용자 정의의 DivideNotZeroException 이 발생하도록 구현
//        DivideNotZeroException 클래스는 message 로 "나눌 수는 0이 될 수 없습니다" 출력
//        곱하기의 경우 곱하는 수가 0인 경우 사용자 정의의 MultipleNotZeroException 이 발생하도록 구현
//        MultipleNotZeroException 클래스는 message 로 "곱하는 수는 0이 될 수 없습니다" 출력
//        그 외에 본인이 만들고 싶은 예외사항 있으면 얼마든지 추가 가능

        Calculrator cal = new Calculrator(); // 클래스 생성
        Scanner sc = new Scanner(System.in); // 스캐너 생성
        System.out.print("정수1을 입력하세요 : "); // 1번 정수 입력
        int num1 = sc.nextInt();
        System.out.print("사칙연산을 입력하세요 +,-,*,/,% : "); // 사칙연산 입력
        char sum1 = sc.next().charAt(0);
        System.out.print("정수2을 입력하세요 : "); // 2번 정수 입력
        int num2 = sc.nextInt();


        switch (sum1) { // 스위치문을 사용해 메소드 호출
            case '+' :
                cal.plus(num1,num2);
            break;
            case '-' :
                cal.minus(num1,num2);
            break;
            case '*' :
                try {
                    cal.multi(num1,num2);
                } catch (MultipleNotZeroException a) {
                    System.out.println(a.getMessage());
                }
                break;
            case '/' :
                try {
                    cal.divide(num1,num2);
                } catch (DivideNotZeroException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case '%' :
                try {
                    cal.divide2(num1,num2);
                } catch (DivideNotZeroException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default :
                System.out.println("정수만 입력해주세요!");
                break;
        }


    }
}
