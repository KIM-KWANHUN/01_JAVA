package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    //    private int bNo; // 도서번호
//    private int category; // 장르 분류 번호
//    private String title; // 도서 제목
//    private String author; // 도서 저자
    Scanner sc = new Scanner(System.in);
    List<BookDTO> List = new ArrayList<>();

    public void addBook(BookDTO book) {
        List.add(book);
        System.out.println("도서가 추가되었습니다." + book.getTitle());

    } // 해당 bookDTO 객체를 담기

    public void deleteBook(int index){
        List.remove(index);
        System.out.println("도서가 삭제되었습니다.");

    } // 전달받은 위치의 인덱스 값 제거
    public void searchBook(String title){

    } // 전달받은 제목으로 리스트에서 조회하여 일치하는 객체가 있으면 도서출력하고
      // 없는경우 "조회된 도서가 목록에 없습니다" 를 출력
      public void displayAll(){

      } // 도서목록 전체 출력


      }
