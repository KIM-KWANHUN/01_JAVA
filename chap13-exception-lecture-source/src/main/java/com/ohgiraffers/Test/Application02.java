package com.ohgiraffers.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Application02 {/* title. ArrayList 활용 예제(1) */

    /* comment.
     *   요구사항
     *   1. 클래스는 Application, BookDTO 클래스로 구성한다. ok
     *   2. Application 클래스는 main 메소드를 포함한다. ok
     *   3. BookDTO 클래스는 책과 관련 된 데이터를 모아둔다. ok
     *   4. BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다. ok
     *   5. BookDTO 를 사용해서 총 다섯 권의 책을 관리 할 것이며 ok
     *      4권의 책은 BookDTO 클래스의 매개변수 있는 생성자로 만들 것이다. ok
     *   6. 나머지 책 한 권은 Scanner 객체를 사용해서 우리가 입력한 값으로
     *      2번째 인덱스에 추가를 할 것이다.
     *  */

    /* comment.
     *   출력 예시
     *   1. Application 에서는 ArrayList 를 만들어 4권의 책을 넣고
     *   출력하는 구문을 작성하라. o
     *   2. 4권의 출력하는 구문은 for 문 과 향상된 for 문 두 가지를 사용하라. o
     *   3. 출력 후 Scanner 객체를 사용해 입력한 값을 ArrayList 에 넣어 출력하라.
     *  */
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO(1,"디지몬어드벤쳐","김관훈",10000); // 매개변수 입력
        BookDTO book2 = new BookDTO(2,"디지몬어드벤쳐2","김관훈",10000);
        BookDTO book3 = new BookDTO(3,"디지몬어드벤쳐3","김관훈",10000);
        BookDTO book4 = new BookDTO(4,"디지몬어드벤쳐4","김관훈",10000);

        Scanner sc = new Scanner(System.in); // 스캐너 생성
        System.out.println("책 번호를 입력하세요 : "); // 책번호 입력하는 출력문
        int num1 = sc.nextInt(); // 입력문
        sc.nextLine();
        System.out.println("책 이름을 입력하세요 : "); // 책이름 입력하는 출력문
        String bookname = sc.nextLine(); // 입력문
        System.out.println("책 저자를 입력하세요 : "); // 책저자 입력하는 출력문
        String name = sc.nextLine(); // 입력문
        System.out.println("책 가격을 입력하세요 : "); // 책가격 입력하는 출력문
        int num2 = sc.nextInt(); // 입력문

        BookDTO book5 = new BookDTO(num1, bookname, name, num2);

        ArrayList<BookDTO> aList = new ArrayList<>(); // array 를 이용해 4개의 책을 출력하는 구문
        aList.add(book1); // aList 에있는 add 를 이용해
        aList.add(book2);
        aList.add(book3);
        aList.add(book4);
        aList.add(2,book5);


        for(int i =0 ; i < aList.size(); i++ ) {
            System.out.println(i + "번째 책은 : " + aList.get(i));
        }





    }
}


