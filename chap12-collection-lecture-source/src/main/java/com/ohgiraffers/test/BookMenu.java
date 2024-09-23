package com.ohgiraffers.test;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
    //    private int bNo; // 도서번호
//    private int category; // 장르 분류 번호
//    private String title; // 도서 제목
//    private String author; // 도서 저자
    Scanner sc = new Scanner(System.in);
    BookDTO book = new BookDTO();

    public void mainMenu() {

        while (true) {
            System.out.println("=================도서 관리 프로그램=================");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 프로그램 종료");
            System.out.print("번호를 입력해주세요");
        }
        int num1 = sc.nextInt();

        switch (num1) {
            case 1 :
                BookManager.addBook(inputBook());
                break;
            case 2 :
                BookManager.announce();
            case 3 :
                BookManager.deleteBook(inputBookNo());
                break;
            case 4 :
                BookManager.searchBook(inputBookTitle());
                break;
            case 5 :
                BookManager.displayAllBooks();
                break;
            case 6 :
                return;
            default:
                System.out.println("잘못 된 번호를 입력하셨습니다.");
                break;
        }

    }

    public BookDTO inputBook() { // 도서
        System.out.print("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();

        System.out.println("도서 장르 입력 : 1. 인문, 2. 자연과학, 3. 의료, 4. 기타 : ");
        int category = sc.nextInt();

        System.out.println("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(title, category, author);
    }

    public int inputBookNo() { // 삭제할 도서번호 리턴반환
        System.out.println("삭제할 도서 번호를 입력해주세요 : ");
        return sc.nextInt();
    }

    public String inputBookTitle() { // 검색할 도서제목 리턴반환
        System.out.println("검색할 도서 제목을 입력해주세요 : ");
        return sc.nextLine();
    }
}

