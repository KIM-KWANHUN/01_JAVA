package com.ohgiraffers.section02.use;

public class MemberDTO {
    // 5. 필드에 사용할 전역변수 만들기

    private int no; // 회원 번호
    private String id; // 회원 id
    private String pwd; // 회원 pwd
    private String name; // 회원 이름
    private int age; // 회원 나이
    private char gender; // 회원 성별

    // 6. 기본생성자 생성
    public MemberDTO() {}
    // 7. 모든 필드를 초기화 하는 생성자 생성

    public MemberDTO(int no, String id, String pwd, String name, int age, char gender) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // 8. getter / setter 생성

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
    }

    // 9. 출력할때 간다히 보일수 있도록 오버라이드 입력

    @Override
    public String toString() {
        return "MemberDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
