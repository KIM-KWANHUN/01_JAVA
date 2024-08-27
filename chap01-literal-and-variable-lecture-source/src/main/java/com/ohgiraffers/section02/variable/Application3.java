package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args) {
        /* 수업목표. 변수의 명명 규칙에 대해 이해할 수 있다. */

        /* 필기
            * 1. 컴파일 에러를 발생시키는 규칙
            * 2. 컴파일 에러를 발생시키지는 않지만, 개발자들끼리의 암묵적 규칙 */

        /* 목차 1. 컴파일 에러를 발생시키는 규칙 */
        /* 목차 1-1. *동일한 범위 내에서 동일한 변수명은 가질 수 없다. */
        int age = 20;
        //int age = 30; 동일한 변수명을 가지기 때문에 에러가 발생한다.(가장많이 발생하는 에러중 하나이다.)

        /* 목차 1-2. 예약어 사용이 불가능하다. */
        // int true = 20; //쉽게 구분하는 방법은 글자의 색이 다르다. 파랑색으로 되어있는게 예약어 이다.
        // int for = 20;
        // int if = 20;

        /* 목차 1-3. 변수명은 대소문자를 구분한다. */
        int AGE = 20;   // 위에서 우리가 만든 소문자 age와는 다른녀석이다.
        int True = 30; // 예약어 true 와는 다른 녀석이다.

        /* 목차 1-4. 변수명은 숫자로 시작할 수 없다. */
        // int 1age = 50;
        int age1 = 50; // 처음시작하는것만 아니면 숫자를 넣을수 있으나 처음숫자로 시작하는 값은 넣을수 없다.

        /* 목차 1-5. 특수기호는 '_'(언더바),'$' 만 사용이 가능하다. */
        // int sh@op = 20;
        int _age = 20;
        int $hi = 20;

        /* 목차 2. 컴파일 에러는 발생시키지 않지만, 개발자들끼리의 암묵적 규칙!! */

        /* 목차 2-1. 변수명의 길이는 제한이 없다. 하지만 적당히 하자. */
        // int adfljkadkjfalkfdjlkadfjladkjfalkajf = 20;

        /* 목차 2-2. 변수명이 합성어(2개의 단어 합쳐진) 경우 첫 단어는 소문자, 두 번째 단어는 대문자로 시작한다. */
        int maxAge = 20; //Camel-Case (낙타봉 표기법)
        int minAge = 10;
        String user_name = "김관훈"; // java에서는 쓰지않는다.
        String userName = "김관훈";

        /* 목차 2-3. 변수명을 한글로 지어도 에러는 없다. 하지만 권장하지 않는다. */
        int 나이 = 10; //한글로 써도되지만 왠만하면 영어로 쓰는게 좋다.

        /* 목차 2-4. 변수 안에 저장 된 값이 어떤 의미를 가지는지 명확히 표현하자.!! */
        String s = "김관훈"; //잘못된 예
        String name = "김관훈"; // 옳은 예

        /* 목차 2-5. 전형적인 변수 이름이 있다면, 가급적 사용하자 */
        int sum = 0;
        int max = 100;
        int min = -10;
        int cnt = 1;

        /* 목차 2-6. 명사형으로 되도록 작성하면 좋다. */
        String goHome;
        String home;

        /* 목차 2-7. boolean형들은 의문문으로 가급적이면 긍정형태로 작성한다. */
        boolean isAlive = true;
        boolean dead = false; //부정적으로 사용하지 않는다.
        int isum = 20;
        int isum2 = 30;
        System.out.println("더하기 결과 : " + (isum + isum2));
        System.out.println("빼기 결과 : " + (isum - isum2));
        System.out.println("곱하기 결과 : " + (isum * isum2));
        System.out.println("나누기한 몫 결과 : " + (isum / isum2));
        System.out.println("나누기한 나머지 결과 : " + (isum % isum2));
        double extent = 12.5;
        double perimeter = 36.4;
        System.out.println(extent * perimeter);
        System.out.println(extent + extent + perimeter+perimeter);



























    }
}
