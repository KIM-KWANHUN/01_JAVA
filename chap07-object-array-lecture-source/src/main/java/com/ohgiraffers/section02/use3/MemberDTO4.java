package com.ohgiraffers.section02.use3;

public class MemberDTO4 {

    private String name; // 선수이름
    private int number; // 선수 등번호
    private String country; // 선수 국적
    private String position; // 선수 포지션

    public MemberDTO4() {} // 기본생성자 생성

    public MemberDTO4(String name, int number, String country, String position) {
        this.name = name;
        this.number = number;
        this.country = country;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "MemberDTO4{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", country='" + country + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
