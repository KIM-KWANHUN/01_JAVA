package com.ohgiraffers.section02.use2;

public class MemberInsertManager2 {

    public void insert(MemberDTO2[] member) {
        System.out.println("전달 받은 회원" + member.length + "명 등록 하겠습니다.!!");
        for(int i = 0; i < member.length;i++){
            System.out.println(member[i].getName() + "님을 회원 등록에 성공했습니다.");
            // 반복문을 통해서 멤버 i가 다 반복 될때까지 반복문을이용하고 getName 을 써서
            //  이름을 출력해준다.
        }

    }
}
