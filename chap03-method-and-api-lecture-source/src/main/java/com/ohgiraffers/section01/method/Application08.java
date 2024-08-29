package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /* title. static 메소드를 호출 할 수 있다. */
        /* comment.
        *   우리가 지금 만들고 있는 메소드는 public과 void 자료형 사이에
        *   static 키워드가 붙은 메소드를 만들어서 호출을 해 볼 것이다.
        *   static 키워드가 붙은 메소드 호출을 알아 볼 것이다. */

        /* comment.
        *   [표현식]
        *   클래스명.메소드명();*/ //static은 표현식만 다른것이다 나머지 방식은 똑같다.

        Application08.sumTwoNumbers(10,20);

        int result = Application08.sumTwoNumbers(10,20);
        System.out.println("result = " + result);

        /* 동일한 클래스 내에 작성 된 static 메소드는 클래스명이 생략 가능하다. */

    }
    public static int sumTwoNumbers(int firtst, int second) {



        return firtst * second;
    }
}
