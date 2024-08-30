package com.ohgiraffers.section03.math;

public class Application {

    public static void main(String[] args) {

        /* title. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */

        /* comment.
        *   API란?
        *   Application Programming Interface는 프로그램에서 사용할 수 있도록,
        *   운영체제나 프로그래밍 언어가 제공하는 기능을 이용(제어)할 수 있도록 만든
        *   인터페이스를 의미한다.
        *   쉽게 말해 우리가 구현하기(만들기) 힘들거나, 번거로운 기능을 JDK만 설치하게 되면
        *   사용할 수 있도록 제공해둔 소스코드를 의미한다.
        *   더 쉽게 말하면 인도형님이나 미국형님들이 만든 유용한 기능을
        *   우리는 가져와서 쓰기만 하면 된다. */

        /* index. 1. 절댓값 출력 해보기 */
        System.out.println("-7의 절댓값 구하기 : " +(Math.abs(-7))); //절댓값 abs

        /* index 2. 최대값과 최소값 출력 해보기 */
        //최대값
        System.out.println("10과 20중 더 큰 값은? : " + Math.max(10,20));
        //최소값
        System.out.println("10과 20중 더 작은 값은? : " + Math.min(10,20));

        /* index 3. 난수 출력 */
        System.out.println("랜덤 값 출력 : " + Math.random());

        System.out.println("11과 12중 더큰값은?" + Math.max(11,12));


    }
}
