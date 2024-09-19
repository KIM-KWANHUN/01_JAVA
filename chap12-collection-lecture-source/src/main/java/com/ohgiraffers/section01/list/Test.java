package com.ohgiraffers.section01.list;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList();
        
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(1.1);
        alist.add(1.2);
        alist.add(1.3);
        alist.add('일');
        alist.add('이');
        alist.add('삼');
        alist.add("one");
        alist.add("two");
        alist.add("three");

        System.out.println("alist = " + alist);

        for(int i = 0; i < alist.size(); i++) { // 반복문을 통해 출력 size 는 갯수를 얘기해주는 구문
            System.out.println(i+"인덱스의 값 : " + alist.get(i)); // get 은 출력을 할때 구문
        }
        alist.add(1,'A');
        alist.add(2,'B');
        alist.add(3,'C');

        System.out.println("alist = " + alist);
        
    }
}
