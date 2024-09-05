package com.ohgiraffers.section02.copy;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        String[] food = {"치킨","피자","짜장면","짬뽕","돈까스","라면","마라탕","분식","족발","보쌈","삼겹살","햄버거"};
        System.out.print("오늘의 점심메뉴는 ? : ");
        int randomfood = (int)(Math.random() * food.length);

            System.out.println(food[randomfood] + " 먹으러 가자");
    }

}
