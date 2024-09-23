package com.ohgiraffers.test;

public class BookDTO {
    private int category; // 장르 분류 번호
    private String title; // 도서 제목
    private String author; // 도서 저자

    public BookDTO(String title, int category, String author) {} // 기본 생성자

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    } // 매개변수 담을 생성자

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
