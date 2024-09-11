package com.ohgiraffers.section02.use2;

import com.ohgiraffers.section02.use.MemberDTO;
import com.ohgiraffers.section02.use.MemberInsertManager;
import com.ohgiraffers.section02.use.MemberSearchManager;

public class MemberManager2 {
    public void signUpMembers() {

        MemberDTO2[] member = new MemberDTO2[5]; //클래스 배열에 정보 집어넣기
        member[0] = new MemberDTO2(1,"user1","pass01","민지",19,'여');
        member[1] = new MemberDTO2(2,"user2","pass02","하니",19,'여');
        member[2] = new MemberDTO2(3,"user3","pass03","해린",19,'여');
        member[3] = new MemberDTO2(4,"user4","pass04","다니엘",19,'여');
        member[4] = new MemberDTO2(5,"user5","pass05","혜인",19,'여');

        MemberInsertManager2 insertManager2 = new MemberInsertManager2(); // 회원 정보에 특화된 클래스 만들기
        insertManager2.insert(member); // insertManager2에 있는 insert 메소드 생성하기
    }

    public void searchAllMember2() {
        MemberSearchManager2 searchManager2 = new MemberSearchManager2();
        MemberDTO2[] sum1 = searchManager2.searchAllManager2();
        System.out.println("==================가입된 뉴진스====================");

        for(MemberDTO2 member : sum1) {
            System.out.println(member.toString());
        }
        System.out.println("==============================================");
        System.out.println("총" + sum1.length + "명의 회원이 가입되어 있습니다.!!!");







    }
}
