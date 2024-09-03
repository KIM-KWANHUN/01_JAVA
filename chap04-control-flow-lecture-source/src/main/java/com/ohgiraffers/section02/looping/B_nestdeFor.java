package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestdeFor {

    public void printGugudanTwoToNine(){
        // 2에서 9단까지의 구구단 모두 출력
        // 단 -> 2~9
        // 수 -> 1~9

        for(int dan = 2; dan <= 9; dan++){

            for(int su = 1; su <= 9; su++){
                System.out.println(dan + "*" + su + "=" + (dan*su));
            }
            //한 줄 띄우기
            System.out.println();
        }

    }
    //1~3 복습 매개변수, 전달인자
    public void upgradeGugudanTwoToNine(){
        for(int dan =2; dan <=9; dan++){
            printGugudanOf(dan);
            //한줄 띄어쓰기
            System.out.println();


        }



    }

    private void printGugudanOf(int dan) {
        //어떤 값을 전달 받는지 확인하는 출력문
        System.out.println("dan = " + dan);
        //메소드의 전달인자와 매개변수를 이용해서 하는방법
        for(int su = 1; su <= 9; su++){
            System.out.println(dan + " * " + su + " = " + (dan*su));

        }
    }
    public void printStarInputRowTimes() {
        /* comment.
         *   키보드로 정수를 입력 받아 해당 정수만큼
         *   한 행에 "*"을 5개씩 출력하는 구문 */

        // 3
        // *****
        // *****
        // *****

        Scanner sc = new Scanner(System.in);
        System.out.print("출력 할 행수를 입력해주세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++)  {            //
//            for(int j = 1; j <= 5; j++){
//                System.out.print("*");

            // 위에 for문을 메소드 복습을 위해 호출식으로 변
            printStar(5);
            //한줄 띄우기
            System.out.println();
        }
    }
    private void printStar(int times) {
        for(int i = 1; i <= times; i++){
            System.out.print("*");
        }


    }
}






