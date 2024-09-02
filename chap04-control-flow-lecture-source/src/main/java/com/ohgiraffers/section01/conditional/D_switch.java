package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSwitchStatement(){
        /* title. switch 문 단독 사용에대한 흐름을 이해할 수 있다. */

        /* comment.
        *   [표현식]
        *   switch(if)(비교 할 변수) {
        *       case(if else) 비교값1 : 비교값1 과 일치하는 경우 실행구문; break;
        *       case(if else) 비교값2 : 비교값2 과 일치하는 경우 실행구문; break;
        *       default(else) : case에 모두 해당하지 않는 경우 실행구문; break;
        *       } */

        /* comment.
        *   여러개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
        *   if-else-if 구문과 유사하다.
        *   하지만 switch 문으로 비교가 가능한 값은, 정수, 문자, 문자혈 형태의 값이다.
        *   실수와 논리는 비교할 수 없다. **중요**
        *   또한 정확하게 일치하는 경우만 비교할 수 있으며
        *   대소비교를 할 수 없다는게 차이점이다.
        *   case 절에는 변수를 사용할 수 없다. <- 값만 비교 가능하다. */
        /* index 1. 문제
        *   정수 두개와 연산 기호 문자를 입력 받아
        *   두 숫자의 연산 결과를 출력해보는 계산기 만들어보기 */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();

        System.out.println("두번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력(+, -, *, /, %) : ");
        // 문자열을 chaAt(인덱스)로 문자만들기
        char op = sc.next().charAt(0);
        // 입력한 연산기호 문자에 따라서 연산 결과를 다르게 만들어보기

        int result = 0;

        switch (op) {
            case '+' : result = first + second;
            break;
            case '-' : result = first - second;
            break;
            case '*' : result = first * second;
            break;
            case '/' : result = first / second;
            break;
            case '%' : result = first % second;
            break;
        }
        System.out.println(first + " " + op + " " + second + "=" + result);

    }
    public void testSwitchVendingMachine(){

        System.out.println("========== HiMedia 음료 자판기 ==========");
        System.out.println("   s     m     n     c     h     k    ");
        System.out.println("=======================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("음료를 선택해주세요 : ");

        String selectDrink = sc.nextLine();
        //투입 가격을 위한 변수 선언
        int price = 0;

        switch (selectDrink) {
            case "s" :
                System.out.println("사이다를 선택했습니다.");
                price = 2000;
            case "m" :
                System.out.println("맥콜을 선택했습니다.");
                price = 800;
            case "n" :
                System.out.println("눈의솔을 선택했습니다.");
                price = 700;
            case "ㅊ" :
                System.out.println("콜라를 선택했습니다.");
                price = 400;
            case "h" :
                System.out.println("환타을 선택했습니다.");
                price = 1500;
            case "k" :
                System.out.println("밀키스을 선택했습니다.");
                price = 2000;
        }
        System.out.println(price + "원을 투입해주세요");

        System.out.println("===============================================");
        System.out.println("============== HiMedia 음료 자판기===============");
        System.out.println("===============================================");
    }
    public void test2 (){

        System.out.println("========== HiMedia 음료 자판기 ==========");
        System.out.println("   s     m     n     c     h     k    ");
        System.out.println("=======================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("음료를 선택해주세요 : ");

        String selectDrink = sc.nextLine();
        //투입 가격을 위한 변수 선언
        int price = 0;
        String orderMenu = "";

        switch (selectDrink) {
            case "s" :
                System.out.println("사이다를 선택했습니다.");
                orderMenu = "사이다";
               price = 2000;
               break;
            case "m" :
                System.out.println("맥콜을 선택했습니다.");
                orderMenu = "맥콜";
                price = 800;
                break;
            case "n" :
                System.out.println("솔에눈을 선택했습니다.");
                orderMenu = "솔에눈";
                price = 700;
                break;
            case "c" :
                System.out.println("콜라를 선택했습니다.");
                orderMenu = "콜라";
                price = 400;
                break;
            case "h" :
                System.out.println("환타을 선택했습니다.");
                orderMenu = "환타";
                price = 1500;
                break;
            case "k" :
                System.out.println("밀키스을 선택했습니다.");
                orderMenu = "밀키스";
                price = 2000;
                break;
        }
        System.out.println(price + "원을 투입해주세요");

    }
}
