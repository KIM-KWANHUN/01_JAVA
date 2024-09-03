//package com.ohgiraffers.section01.conditional;
//
//import java.util.Scanner;
//
//public class Test {
////
//    public void test1 () {
//
//        System.out.println("다이어트 중인 한사람이있다.");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("몸무게를 보고 결정하려 한다 몸무게는? : ");
//        int sum1 = sc.nextInt();
//        System.out.print("치킨집은 문이 열렸나요 : ");
//        boolean trueFalse = sc.nextBoolean();
//
//
//        if (sum1 > 70) {
//            System.out.println("샐러드를 먹겠어");
//
//        }else if(trueFalse == true) {
//            System.out.println("치킨을 먹겠어");
//        } else {
//            System.out.println("라면을 먹겠어");
//
//         public void test2 (){
//
//       package com.ohgiraffers.section01.conditiona
package com.ohgiraffers.section01.conditional;
public class Test {
    public void starPiramid(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < (a - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}










