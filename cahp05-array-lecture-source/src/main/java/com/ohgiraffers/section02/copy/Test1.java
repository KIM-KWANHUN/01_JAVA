package com.ohgiraffers.section02.copy;

public class Test1 {

    public static void main(String[] args) {

        int[] origin = {1,2,3,4,5};

        for(int i = 0; i < origin.length; i++)

        System.out.print(origin[i] + " ");
        System.out.println();

        int[] copy = origin;
        for(int i = 0; i< copy.length; i++)

        System.out.print(copy[i] + " ");

        System.out.println();
        methodA();

    }
    public static void methodA(){

        int[] origin = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < origin.length; i++)
            System.out.print(origin[i] + " ");

    }

}
