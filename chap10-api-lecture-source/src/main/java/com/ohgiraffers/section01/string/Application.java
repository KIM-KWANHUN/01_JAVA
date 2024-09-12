package com.ohgiraffers.section01.string;

public class Application {

    public static void main(String[] args) {

        /* title. String 클래스의 자주 사용하는 메소드에 대해 숙지할 수 있다. */

        /* comment.
         *   charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환 */

        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        /* comment.
        *   concat() : 문자열에 인자로 전달 된 문자열을 합치기
        *   새로운 문자열을 반환한다.
        *   단, 원본 문자열에는 영향을 주지 않는다. */

        String str2 = "java";
        String str3 = "mysql";

        System.out.println("concat() 메소드 활용 : " + (str2.concat(str3)));
        System.out.println("concat() 동작 후 str2 의 값 : " + str2); // 원본 문자열에 영향을 주지않음

        /* comment.
        *   trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */

        String trimStr = "   java   ";
        System.out.println("trimStr : @ " + trimStr + "@"); // 공백 확인용 @
        System.out.println("trim() : @" + trimStr.trim() + "@");
        System.out.println("trimStr = " + trimStr); // 원본 문자열에 영향을 주지않음

        /* comment.
        *   toLowerCase() : 모든 문자를 소문자로 바꿔줌
        *   toUpperCase() : 모든 문자를 대문자로 바꿔줌
        *   마찬가지로 원본에는 영향을 미치지 않는다. */

        String caseStr = "javaMySQL";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase()); // 소문자
        System.out.println("toUpperCase() : " + caseStr.toUpperCase()); // 대문자

        /* comment.
        *   substring() : 문자열의 일부를 잘라내어 새로운 문자열 반환 */

        String str4 = "javaMySQL";
        System.out.println("substring(3, 6) :" + str4.substring(3,6)); //aMy 3번째 문자부터 6번째 전까지 문자열로 새로 출력
        System.out.println("substring(3) : " + str4.substring(3)); // aMySQL 3번째 문자부터 끝까지 새로 출력

        /* comment.
        *   replace() : 문자열에서 대체할 문자열로 기존 문자열로 변경해서 사용한다. */
        System.out.println("replace() : " + str4.replace("java","python")); // 첫번째 입력값이 기존에 있던거 두번째가 바꿀 값


    }

}
