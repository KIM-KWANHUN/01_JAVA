package com.ohgiraffers.section01.method;

public class Application05 {

    public static void main(String[] args) {

        /* title. 메소드 리턴에 대해서 이해할 수 있다. */

        /* comment.
        *   return 이란?
        *   모든 메소드 내부에는 return; 이 존재한다.
        *   void형의 메소드는 return;을 명시(굳이쓰지않더라도)적으로 작성하지 않아도
        *   마지막 줄에 컴파일러가 자동으로 추가를 해준다.
        *   return은 현재 메소드를 강제 종료하고
        *   **매우중요** 호출한 구문으로 돌아가는 명령어이다. */

        System.out.println("main 시작함...");

        Application05 app5 = new Application05();
        app5.testMethod();

        System.out.println("main 종료됨...");
    }

    public void testMethod() {
        System.out.println("testMethod() 호출됨...");

        System.out.println("testMethod() 종료됨...");

        return; // 회색은 안 써도 되는거 or 안 쓰고 있는거
        /* comment.
        *   return 키워드는 컴파일러에 의해 자동으로 (**매우중요** void가 붙은녀석만 가능)
        *   가장 마지막 줄에 추가된다.
        *   만약 가장 마지막 줄에 쓰지 않게 되면
        *   도달할 수 없는 코드가 되어 컴파일 에러를 발생 시킨다. */

//        System.out.println("종료됐나?"); //도달할수 없는(접근할수 없는) return을 해서 다시 맨처음으로 돌아감

    }
}
