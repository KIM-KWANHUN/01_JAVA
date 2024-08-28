package com.ohgiraffers.section01.method;

public class Application {

    public static void main(String[] args) {

        /* title. 메소드의 호출 흐름에 대해 이해할 수 있다. */
        /* comment.
        *   메소드란?
        *   메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문(코드)의 집합
        *   프로그램 시작에 관련된 작업을 하는기능 */

        System.out.println("main() 시작됨...");

        /* index 2. 작성한 methodA() 호출하기. */ //컴퓨터는 반드시 불러야 동작을 함
        /* comment.
        *   우리가 만든 메소드 호출하는 방법.
        *   [표현식]
        *   클래스명 변수명 = new 클래스명();
        *   변수명.메소드명(); */ //새로운 키워드가 발생함

        /* comment.
        *   main 영역 밖에 있는 친구를 소환할때 쓰는 구문
        *    */
        Application app1 = new Application(); //새로운 키워드 발생한거 입력 Application -> 클래스명 app1 -> 변수명 = new App
        //lication
        app1.methodA(); // app1 -> 변수명.method() -> 새롭게만든 메소드명
//      바깥에서 만든 코드는 꼭 메인에서 불러와야됨 안그러면 동작안됨!!!!! **매우중요**

        System.out.println("main() 종료됨...");
    }

        /* index 1. methodA() 만들어보기 */ //각자의 영역이 있기때문에 변수는 같은이름으로 만들어도 된다.
        public void methodA() { //public -> 어디든 사용가능, methodA -> 변수랑 같은 의미

            System.out.println("methodA() 등장...");

            methodB();//메인안에있는 내가만든 메소드들은 이렇게 간단히 써도 메소드가 가능하다.

            System.out.println("methodA() 퇴장...");


        }
        /* index 3. methodB() 만들어보기 */
        public void methodB() {

            System.out.println("methodB 두둥장...");

            System.out.println("methodB 퇴장한다...");

            /* 총정리
            * 이공간에 {}맨처음 마지막이 메인메소드다.
            * 메소드 만드는방법 : ex)Application app1 = new Application();
            *                       클래스명    변수명  *new  클래스명();
            *                     app.methodA();
            * 메소드 만드는법
            * public void 클래스명(){} 이렇게 만든다.
            * **매우중요** 메소드 흐름은 꼭외우기 쉽게 설명하자면 밑으로가면서 작업을하고 다시 원래했던데로 돌아온다는 느낌 */





        }


}
