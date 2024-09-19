package com.ohgiraffers.section03;

import java.time.LocalDate;

public class ShoppingMall {

    private String num; // 주문번호
    private String id; // 주문자 아이디
    private String date; // 주문 날짜
    private String name; // 주문자 이름
    private String num1; // 주문 상품 번호
    private String address; // 배송주소

    public ShoppingMall() {} // 기본생성자

    public ShoppingMall(String num, String id, String date, String name, String num1, String address) {
        this.num = num;
        this.id = id;
        this.date = date;
        this.name = name;
        this.num1 = num1;
        this.address = address;
    } // 모든값을 초기화 하는 생성자

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", num1='" + num1 + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
