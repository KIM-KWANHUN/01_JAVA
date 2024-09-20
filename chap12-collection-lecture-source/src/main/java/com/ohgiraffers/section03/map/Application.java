package com.ohgiraffers.section03.map;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        /* title. Map 의 자료구조에 대해 이해하고 HashMap 을 이용할 수 있다. */

        /* comment.
        *   Map 인터페이스의 특징
        *   - 일반적인 Collection 인터페이스와는 다른 저장 방식을 가지고 있다.
        *   - ** 매우중요 **   Map 의 가장 큰 특징은 키(key) 와 값(value) 를 하나의 세트로 저장하는 방식이다. */

        /* comment.
        *   키(key) 란?
        *   값을 찾기 위한 이름 역활을 하는 객체를 의미한다. -> 변수의 역활
        *   1. 키는 중복 저장을 허용하지 않지만, 키가 다르다면 값은 중복이 가능함
        *   2. 요소의 저장 순서를 유지하지 않는다. */

        /* comment.
         *   Map 인터페이스를 구현한 클래스는 대표적으로
         *   HashMap, HashTable, TreeMap 등이 있다.
         *   이 3가지 클래스 중 HashMap 이 가장 많이 사용되며
         *   해시 알고리즘이 적용되어 검색 속도가 매우 빠른 특징을 가지고 있다.
         * */

        HashMap hMap = new HashMap();

        /* index 1. HashMap 인스턴스에 값 저장하기 */
        // put() : Map 에 값을 집어넣는 메소드
        hMap.put("one", new Date());
        hMap.put(12,"red apple");
        hMap.put(33,123);

        System.out.println("hMap = " + hMap); //Map 은 출력할 시 순서대로 나오지 않는다. 그리고 key 와 value 를 넣어야 한다.
        
        /* index 2. 키는 중복 저장이 안된다.(set 방식) */
        // key 는 중복저장이 되지 않기때문에 가장 최신의 키로 덮어 쓰여진다.
        hMap.put(12,"yellow banana"); // put 으로 값을 넣음
        System.out.println("hMap = " + hMap);

        /* index 3. 값은 중복저장이 되는 지 확인 */
        // key(변수) 값만 중복 되지 않으면 value(값) 은 중복이 저장이 가능하다.
        hMap.put(11,"yellow banana");
        hMap.put(10,"yellow banana");
        System.out.println("hMap = " + hMap);

        /* index 4. Map 에 저장된 값 꺼내기 */
        System.out.println("12번 키에 해당하는 값 : " + hMap.get(12)); // put 으로 값을 넣고 get 으로 값을 가져온다.
        // 12번째 키의 변수를 가로안에 적어주면됨

        hMap.remove(12); // remove 키워드는 삭제를 하는 키워드
        System.out.println("hMap = " + hMap);

        // 저장 된 객체 수 확인 size() 메소드
        System.out.println("hmap 에 저장 된 객체 수 : " + hMap.size());

        // 다형성 적용해서 HashMap 만들기
        Map<String, String> hmap2 = new HashMap<>(); // 제너릭을 이용해 String 타입으로 넣기!!
        hmap2.put("one","java");
        hmap2.put("two","mysql");
        hmap2.put("three","jdbc");
        hmap2.put("four","mybatis");
        hmap2.put("five","jpa");

        /* index 1. keySet() 을 이용해서 키만 따로 Set 으로 만들고, iterator() 로 목록 만들기 */
        Set<String> keySet = hmap2.keySet(); // set 방식으로 바뀜
        Iterator<String> keyIter = keySet.iterator(); // iterator 방식으로 바뀜

        /* index 2. Iterator 에서 제공하는 hasNext(), next() 메소드 사용해서 반복문 이용하기 */
        while (keyIter.hasNext()) {
            String key = keyIter.next(); // 요소를 담아둠
            String value = hmap2.get(key);
            System.out.println(key);
            System.out.println(value);
            System.out.println(key + "=" + value);
        }



    }

}
