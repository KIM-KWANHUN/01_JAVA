package com.ohgiraffers.section04.time;

import java.time.*;

public class Application {
    
    public static void main(String[] args) {

        /* title. time 패키지에서 제공하는 클래스들의 사용 문법 */
        
        /* comment.
        *   time 패키지는 JDK 1.8 에서 추가가 되었다.
        *   Date, Calendar 가 가지고 있는 한계점을 극복하기 위해 나왔다.
        *   LocalTime, LocalDate, LocalDateTime, ZonedDateTime
        *   등 대표적인 클래스가 있다. */

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);

        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);

        LocalDate dateOf = LocalDate.of(2024,8,15); // 우리가 입력한것을 반환해줌
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now(); // 현재의 날짜와 시간 반환
        System.out.println("dateTimeNow = " + dateTimeNow);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(dateOf, timeNow, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime1 = " + zonedDateTime1);


        
    }
}
