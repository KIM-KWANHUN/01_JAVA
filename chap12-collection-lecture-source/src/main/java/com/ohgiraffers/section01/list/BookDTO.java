package com.ohgiraffers.section01.list;

public class BookDTO {

    private int num;
    private String name;
    private String writer;
    private int price;

    public BookDTO() {} // 기본 생성자 생성

    public BookDTO(int num, String name, String writer, int price) {
        this.num = num; // 책 번호
        this.name = name; // 책 이름
        this.writer = writer; // 책 저자
        this.price = price; // 책 가격
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price +
                '}';
    }
}
