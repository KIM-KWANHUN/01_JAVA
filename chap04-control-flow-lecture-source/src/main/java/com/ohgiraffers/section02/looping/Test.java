package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public void test() {


    }

    public void printTriangleStars() {
        /* comment.
         *   키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*"을 행의 번호개씩 출력
         *   ex) 정수를 입력해주세요 : 5
         *   *
         *   **
         *   ***
         *   ****
         *   ***** */
        // 초기식 : int i = 1;
        // 조건식 : i <= 10;
        // 증감식 : i++
        Scanner sc = new Scanner(System.in);
        System.out.print("출력하실 행수를 입력해주세요. : ");
        int row = sc.nextInt();

        String result = "";
        for (int i = 1; i <= row; i++){
            result += "*";
            System.out.println(result);
        }


    }

    public void printReverseTriangleStars() {
        /* comment.
         *   ex) 정수를 입력해주세요 : 5
         *   *****
         *   ****
         *   ***
         *   **
         *   * */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력하실 행수를 입력해주세요. : ");
        int row = sc.nextInt();

        String result = "";
        for (int i = 1; i >= row; i--);{
            for(int i =1; i>= row; i++){
                result += "*";
            }

            System.out.println(result);
        }

    }
}

