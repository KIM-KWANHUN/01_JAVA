package com.ohgiraffers.Test;

public class BookDTO {
    private int number; // 책번호
    private String bookName; // 책이름
    private String name; // 책만든이
    private int price; // 책가격

    public BookDTO() {} // 기본 생성자 생성

    public BookDTO(int number, String bookName, String name, int price) {
        this.number = number;
        this.bookName = bookName;
        this.name = name;
        this.price = price;
    } // 매개변수를 담는 생성자 생성

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    } // get,set 생성

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", bookName='" + bookName + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
