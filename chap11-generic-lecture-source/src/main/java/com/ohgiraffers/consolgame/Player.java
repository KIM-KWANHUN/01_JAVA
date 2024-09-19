package com.ohgiraffers.consolgame;

public class Player {

    private String name;
    private int hp;
    private int attack;
    private int level;

    public Player() {} // 기본 생성자 생성

    public Player(String name, int hp, int attack, int level) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.level = level;
    }
}
