package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();
//사용자는 카레이서를 들렷다 자동차에게 가야된다. 클래스도 자료형이다.
    public void startUp(){
        car.startUp();
    }

    public void stepAccelator(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }

}
