package com.ohgiraffers.section01.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        /* title. ArrayList 활용 예제(1) */

        /* comment.
         *   요구사항
         *   1. 클래스는 Application, BookDTO 클래스로 구성한다. ok
         *   2. Application 클래스는 main 메소드를 포함한다. ok
         *   3. BookDTO 클래스는 책과 관련 된 데이터를 모아둔다. ok
         *   4. BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다. ok
         *   5. BookDTO 를 사용해서 총 다섯 권의 책을 관리 할 것이며 ok
         *      4권의 책은 BookDTO 클래스의 매개변수 있는 생성자로 만들 것이다. ok
         *   6. 나머지 책 한 권은 Scanner 객체를 사용해서 우리가 입력한 값으로
         *      2번째 인덱스에 추가를 할 것이다. ok
         *  */

    /* comment.
    *   출력 예시
    *   1. Application 에서는 ArrayList 를 만들어 4권의 책을 넣고
    *   출력하는 구문을 작성하라. ok
    *   2. 4권의 출력하는 구문은 for 문 과 향상된 for 문 두 가지를 사용하라. ok
    *   3. 출력 후 Scanner 객체를 사용해 입력한 값을 ArrayList 에 넣어 출력하라. ok */

        ArrayList<BookDTO> app1 = new ArrayList();
        BookDTO book1 = new BookDTO(1,"우리들의 일그러진 영웅","이문열",10000);
        BookDTO book2 = new BookDTO(2,"나미야 잡화점의 기적","히가시노 게이고",10000);
        BookDTO book3 = new BookDTO(3,"영원한 천국","정유정",10000);
        BookDTO book4 = new BookDTO(4,"이중 하나는 거짓말","김애란",10000);
        Scanner sc = new Scanner(System.in);
        System.out.println("책의 번호는 : ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("책의 이름은 : ");
        String name = sc.nextLine();
        System.out.println("책의 저자는 : ");
        String writer = sc.nextLine();
        System.out.println("책의 가격은 : ");
        int price = sc.nextInt();
        BookDTO book5 = new BookDTO(num,name,writer,price);
        app1.add(book1);
        app1.add(book2);
        app1.add(book3);
        app1.add(book4);
        app1.add(2,book5);

        for (int i = 0; i < app1.size();i++) {
            System.out.println(i + "번째 의 책 : " + app1.get(i));
        }




    }
}
