package com.ohgiraffers.section04.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application02 {

    public static void main(String[] args) {

        /* title. time 패키지의 클래스들에 포매팅을 적용해서 출력할 수 있다. */

        String timeNow = "10:17:10";
        String dateNow = "2024-09-13";

        LocalTime localTime = LocalTime.parse(timeNow); //parse 통해 문자열을 타입을 바꾸는 것
        LocalDate localDate = LocalDate.parse(dateNow);

        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);

        String timeNow2 = "10-17-10";
        String dateNow2 = "240913";

        LocalTime localTime1 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss")); //시, 분, 초
        System.out.println("localTime1 = " + localTime1);
        LocalDate localDate1 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd")); // 년, 월, 날짜
        System.out.println("localDate1 = " + localDate1);

    }
}
