package com.ohgiraffers.section02.extend;

/* 주의사항 : RabbitFarm 은 말그대로 토끼들을 위한 농장 */
public class RabbitFarm<T extends Rabbit> {

    // RabbitFarm<Snake> rabbitFarm = new RabbitFarm<T>();

    /* <T extend Rabbit> 의 의미
    *   타입변수(T) 어떤 녀석이 될 지 모른다. 가상의 변수
    *   하지만, ex) extend Rabbit 이라고 설정을 하게 되면
    *   rabbit 이거나, rabbit 를 상속 받는 녀석은 다 가능하다. */

    private T animal;

    public RabbitFarm() {} // 기본 생성자

    public RabbitFarm(T animal) { // 모든 필드를 초기화 하는 생성자
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
