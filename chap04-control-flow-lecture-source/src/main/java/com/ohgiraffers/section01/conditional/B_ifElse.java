package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    /* title. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

    /* comment.
    *   [if-else문 표현식] //if-else문 공식
    *   if(조건식) {
    *       조건이 true일 때 실행할 구문;
    *   } else {
    *       조건이 false일 때 실행할 구문;
    *   } */

    /* comment.
    *   if문은 조건식의 결과가 참(true)이면 if{} 내부의 코드 실행,
    *   else문은 조건식의 결과가 거짓(false)이면 else{} 내부의 코드 실행 */

    /* index 1. 문제
    *   정수 한 개를 입력 받아 그수가 홀수이면"입력하신 숫자는 홀수입니다." 출력하고
    *   홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 만들어보자.
    *   단, 조건과 상관없이 프로그램이 종료될 때 "프로그램이 종료합니다."라고 출력되도록 해보자. */


    public void testIFElseStatement(){

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");

        int num1 = sc.nextInt();

//        if (num1 % 2! = 0) {
//            System.out.println("입력하신 정수는 홀수 입니다.");
//            else {
//                System.out.println("입력하신 정수는 짝수 입니다.");

            }

        }

//        System.out.println("프로그램을 종료 합니다.");
//
//        public void testNestdIFElseStatement(){
//            /* index 2.문제
//            *   숫자를 하나 입력받아 양수이면"입력하신 숫자는 양수입니다." 출력하고
//            *   음수이면 "입력하신 숫자는 음수입니다." 출력
//            *   단, 0이면 "입력하신 숫자는 0입니다." 출력
//                조건과 상관없이 프로그램이 종료될때 "프로그램을 종료합니다"라고 출력*/
//
//        Scanner sc1 = new Scanner(System.in);
//
//            System.out.println("숫자를 입력해주세요 : ");
//            int num2 = sc1.nextInt();
//
//            if(num2 !=0){
//                if(num2 > 0) {
//                    System.out.println("입력하신 숫자는 양수입니다.");
//                } else {
//                    System.out.println("입력하신 숫자는 음수입니다.");
//                }
//
//
//        } else {
//                System.out.println("입력하신 숫자는 0입니다.");
//            }
//            }
//        System.out.println("프로그램을 종료합니다.");
//        }
//    }
//
