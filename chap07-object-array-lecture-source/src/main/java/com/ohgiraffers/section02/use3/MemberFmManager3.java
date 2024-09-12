package com.ohgiraffers.section02.use3;

public class MemberFmManager3 {
    public void insert(MemberDTO3[] player) {
        System.out.println("입력 하신 선수" + player.length + "명 등록 하겠습니다.");
        for(int i =0 ; i < player.length; i++) {
            System.out.println(player[i].getName() + "선수를 등록에 성공했습니다.");
        }
    }
}
