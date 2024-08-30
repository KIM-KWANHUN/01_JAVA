package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {
        
        /* title. java.util.Random 클래스를 사용해서 난수 발생 */


        Random random = new Random();
        //클래스명 //변수명 = new //클래스명

        /* comment.
           * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값    */
        
        int randomNumber = random.nextInt(45);
        System.out.println("randomNumber = " + randomNumber);

        // 1~10
        int random1 = random.nextInt(10) + 0;
        System.out.println("random1 = " + random1);

        // 10 ~ 15
        int random2 = random.nextInt(6) + 10;
        System.out.println("random2 = " + random2);

        // -127/ 128
        int random3 = random.nextInt(256) + -127;

    
    }
}
