package com.ohgiraffers.section01.array;

public class Test2 {

    public static void main(String[] args) {
        /* Q1.길이가 10인 정수형 배열을 선언 및 할당한 뒤 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요. */
        //공식 : 자료형[] 변수명 = new 자료형[공간크기]; ** 자료형은 항상 같아야한다.
        int[] arr1 = new int[10];

        for(int i = 0; i< arr1.length;i++){
            arr1[i] = i +1;
            System.out.println("arr[" + i + "] 출력값은 ? : " + arr1[i]);


        }
    }

    }

