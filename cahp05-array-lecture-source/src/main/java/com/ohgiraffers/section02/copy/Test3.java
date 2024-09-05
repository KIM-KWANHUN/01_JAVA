package com.ohgiraffers.section02.copy;

import java.util.Scanner;

public class Test3 {



    public void printTriangleStarts() {
            /* 필기.
             *   키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 '*'을 행의 번호개씩 출력한다
             *   예) 정수를 입력해주세요 : 5 */

            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력해주세요 : ");
            int star = sc.nextInt();

            for (int i = 1; i < star; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public void printReversTriangleStars() {
            /* 필기.
             *  예) 정수를 입력해주세요 : 5  */
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력해주세요 : ");
            int star = sc.nextInt();

            for (int i = 1; i < star; i++) {
                for (int j = star; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public void printTriangle() {
            for (int i = 1; i < 6; i++) {
                for (int j = 5; j > i; j--) {  //위쪽 삼각형
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 4; i > 0; i--) { //아래쪽 삼각형
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }



