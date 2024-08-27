package com.ohgiraffers.section05.typecasting;

public class Application04 {

    public static void main(String[] args) {

        /* title. 형변환시 주의점을 이해하고 사용할 수 있다. */

        /* comment.
            * 형변환 시 주의점
               데이터 손실 */
        
        /* index 1. 의도 하지 않는 데이터 손실 */
        int inum = 290; // 1byte -128 ~ 127
        byte bnum = (byte) inum;
        System.out.println("bnum = " + bnum);
        
        /* index 2. 의도한 데이터 손실 */
        double height = 175.5;
        int floorheight = (int) height;
        System.out.println("floorheight = " + floorheight);
        double dnum1 = 80.5;
        double dnum2 = 50.6;
        double dnum3 = 70.8;

        int dnum4 = (int)(dnum1 + dnum2 + dnum3);
        System.out.println("총점 = " + dnum4);
        int dnum5 = (int)(dnum4/3);
        System.out.println("평균 = " + dnum5);

        int inum1 = 20;
                int inum2 = 30;
        System.out.println("더하기 결과 : " + (inum1 + inum2));
        System.out.println("빼기 결과 : " + (inum1 - inum2));
        System.out.println("곱하기 결과 : " + (inum1 * inum2));
        System.out.println("나누기한 몫 결과 : " + (inum1 / inum2));
        System.out.println("나누기한 나머지 결과 : " + (inum1 % inum2));

        double ddnum1 = 12.5;
        double ddnum2 = 36.4;
        double ddnum3 = ddnum1 * ddnum2;
        System.out.println("면적 : "+ ddnum3);
        double ddnum4 = ddnum1 + ddnum1 + ddnum2 + ddnum2;
        System.out.println("둘레 : " + ddnum4);

        double a = 70.4;
        double b = 3.5;
        double c = 51.2;

        double sum = a + b + c;
        System.out.println("sum = " + sum);
        double average = sum/3;
        System.out.println("average = " + average);

        










    }
}
