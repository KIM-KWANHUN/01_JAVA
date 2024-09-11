package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Computer extends Product { //Product 클래스 상속 받기 Computer 클래스는 자식
    // 자식 클래스에서도 필요한 필드 만들기
    private String cpu; // cpu
    private int hdd; // 메모리 카드
    private int ram; // RAM
    private String os; // 운영체제

    public Computer(){
        System.out.println("Computer 클래스의 기본생성자 호출됨...");
    }

    public Computer(String code, String brand, String name, int price, LocalDateTime manufacturingDate, String cpu, int hdd, int ram, String os) {
        /* comment.
        *   부모의 모든 필드를 초기화하는 생성자로 값 전달 */
        super(code, brand, name, price, manufacturingDate); // ** 자식클래스는 부모의 클래스에 있는 필드값까지 초기화가 된다. **
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        System.out.println("Computer 클래스의 부모 필드도 같이 초기화 하는 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String os) { // 자식 클래스의 값 초기화
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출됨...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String getInfo() { // 부모에 있는 클래스에 toString 을 오버라이딩 Alt+Insert 누르고 오버 라이딩 영어로 된거 누르기
        return super.getInfo() + "Computer ["
                + " cpu= " + this.cpu
                + ", hdd = " + this.hdd
                + ", ram = " + this.ram
                + ", os = " + this.os;
    }
}
