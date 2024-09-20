package com.ohgiraffers.section02;

import java.util.Set;
import java.util.TreeSet;

public class Application02 {

    public static void main(String[] args) {

        /* title. TreeSet 에 대해 이애하고 사용할 수 있다. */

        /* comment.
        *   TreeSet 클래스는 데이터가 정렬 된 상태로 저장되는
        *   이진 검색 트리 형태로 요소를 저장하게됨
        *   기본 동장 시간이 매우빠르다. */

        TreeSet<String> test = new TreeSet<>();
        test.add("java");
        test.add("mysql");
        test.add("jdb");
        test.add("html");
        test.add("css");

        // 자동 오름차순 정렬 해준다.

        System.out.println("test = " + test);

        /* comment.
        *   로또번호 발생기 실습
        *   요구사항
        *   1. 로또번호 중복 x
        *   2. 로또 번호 오름차순 정렬로 나오게 한다. */
        // 다형성을 적용해서 인스턴스 생성
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) {
            lotto.add(((int)(Math.random() * 45))+1);

            System.out.println("이번 주 로또 당첨 번호는?!!");
            System.out.println(lotto);
        }

    }
}
