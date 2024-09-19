package com.ohgiraffers.section03;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Club club = new Club(27, "peemang", true, 5);

        System.out.println(club.toString());

        System.out.println("나이 : " + club.getAge());
        System.out.println("이름 : " + club.getName());
        System.out.println("클럽 참여 여부 : " + club.isClub());
        System.out.println("클럽 인원 : " + club.getNum());

        ShoppingMall mall = new ShoppingMall("202102130356","peemang123","2021년 02월 13일","피망","PD-0345-12","서울시 관악구 123-456");
        Scanner sc = new Scanner(System.in);

        System.out.print("주문 번호 : ");
        mall.setNum(sc.nextLine());
        System.out.print("주문 아이디 : ");
        mall.setId(sc.nextLine());
        System.out.print("주문 날짜 : ");
        mall.setDate(sc.nextLine());
        System.out.print("주문자 이름 : ");
        mall.setName(sc.nextLine());
        System.out.println("주문 상품정보 : ");
        mall.setNum1(sc.nextLine());
        System.out.println("배송 주소 : ");
        mall.setAddress(sc.nextLine());

        System.out.println(mall.toString());



    }
}
