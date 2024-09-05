package com.ohgiraffers.section02.copy;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();

        if(num1 > 0) {
            if (num1 % 2 == 0) {
                System.out.println(" 짝수다 ");
            } else {
                System.out.println(" 홀수다 ");
            }
        }
        else{
            System.out.println(" 양수를 입력하세요 ");
        }

    }

}
