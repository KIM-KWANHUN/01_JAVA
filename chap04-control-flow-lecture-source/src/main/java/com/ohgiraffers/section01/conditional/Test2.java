package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Test2 {
    public void test1() {
//
//    public void test1 () {
//
//        System.out.println("다이어트 중인 한사람이있다.");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("몸무게를 보고 결정하려 한다 몸무게는? : ");
//        int sum1 = sc.nextInt();
//        System.out.print("치킨집은 문이 열렸나요 : ");
//        boolean trueFalse = sc.nextBoolean();
//
//
//        if (sum1 > 70) {
//            System.out.println("샐러드를 먹겠어");
//
//        }else if(trueFalse == true) {
//            System.out.println("치킨을 먹겠어");
//        } else {
//            System.out.println("라면을 먹겠어");

        System.out.println("알바중이다. 맥주를 판매하려면 신분증 검사를 해야한다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("나이가 어떻게 되십니까?");
        int age = sc.nextInt();

        if (age > 19) {
            System.out.println("구매하셔도 됩니다.");
        } else {
            System.out.println("죄송하지만 꺼지세요.");
        }


    }

    public void test2() {
        System.out.println("이벤트 부스 게임진행 중입니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("짝홀, 그 결과는?");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("축하드립니다. 짝입니다.");
        } else {
            System.out.println("축하드립니다. 홀입니다.");
        }

    }

    public void test3() {
        System.out.println("당첨번호가 어떻게 되세요?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0 && num < 10) {
            if (num % 2 == 0) {
                System.out.println("짝수네요, 인형 선물이에요!!");
            }
            if (num % 2 != 0) {
                System.out.println("홀수네요, 모자 선물이예요!!");
            }
        }else {
                System.out.println("1~10사이에 없으면 꽝입니다.");
            }
            //num<=10
        }
        public void test4(){
            System.out.println("건강건진 해드릴께요 bmi에 따라 축제를 즐길수 있어요.");
            Scanner sc = new Scanner(System.in);
            double num = sc.nextInt();

            if()








        }

    }






