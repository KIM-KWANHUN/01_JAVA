package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 합치기 결과를 예측해서 사용할 수 있다. */

        /* 세 개의 문자열 합치기 */
        System.out.println("==========세 개의 문자열 합치기==========");
        // 정수 9, 정수 9 ,문자열 "9" 를 가지고
        // 189
        // 999
        System.out.println(9+9+"9");
        System.out.println("9"+9+9);
        // + 연산결과는 항상 왼쪽에서 오른쪽이다.
        System.out.println("9"+(9+9)); // 먼저하고 싶은걸 감싸면됨

        /* 10과 20의 사칙연산 결과 */
        System.out.println("==========보기 안 좋은 10과 20의 연산 결과==========");
        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10*20);
        System.out.println(10/20);
        System.out.println(10%20);

        System.out.println("==========보기 좋은 10과 20의 사칙연산 결과==========");
        System.out.println("10과 20의 합 결과 :" + (10+20));
        System.out.println("10과 20의 차 결과 :" + (10-20));
        System.out.println("10과 20의 곱 결과 :" + (10*20));
        System.out.println("10과 20의 나누기 결과 :" + (10/20));
        System.out.println("10과 20의 나누기 한 나머지 결과 :" + (10%20));
        System.out.println("10과 20의 합 결과 :" + (10+20));
        System.out.println(7+8+"9");
        System.out.println("7"+9+8);
        System.out.println("8"+9+7);
        System.out.println("9"+(7+8));

        /* 총정리
        * 세개의 문자열 합치는것은 9+9+"9"=189가 나온다 숫자를 먼저하고 문자열로 씌운 9를 붙인다.
        * "9"+9+9 이렇게 문자열이 먼저 있는경우는 문자열로 나머지도 취급되기 때문에 999가 나온다
        * "9"+(9+9) 처럼되잇으면 괄호를 덮었으므로 괄호를 따로계산하여서 918이 된다. 문자열은 그대로 */





    }
}
