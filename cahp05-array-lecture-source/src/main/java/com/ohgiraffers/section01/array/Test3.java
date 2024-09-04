package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
//        int[] iarr3 = new int[] {11, 22, 33, 44, 55};
        String[] str1 = new String[] {"딸기","바나나","복숭아","키위","사과"};
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int sum1 = sc.nextInt();


            if(sum1 <= 4 && sum1 >= 0){
                System.out.println("준비된 과일이 나왔습니다.");
                System.out.println(str1[sum1]);
            }else{
                System.out.println("준비된 과일이 없습니다.");
            }




        }
    }

