package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application {

    public static void main(String[] args) {

        /* title. extends 키워드를 사용해서 특정 타입만 사용할 수 있도록 범위를 제한할 수 있다. */
        // Animal Rabbit 이거나 Rabbit 의 후손이 아니다.
        // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        //RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>()

        RabbitFarm<Rabbit> farm3 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>();

        farm3.setAnimal(new Rabbit());
        farm3.getAnimal().cry();

        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();

        farm5.setAnimal(new DrunkenBunny());
        farm5.getAnimal().cry();
    }
}
