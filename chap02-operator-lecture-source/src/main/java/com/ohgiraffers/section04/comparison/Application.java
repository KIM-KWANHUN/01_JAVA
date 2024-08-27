package com.ohgiraffers.section04.comparison;

import java.sql.SQLOutput;

public class Application {

    public static void main(String[] args) {
        /* title. 비교연산자에 대해 이해하고 활용할 수 있다. */

        /* comment.
        *   비교연산자(가장많이쓰임)
        *   비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여
        *   참 혹은 거짓을 반환하는 연산자이다.
        *   연산자 중 참 혹은 거짓을 반환하는 연산자는
        *   조건식이나 조건문의 조건절에 많이 사용된다.(충분한 연습필요)
        *   */

        /* comment.
        *   비교연산자의 종류
        *   '==' (같냐?) : 왼쪽 피연산자와 오른쪽 피연산자가 같으면 true, 다르면 false
        *   '!=' (아니잖아?) : 왼쪽 피연산자와 오른쪽 피연산자가 다르면 true, 같으면 false
        *   - ! -> 부정표현이다.
        *   '>' : 왼쪽 피연산자가 오른쪽 피연산자 보다 크면 true 아니면 false
        *   '>=' : 초과냐 이상이냐 ex 4>=4 면 true
        *           왼쪽 피연산자가 오른쪽 피연산자 보다 크거나 같으면 true 아니면 false
        *   '<' : 위에 내용이랑 같음
        *   '<=' : 위에 내용이랑 같음 */

        /* index 1. 숫자값 비교 */
        int num1 = 10;
        int num2 = 20;

        System.out.println("==========정수값비교==========");
        System.out.println("num1과 num2 가 같은 지 비교 : " + (num1 == num2)); //다르기때문에 false
        System.out.println("num1과 num2 가 같지 않은지 비교 : " + (num1 != num2)); //같지 않기때문에 true
        System.out.println("num1이 num2 보다 큰 지 비교 : " + (num1 > num2));//크지않기때문에 false
        System.out.println("num1이 num2 보다 작은 지 비교 : " + (num1 < num2));
        System.out.println("num1이 num2 보다 크거나 같은 지 비교 : " + (num1 >= num2));
        System.out.println("num1이 num2 보다 작거나 같은 지 비교 : " + (num1 <= num2));

        /* index 2. 문자 값 비교 */
        char ch1 = 'a'; //숫자상 97
        char ch2 = 'A'; //숫자상 65
        // ==, != 이건 가능하지 않을까?
        // >,< 이건 가능할까?
        // 문자는 내부적으로 숫자로 처리가 되기 때문에 대소비교가 가능하다.!!

        System.out.println("ch1 > ch2 :" + (ch1 > ch2));

        /* index 3. 문자열 값 비교 */
        String str1 = "김관훈";
        String str2 = "김관훈";

        System.out.println("==========문자열값 비교==========");
        System.out.println("st1 과 str2 가 같은지 비교 : " + (str1 == str2));
        System.out.println("st1 과 str2 가 같은지 비교 : " + (str1 != str2));
        // System.out.println("st1 과 str2 가 같은지 비교 : " + (str1 >= str2));
        // 문자열은 ==, !=는 가능하지만, 대소 비교는 불가능하다.













    }
}
