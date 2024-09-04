package com.ohgiraffers.section01.array;

public class Test1 {

    public static void main(String[] args) {
        //랜덤 게임을 진행하여 점심메뉴를 정하려 한다. 배열을 이용하여 음식을 정해보자

        String[] food = {"치킨","피자","짜장면","짬뽕","돈까스","라면","마라탕","분식","족발","보쌈","삼겹살","햄버거"};

        int randomfood = (int)(Math.random() * food.length );

        System.out.print("오늘의 점심메뉴는? : " + food[randomfood] + "입니다." );
        System.out.println(" 맛있게 드세요~");

    }



    }

