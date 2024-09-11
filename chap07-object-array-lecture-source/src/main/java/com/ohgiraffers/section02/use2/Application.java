package com.ohgiraffers.section02.use2;

import com.ohgiraffers.section02.use.MemberManager;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 회원 정보 입력해주기
        MemberManager2 manager2 = new MemberManager2(); //클래스 만들어보기

        while (true){
            System.out.println("===========HiMedia 회원 관리 프로그램===============");
            System.out.println("1. 회원 정보 등록");
            System.out.println("2. 회원 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 : ");
            int sum = sc.nextInt();

            switch (sum) {//switch 반복문으로 프로그램 이용시키기
                case 1 : manager2.signUpMembers();
                    break;
                case 2 : manager2.searchAllMember2();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다 다시 이용해주세요!");
                    break;
                default :
                    System.out.println("없는 번호 입니다. 다시 입력 해주세요!");
                    break;
            }



        }
    }
}
