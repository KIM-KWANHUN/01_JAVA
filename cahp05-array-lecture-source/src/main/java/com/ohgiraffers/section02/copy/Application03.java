package com.ohgiraffers.section02.copy;

public class Application03 {

    public static void main(String[] args) {

        /* title. 깊은 복사에 대해 이해할 수 있다. */

        /* comment.
        *   깊은 복사는 heap 에 생성된 배열이 가지고 있는 값을
        *   또 다른 배열에 복사를 해 둔 것이다.
        *   서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기
        *   때문에 원본 또는 복제본을 수정하더라도
        *   서로 영향을 미치지 않는다. */

        /* comment.
        *   깊은 복사를 하는 방법은 4가지가 있다.
        *   1. for 문을 이용한 동일한 인덱스의 값 복사
        *   2. object 의 clone() 메소드를 이용한 값 복사
        *   3. System 의 arraycopy() 메소드를 이용한 값 복사
        *   4. Arrays 의 copyOf() 메소드를 이용한 값 복사
        *   이 중 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해
        *   만들어진 arraycopy() 메소드 이며.
        *   가장 많이 사용 되는 방식은 copyOf() 메소드 이다.
        *   clone() 은 이전 배열과 같은 배열 밖에 만들지 못하는 특징이 있으며,
        *   그 외 3가지 방법은 복사하는 배열의 길이를 조절할 수 있다는 장점이 있다. */

    }

}
