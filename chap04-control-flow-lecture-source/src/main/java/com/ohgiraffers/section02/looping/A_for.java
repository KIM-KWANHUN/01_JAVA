package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /* title. for 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* comment.
         *   [for 문 표현식]
         *   for(초기식;조건식;증감식;) {
         *       조건을 만족하는 경우 수행할 구문(반복 구문);
         *   } */

        /* index 1.1부터 10까지 1씩 증가시키면서 i 값을 출력하는 반복문 */
        // 초기식 : int i = 1;
        // 조건식 : i <= 10;
        // 증감식 : i++
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

    }

    public void testForExample() {

        /* title. 무엇을 반복 하는 지를 확인해서 반복문으로 개선 */

        /* comment.
         *   10명의 학생 이름을 입력 받아 이름을 출력해보자. */

        Scanner sc = new Scanner(System.in);
        System.out.println("1번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1번째 학생의 이름은" + student1 + "입니다.");

        String student2 = sc.nextLine();
        System.out.print("2번째 학생의 이름은" + student2 + "입니다.");

        String student3 = sc.nextLine();
        System.out.print("3번째 학생의 이름은" + student3 + "입니다.");

        String student4 = sc.nextLine();
        System.out.print("4번째 학생의 이름은" + student4 + "입니다.");

        String student5 = sc.nextLine();
        System.out.print("5번째 학생의 이름은" + student5 + "입니다.");

        String student6 = sc.nextLine();
        System.out.print("6번째 학생의 이름은" + student6 + "입니다.");


        String student7 = sc.nextLine();
        System.out.print("7번째 학생의 이름은" + student7 + "입니다.");

        String student8 = sc.nextLine();
        System.out.print("8번째 학생의 이름은" + student8 + "입니다.");

        String student9 = sc.nextLine();
        System.out.print("2번째 학생의 이름은" + student9 + "입니다.");


        String student10 = sc.nextLine();
        System.out.print("10번째 학생의 이름은" + student10 + "입니다.");

        System.out.println("=============================================");

        /*comment.
         *  둘중 어떤 코드가 더 좋은 코드 일까?
         *  둘다 좋은코드다 why? -> 요구사항을 만족했기 때문에 좋은코 드다.
         *   1. 보다 간결하게 작성이 되었다. (가독성 상승)
         *   2. 학생의 이름 뿐 아니라, 성적이나 이름을 입력하는
         *   기능도 추가를 해야한다면? (유지 보수성 상승) */

        /* comment.
         *   반복해야 하는 내용
         *   -1. 안내문구
         *   -2. 학생의 이름 입력 받아 변수에 저장
         *   -3. 저장 된 이름을 출력 */

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 성적을 입력해주세요 : ");
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다. ");

        }

    }

    public void testForExample2() {

        /* index 2. 1부터 10까지 합계를 구하시오. */
        System.out.println("1부터 10까지의 합 ");
        // 초기식 : int i = 1;
        // 조건식 : i <= 10;
        // 증감식 : i++

        //반복문 미사용
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        // 합계를 저장하는 변수
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        System.out.println("sum = " + sum);
        System.out.println("==============================================================");

        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += i;


        }

        System.out.println("sum2 = " + sum2);

    }

    public void testForExample3() {

        /* index 3. 문제
         *   5 ~ 10 사이에 난수를 발생시켜
         *   1부터 발생한 난수까지의 합계를 구해보자. */
//* random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값 */
        int random = (int) (Math.random() * 6) + 5;
        int sum = 0; //결과를 담을 변수
        // 초기식 : int i = 1;
        // 조건식 : i <= random
        // 증감식 : i++
        for (int i = 1; i <= random; i++) {
            sum += i;

        }
        System.out.println("1부터" + random + "까지의 합은 : " + sum);

        Random random1 = new Random();

    }

    public void testForExample4() {
        /* comment.
         *   숫자 2개를 입력 받아 작은 수에서 큰 수 까지의 합을 구하시오.
         *   단, 두 숫자는 같지않다를 가정하에 진행한다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int first = sc.nextInt();

        System.out.print("두번째 정수 입력 : ");
        int second = sc.nextInt();

        //합산 결과를 담을 변수 만들어 두기
        int sum = 0;
        // 만약 첫번째로 입력한 정수가 더 큰 경우
        if (first > second) {

            for (int i = second; i < first; i++) {
                sum += i;
            }
        } else {
            for (int i = first; i <= second; i++) {
                sum += i;

            }
        }

        // 만약 두번째로 입력한 정수가 더 큰 경우
    }

    public void printSimpleGugudan() {

        /* commnet.
         *   스캐너로 2-9 사이의 구구단을 받아
         *   2-9사이인 경우 구구단을 출력하고
         *   그렇지 않으면 "반드시 2-9 사이의 양수를 입력하세요
         *   출력해보세요*/
        Scanner sc = new Scanner(System.in);
        System.out.print("축력할 구구단의 단 수를 축력해주세요");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9) {

            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + "*" + su + "=" + (dan * su));

            }


        } else {
            //dan 이라고 하는 값이 2-9 사이가 아닌 경우 작성할 영역
            System.out.println("반드시 2~9 사이의의 양수를 입력하세요.");
        }

    }
}










