package com.ohgiraffers.section01.list;

import java.util.Stack;

public class Application03 {

    public static void main(String[] args) {
        
        /* title. Stack 구조에 대해 이애할 수 있다. */
        
        /* comment.
        *   Stack
        *   대표적인 예시로 메소드의 호출 구조를 들 수 있다.
        *   선형 메모리 공간에 데이터를 저장하며
        *   후입선출(LIFO - Last In First Out) 방식의 구조이다. */

        Stack<Integer> intergerStack = new Stack<>();
        
        // Stack 에 값을 넣을 때는 push()
        intergerStack.push(1);
        intergerStack.push(2);
        intergerStack.push(3);
        intergerStack.push(4);
        intergerStack.push(5);

        System.out.println("intergerStack = " + intergerStack);

        // stack 요소를 찾을 때 search() 사용 가능하다.
        // 인덱스가 아니라 위에서부터의 순번을 의미한다.
        // 또한 가장 상단의 위치가 0이 아닌 1부터 시작을 한다.
        System.out.println(intergerStack.search(5));
        
        /* comment.
        *   stack 에 값을 꺼내는 메소드는 2가지가 있다.
        *   peek() : 해당 스택 공간에 가장 마지막(상단)에 있는 요소 반환
        *   pop() : 해당 스택 공간에 가장 마지막(상단)에 있는 요소 반환 후 제거 */

        System.out.println("peek() : " + intergerStack.peek());
        System.out.println("intergerStack = " + intergerStack); //peek() 은 값을 반환하되 삭제는 하지 않는다.

        System.out.println("pop() : " + intergerStack.pop());
        System.out.println("intergerStack = " + intergerStack); // 5라는 값을 반환을 하고 5라고 하는 값을 삭제된다. 즉 마지막에 있는 숫자를 제거함
        
        
    }
}
