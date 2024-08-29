package com.ohgiraffers.section05.logical;

public class Application {

    public static void main(String[] args) {

        /* title. 논리연산자에 대해 이해하고 활용할 수 있다. */

        /* comment.
        *   논리 연산자
        *   논리값(true of false)를 취급하는 연산자이다. */

        /* comment.
        *   1. 논리 연결 연산자
        *       - 두 개의 피연산자를 가지는 이향 연산자이며, 두 개의 논리 식을 판단하여 참과 거짓을 판단해준다.
        *       - 1-1 &&(AND) 연산자
        *       - 두 개의 논리식 모두 참 일경우 참을 반환, 둘중 하나라도 거짓이면 거짓이다. */
        /*       - 1-2 ||(OR) 연산자
        *       - 두 개의 논리식 둘 중 하나라도 참일 경우 참을 반환, 둘 다 거짓이면 거짓이다. */
        /*    2. 논리 부정 연산자
        *       - 피연산자가 하나인 단항 연산자
        *       - 2-1 !(논리 NOT) 연산자
        *       - 논리식의 결과가 참이면 거짓, 거짓이면 참을 반환한다.
        *       - (식을 반전? 시킨다.) */
            /* index. 논리 연산자의 결과값 확인 */
        System.out.println("true와 true의 논리 and 연산 : " + (true&&true));
        System.out.println("true와 false의 논리 and 연산 : " + (true&&false));
        System.out.println("false와 true의 논리 and 연산 : " + (false&&true));
        System.out.println("false와 false의 논리 and 연산 : " + (false&&false));
        //둘다 참이여야 한다. 그래야 &&하면 true이다. 즉 하나라도 다르면 false(거짓) 이다.
        //ex) 연필 지우개 둘다있으면 true 하나라도 없으면 false(&&)
        System.out.println("===================================================");

        System.out.println("true와 true의 논리 and 연산 : " + (true||true));
        System.out.println("true와 false의 논리 and 연산 : " + (true||false));
        System.out.println("false와 true의 논리 and 연산 : " + (false||true));
        System.out.println("false와 false의 논리 and 연산 : " + (false||false));
        //둘중 하나라도 참이면 true이다 둘다 false면 false이다.
        //ex) 연필과 지우개 하나라도 있으면 true 둘다없으면 false(||)
        System.out.println("===================================================");
        System.out.println("true의 논리 not 연산 : " + (!true)); // false이다.
        //느낌표가 앞에있으면 반대가 된다. !true -> false  !false -> true



        /* index 2.논리식에 논리연산자 활용해보기 */
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        //&&연산자
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d)); //&&연산자
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
        System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b && c < d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지지 확인 : " + (a > b && c > d));
        //ex) 롤을하면서 게임을한다? &&연산자
        // 그리고,면서
        //||연산자
        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d)); //||연산자
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + (a > b || c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지지 확인 : " + (a > b || c > d));
        //ex) 롤을하거나 게임을하거나 ||연산자
        // 거나,둘중하나
        System.out.println("=====연습문제=====");
        int a1 = 15;
        int b1 = 25;
        int c1 = 35;
        int d1 = 45;

        System.out.println("a1이 b1보다 작으면서 c1이 d1보다 작은지 확인 : " + (a1 < b1 && c1 < d1));
        System.out.println("a1이 b1보다 작으면서 c1이 d1보다 큰지 확인 : " + (a1 < b1 && c1 > d1));
        System.out.println("a1이 b1보다 크면서 c1이 d1보다 작은지 확인 : " + (a1 > b1 && c1 < d1));
        System.out.println("a1이 b1보다 크면서 c1이 d1보다 큰지 확인 : " + (a1 > b1 && c1 > d1));

        System.out.println("=====||문제=====");
        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + (a > b || c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d));

    }
}
