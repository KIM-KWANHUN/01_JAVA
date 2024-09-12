package com.ohgiraffers.section02.use3;

public class MemberManager3 {
    public void LiverpoolMember() {

        MemberDTO3[] player = new MemberDTO3[11];
        player[0] = new MemberDTO3("알리송 베케르",1,"브라질","골키퍼");
        player[1] = new MemberDTO3("앤디 로버트슨",26,"스코틀랜드","레프트백");
        player[2] = new MemberDTO3("트렌트 알렉산더-아놀드",66,"잉글랜드","라이트백");
        player[3] = new MemberDTO3("버질 반다이크",4,"네덜란드","센터백");
        player[4] = new MemberDTO3("이브라힘 코나테",5,"프랑스","센터백");
        player[5] = new MemberDTO3("라이언 흐라벤베르흐",38,"네덜란드","중앙 미드필더");
        player[6] = new MemberDTO3("도미니크 소보슬러이",8,"헝가리","중앙 미드필더");
        player[7] = new MemberDTO3("알렉시스 맥 알리스터",10,"아르헨티나","중앙 미드필더");
        player[8] = new MemberDTO3("모하메드 살라",11,"이집트","윙포워드");
        player[9] = new MemberDTO3("루이스 디아스",7,"콜롬비아","윙포워드");
        player[10] = new MemberDTO3("다르윈 누녜스",9,"우루과이","스트라이커");

        MemberFmManager3 FmManager3 = new MemberFmManager3();
        FmManager3.insert(player);
    }

    public void LiverpoolMember2() {

    }

}
