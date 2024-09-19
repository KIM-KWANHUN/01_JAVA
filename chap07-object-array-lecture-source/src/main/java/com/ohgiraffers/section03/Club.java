package com.ohgiraffers.section03;

public class Club {
    private int age; // 나이
    private String name; // 이름
    private boolean club; // 클럽 참여 여부
    private int num; // 클럽 인원

    public Club() {}

    public Club(int age, String name, boolean club, int num) {
        this.age = age;
        this.name = name;
        this.club = club;
        this.num = num;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClub() {
        return club;
    }

    public void setClub(boolean club) {
        this.club = club;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", club=" + club +
                ", num=" + num +
                '}';
    }
}
