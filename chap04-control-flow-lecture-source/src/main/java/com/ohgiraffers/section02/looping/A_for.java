package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){

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
        for(int i =1; i<=10; i++) {
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

        for(int i = 1; i <= 10; i++){
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 성적을 입력해주세요 : ");
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다. ");

        }

    }
}
