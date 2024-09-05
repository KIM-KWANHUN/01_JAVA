package com.ohgiraffers.section02.copy;

public class Application02 {

    public static void main(String[] args) {

        /* title. 얕은 복사를 활용해서 매개변수와 리턴값을 활용할 수 있다. */

        /* comment.
        *   얕은 복사의 활용
        *   얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        *   리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다. */

        String[] names = {"푸바오", "러바오", "아이바오"};
        //얕은 복사 확인을 위한 hashcode()구문
        System.out.println("name 배열의 hashcode() : " + names.hashCode());

        // 우리가 만든 배열을 출력하는 기능을 가진 메소드에 전달
        // 우리가 값을 보내면 -> 받는 곳도 값을 담을 준비를 해야 된다. 즉 매개변수
        // 받을곳과 보내는곳에 자료형이 일치해야 한다.
        // String[] baoFamily = names;와 똑같은 의미이다.
        print(names);

        /* index. 리턴 값을 활용 */
        String[] animals = getAnimals();

        System.out.println("리턴 받은 animals의 hashcode() : " + animals.hashCode());

        print(animals);

    }
        /* comment. print() 메소드의 역활은 우리가 전달한 배열을 출력하는 역활이다. */
    public static void print(String[] baoFamily){

        System.out.println("baoFamily 의 hashcode : " + baoFamily.hashCode());
//        출력값(얕은 복사가 되어서 값이 똑같다.
//        name 배열의 hashcode() : 918221580
//        baoFamily 의 hashcode : 918221580
        for (int i = 0;i < baoFamily.length; i++){
            System.out.print(baoFamily[i] + " ");
        }
        System.out.println();

    }
    public static String[] getAnimals(){
        //void가 아닌경우에는 return값을 넣어줘야하고 위에 제목에있는 자료형과 리턴값 자료형이 같아야한다.
        String[] animals = {"후이바오","루이바오"};
        //

        System.out.println("새로 만든 animals 의 hashcode() : " + animals.hashCode());
//        출력값
//        새로 만든 animals 의 hashcode() : 1804094807
//        리턴 받은 animals의 hashcode() : 1804094807

        return animals;
    }

    }

