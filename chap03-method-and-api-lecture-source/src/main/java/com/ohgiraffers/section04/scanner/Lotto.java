package com.ohgiraffers.section04.scanner;

public class Lotto {

    public static void main(String[] args) {
        //Lotto 자동 생성기
        int min = 1;
        int max = 45;

        Problem app1 = new Problem();
        app1.randomNumber(min,max);
        System.out.println("번호 자동생성기 이다");
        System.out.println("당신의 번호는? : " + app1.randomNumber(min,max));

        String front = "앞면";
        String back = "뒷면";

        Problem app2 = new Problem();
        app2.tossCoin();
        System.out.println();

        


    }
}
