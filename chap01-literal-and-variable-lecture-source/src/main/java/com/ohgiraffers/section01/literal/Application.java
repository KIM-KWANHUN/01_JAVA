package com.ohgiraffers.section01.literal;

public class Application {
    public static void main(String[] args) {


        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. /*

         //필기
         * java 라고 하는 프로그래밍 언어에서
         * 정해진 약속된 형태의 값들이 있다.

         /* 목차. 1 숫자 형태의 값 */
        // 1-1. 정수 형태의 값 출력(숫자)
        System.out.println(123);
        // 1-2. 2 실수 형태의 값 출력(소수점이 붙어있는게 실수)
        System.out.println(1.23);
        /* 목차. 2 문자 형태의 값 */
        // 문자 형태의 값은 홀따옴표(single-quotation)으로 감싸야 한다 ex)하나의 문자 a,b,c
        System.out.println('a');
        // 두 개 이상의 문자를 '' 에 입력하면? 에러가난다
//        System.out.println('ab');
        // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println('');
        // 아무런 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1');
        // 숫자 값이지만, 홀따옴표로 감싸진 경우에는 문자로 인식한다.
        /* 목차. 3 문자열 형태의 갑 출력 */
        System.out.println("안녕하세요");
       // 문자열은 문자 여러 개가 나열된 형태를 의미하며, 쌍따옴표(double-quotation)으로 감싸야한다.
        System.out.println("123");
        System.out.println(""); //아무 값 없는 빈 쌍따옴표도 문자열로 취급한다.
        System.out.println("a"); // 한개의 문자도 쌍따옴표로 감싸면 문자열이다.
        /* 목차. 4 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);
        // 파랑색으로 뜨는건 예약어
        /* 총정리
        *   정수 : 숫자
        *   실수 : 소수점숫자
        *   문자 : 문자도 숫자로 되어있다 'a' 이렇게 홀따옴표를 붙여준다.
        *   문자열 : 문자가 두개이상으로 된것 "안녕 이렇게 쌍따옴표를 붙여준다
        *   논리 : true false 두개를 이용한다.  */








    }
}