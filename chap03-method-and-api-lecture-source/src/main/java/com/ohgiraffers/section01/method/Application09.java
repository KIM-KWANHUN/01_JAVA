package com.ohgiraffers.section01.method;

public class Application09 {

    public static void main(String[] args) {

        /* title. 다른 클래스에 작성한 메소드를 호출 할 수 있다. */

        /* comment.
         *   우리는 Application에서 2개의 정수를 전달 할 것이고
         *   calculator 클래스는 2개의 정수를 전달 받아
         *   최솟값을 구하는 메소드(기능)
         *   최댓값을 구하는 메소드(기능)
         *   실행 후 Application에게 2개의 정수 중 큰 값과 작은 값이
         *   무엇인지 알려 줄 것이다. */

        int first = 1;
        int second = 100;

        //부르고싶은 클래스명 변수명 = new 클래스명
        /* comment. non-static method 호출방식 */
        Calculator cal = new Calculator();

        int min = cal.minNumberOF(first, second);

        System.out.println("min = " + min);
        
        Calculator.maxNumberOF(first, second);

        /* comment. static method 호출방식 */

        
        int max = cal.maxNumberOF(first, second);


        System.out.println("max = " + max);


    }
}
