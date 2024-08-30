package com.ohgiraffers.section04.scanner;

import java.util.Random;

public class Problem {
    public int randomNumber(int min,int max) {

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }
    public String tossCoin(){
        Random random1 = new Random();
        random1.nextInt(2);




        return "coin" ;
    }


    }




