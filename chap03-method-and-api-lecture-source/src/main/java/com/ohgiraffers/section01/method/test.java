package com.ohgiraffers.section01.method;

public class test {

    public static void main(String[] args) {
        test app1 = new test();
        app1.methodA();
        app1.methodF();
        app1.methodB();
        app1.methodF();
        app1.methodC();
        app1.methodF();
        app1.methodD();
        app1.methodF();


    }
    public void methodA() {
        System.out.print("은미");

    }

    public void methodB() {
        System.out.print("정현");

    }

    public void methodC() {
        System.out.print("승현");

    }

    public void methodD() {
        System.out.print("이정");

    }
    public void methodF(){
        System.out.println("님 안녕하세요?");

    }
}
