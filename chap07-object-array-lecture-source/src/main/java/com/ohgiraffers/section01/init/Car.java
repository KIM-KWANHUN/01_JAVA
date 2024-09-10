package com.ohgiraffers.section01.init;

public class Car {

    private String modelName; //접근 제한
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) { // 매개변수가 들어간 생성자
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void carMaxSpeedInfo() { //클래스 하나만들어서 출력할 수 있다.
        System.out.println(modelName + "이(가) 최고속도 " + maxSpeed + "km/h 로 달려갑니다!!!!!!!!!!!!");
    }


}
