package com.ohgiraffers.section06.ternary;

public class Application {

    public static void main(String[] args) {
        
        /* title. 삼항연산자에 대해 이해할 수 있다. */
        /* comment.
        *   삼향연산자
        *   자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        *   = 항목이 3개다
        *   표현
        *   ex) (조건식) ? 조건이 참일 때 사용할 값 : 조건이 거짓일 때 사용할 값 */

        //ex) 밑에꺼가 예시
        /* index 1. 삼항연산자 단독 사용 */
        int num1 = 10;
        int num2 = -10;
//        ex) (조건식) ? 조건이 참일 때 사용할 값 : 조건이 거짓일 때 사용할 값
        String result1 = (num1 > 0) ? "양수다" : "양수가 아니다"; //앞에 조건식이 true면 앞에 양수다 라는값을 선택
        String result2 = (num2 > 0) ? "양수다" : "양수가 아니다"; //앞에 조건식이 false면 뒤에있는 양수가아니다 라는 값을 선택
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        /* index 2. 삼항연산자 중첩 활용 */
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;
        String result3 = (num3 > 0) ? "양수다" : (num3 == 0) ? "0 이다." : "음수다"; //num3 5
        String result4 = (num4 > 0) ? "양수다" : (num4 == 0) ? "0 이다." : "음수다"; //num4 0
        String result5 = (num5 > 0) ? "양수다" : (num5 == 0) ? "0 이다." : "음수다";//num5 -5

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);

        int num6 = 3;
        int num7 = -3;
        String result6 = (num6 > 0) ? "양수다" :
    }
}
