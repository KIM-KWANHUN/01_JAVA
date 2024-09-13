package com.ohgiraffers.section02.use3;

import com.ohgiraffers.section02.use2.MemberManager2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberManager3  manager3 = new MemberManager3();

        while(true){
            System.out.println("========리버풀 스쿼드 명단==========");
            System.out.println("1. 리버풀 선수정보 등록");
            System.out.println("2. 리버풀 선수 조회");
            System.out.println("3. 맨시티 선수 등록");
            System.out.println("4. 맨시티 선수 조회 ");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 : ");
            int sum = sc.nextInt();

            switch (sum) {
                case 1 :
                    break;
                case 2 :
                    break;
                case 9 :
                    System.out.println("스쿼드 조회를 종료합니다.");
                    break;
                default :
                    System.out.println("없는번호입니다.");
                    break;
            }
        }
    }

}
