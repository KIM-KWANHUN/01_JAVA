package com.ohgiraffers.section02.use3;

public class MemberFmManager4 {

    public void insert2(MemberDTO4[] player2) {
        System.out.println("입력 하신 선수" + player2.length + "명 등록 하겠습니다.");
        for(int i =0 ; i < player2.length; i++) {
            System.out.println(player2[i].getName() + "선수를 등록에 성공했습니다.");
        }
    }
}
