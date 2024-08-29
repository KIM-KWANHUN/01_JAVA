package com.ohgiraffers.section01.method;

public class Test {
    public static void main(String[] args) {

        int sum1 = 10;
        int sum2 = 20;
        int sum3 = 5;

//        부르고싶은 클래스명 변수명 = new 클래스명
        System.out.println("메소드 호출 확인");
        Test2 app1 = new Test2();
        app1.sumTwoNumber(sum1, sum2);
        System.out.println("10과 20의 합 : " + app1.sumTwoNumber(sum1, sum2));
        Test2 app2 = new Test2();
        app2.minusTwoNumber(sum1, sum3);
        System.out.println("10과 5의 차 : " + app2.minusTwoNumber(sum1, sum3));
        Test2 app3 = new Test2();
        app3.multiTwoNumber(sum1, sum3);
        System.out.println("10과 5의 곱 : " + app3.multiTwoNumber(sum1, sum3));
        Test2 app4 = new Test2();
        System.out.println("10과 5의 나눈 몫 : " + app4.divideTwoNumber(sum1, sum3));



    }

   
    
    
}
