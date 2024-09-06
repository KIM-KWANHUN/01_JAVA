package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {

    /* comment.
    *   접근제한자
    *   클래스 혹은 클래스의 멤버(변수, 메소드)에 참조연산자(.)로
    *   접근할 수 있는 범위를 제한하기 위한 키워드이다.
    *   1. public : 모든패키지에서 접근 가능하다. 가장 많이쓰인다
    *   2. protected : 동일 패키지에서 접근 가능(단, 상속관계에 있는 경우 다른 패키지에서 접근 가능)
    *   3. private : 해당 클래스 내부에서만 접근 가능 이것도 많이 쓰임
    *   4. default : 동일 패키지에서만 접근 허용(쓰지 않는게 default) */
    private String kinds;
    private int hp;

    public void setName(String name) {
        this.kinds = name;

    }
    public void setHp(int hp) {
        if(hp > 0) {
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }
    // 이 메소드의 역활은 몬스터의 정보(이름, 체력)을 알려주는 기능
    public String getInfo(){

        return "몬스터의 이름은" + this.kinds + "이고, 체력은" + this.hp + "입니다.";
    }

}
