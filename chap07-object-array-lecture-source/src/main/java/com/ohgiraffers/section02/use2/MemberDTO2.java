package com.ohgiraffers.section02.use2;

public class MemberDTO2 {

    private int no; // 회원 번호
    private String id; // 회원 아이디
    private String pwd; // 회원 비밀번호
    private String name; // 회원 이름
    private int age; // 회원 나이
    private char gender; // 회원 성별

    public MemberDTO2() {} // 1. 기본 생성자 생성

    public MemberDTO2(int no, String id, String pwd, String name, int age, char gender) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender; // 2. 매개변수를 이용한 생성자 생성
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    } // 3. setter, getter 만들기

    @Override
    public String toString() {
        return "MemberDTO2{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    } // 4. toString() ** 만들기 출력하는것을 편하게 보기위해서 **
}
