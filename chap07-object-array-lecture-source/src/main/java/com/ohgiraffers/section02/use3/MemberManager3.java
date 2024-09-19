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

    public void MancesterCityMember() {

        MemberDTO4[] player2 = new MemberDTO4[11];
        player2[0] = new MemberDTO4("에데르송",31,"브라질","골키퍼");
        player2[1] = new MemberDTO4("요슈코 그바르디올",24,"크로아티아","센터백");
        player2[2] = new MemberDTO4("마누엘 아칸지",25,"스위스","센터백");
        player2[3] = new MemberDTO4("네이션 아케",6,"네덜란드","센터백");
        player2[4] = new MemberDTO4("로드리",16,"스페인","중앙 미드필더");
        player2[5] = new MemberDTO4("케빈 데브라이너",17,"벨기에","중앙 미드필더");
        player2[6] = new MemberDTO4("필 포든",47,"잉글랜드","중앙 미드필더");
        player2[7] = new MemberDTO4("마테오 코바치치",8,"크로아티아","중앙미드필더");
        player2[8] = new MemberDTO4("제레미 도쿠",11,"벨기에","윙포워드");
        player2[9] = new MemberDTO4("베르나르두 실바",20,"포르투갈","윙포워드");
        player2[10] = new MemberDTO4("엘링 홀란드",9,"노르웨이","스트라이커");

        MemberFmManager4 FmManager4 = new MemberFmManager4();
        FmManager4.insert2(player2);



    }

    public void LiverpoolMember2() {
//        LiverpoolSearchMembers2 searchAllManagers = new LiverpoolSearchMembers2

    }

}
