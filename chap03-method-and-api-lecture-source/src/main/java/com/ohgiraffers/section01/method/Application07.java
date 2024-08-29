package com.ohgiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {
        //매개변수, 전달인자, 리턴
        /* **매우중요** title. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해할 수 있다. */

        /* comment.
        *   매개변수와 리턴값 복합 응용
        *   매개변수도 존재하고 리턴값도 존재하는 메소드를 이용해서
        *   간단한 계산기 만들어보기. */

        /* comment.
        *   더하기,빼기,곱하기,나누기 메소드
        *   해당하는 메소드들에게 2개의 정수를 넘겨 줄 것이다. */

        int first = 20;
        int second = 10;
        Application07 app7 = new Application07();
        app7.plusTwoNumbers(first, second); // 30과 똑같은 의미
        System.out.println(app7.plusTwoNumbers(first, second));
        app7.minusTwoNumbers(first, second);
        System.out.println(app7.minusTwoNumbers(first, second));
        app7.mutipleTwoNumbers(first, second);
        System.out.println(app7.mutipleTwoNumbers(first, second));
        app7.divideTwoNumbers(first, second);
        System.out.println(app7.divideTwoNumbers(first, second));



    }
    public int plusTwoNumbers(int first, int second) {
        System.out.println("first = " + first);
        System.out.println("second = " + second);

        return first + second;
    }

    public int minusTwoNumbers(int first1, int second2) {
        System.out.println("first1 = " + first1);
        System.out.println("second2 = " + second2);

        return first1 - second2;
    }

    public int mutipleTwoNumbers(int first3, int second4) {
        System.out.println("first3 = " + first3);
        System.out.println("second4 = " + second4);

        return first3 * second4;

    }

    public int divideTwoNumbers(int first5, int second6) {
        System.out.println("first5 = " + first5);
        System.out.println("second6 = " + second6);


        return first5/second6;
    }

}
