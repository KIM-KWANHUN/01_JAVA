package com.ohgiraffers.section01.method;

public class Calculator {

    /* comment.
    *   우리는 Application에서 2개의 정수를 전달 할 것이고
    *   calculator 클래스는 2개의 정수를 전달 받아
    *   최솟값을 구하는 메소드(기능)
    *   최댓값을 구하는 메소드(기능)
    *   실행 후 Application에게 2개의 정수 중 큰 값과 작은 값이
    *   무엇인지 알려 줄 것이다. */
// first : 1 second : 100
    public int minNumberOF(int first1, int second2) {


        return (first1 < second2) ? first1 : second2;
    }

    public static int maxNumberOF(int first1, int second2) {

        return (first1 > second2) ? first1 : second2;
    }
}
