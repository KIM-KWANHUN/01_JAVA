package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Test2 {
    public void test2() {
//        /* 1부터 10까지 합계를 구하고 결과를 출력하세요.
//         *
//         * -- 출력 예시 --
//         * 1부터 10까지의 합 : 55
//         * */
        int sum1 = 0;
        for(int i = 1; i < 11; i++){
            sum1+=i;
            System.out.println("1부터 10까지의 합 : " + sum1);
        }
    }
    public void test3(){
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<a;i++);
        a += 0;
        System.out.println("1부터" + a + "까지의 합 : ");

    }
}
