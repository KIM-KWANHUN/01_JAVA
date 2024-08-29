package com.ohgiraffers.section01.method;

public class Application04 {

    public static void main(String[] args) {

        /* title. 여러 개의 전달인자를 이용한 메소드 호출 테스트 */

        /* index 2. 여러 개 매개변수를 가진 메소드 호출하기. */
        //값의 갯수는 맞지만, 순서가 다르게 전달되면 안된다.

        Application04 app4 = new Application04();
        String name = "김관순";
        app4.testArgMethod("김관훈", 20, '남');
        app4.testArgMethod("김관훈", 20, '남');
        app4.testArgMethod("김관훈", 20, '남');
        app4.testArgMethod("김관훈", 20, '남');
        app4.testArgMethod(name, 20, '남');
        //값으 갯수는 맞지만, 순서가 다르게 전달되면 안된다.

    }
    /* index 1. 여러 개 전달인자를 받을 수 있는 메소드 만들기. */
    public void testArgMethod(String name, int age, final char gender) {

        /* comment.
        *   매개변수도 일종의 지역변수로 분류 된다.
        *   매개변수 역시 상수의 의미를 가지는 final 키워드를 사용할 수 있다.
        *   (지역변수에 final 키워드를 붙이는 것과 동일하다. */
        // 지역변수란 해당 영역안에서만 사용할 수 있는 변수고 영역 바깥에서는 같이 들어가있는 영역이라도 사용할 수 없다.

        System.out.println("제 이름은" + name + "이고, 나이는" + age + "세 이며, 성별은" + gender + "입니다.");


    }

}
