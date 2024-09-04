package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        String[] str1 = {"딸기","바나나","복숭아","키위","사과"};
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int sum1 = sc.nextInt();

        for(int i = 0; i < str1.length; i++);
        sum1 += str1.length;
        System.out.println(str1.length);


        }
    }

