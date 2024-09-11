package com.ohgiraffers.section03.overriding;
// 클래스에 final 키워드를 붙이게 되면 상속을 제한하는 의미이다.
public class SubClass extends SuperClass {
    /* comment. 오버라이딩 안될 때 */

    /* index 1. 메소드 이름 변경하면 오류 발생 */
//    @Override
    //public void method2(int num) {} // 슈퍼 클래스에 method2 이름이 존재하지 않기때문

    /* index 2. 메소드의 리턴타입 변경하면 오류 발생 */
//    @Override
//    public int method(int num) {return 0;}
    //리턴 타입 반환형이 다르면 오류가 발생한다.

    /* index 3. 매개변수의 갯수, 타입 변경 시 오류 발생 */
//    @Override
//    public void method(String num) {} 타입이 다르기때문에 오류 발생

    /* index 4. private 메소드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod() {} // private이 붙게되면 어떠한 방식으로도 사용할 수 가 없다.

    /* index 5. final 메소드 오버라이딩 불가 */
//    @Override
//    public final void finalMethod() {} // final 키워드가 붙은 클래스는 오버라이딩 불가능

    /* index 6. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 해야 가능 */
//    @Override
//    void protectedMethod() {} //default 상태로 아무것도 작성되지 않거나 더 좁은 범위로는 오버라이딩 불가능

    /* comment. 오버라이딩 될 때 */

    /* index 1. 메소드의 이름, 리턴타입, 매개변수 갯수, 타입, 순서 모두 일치 */
    @Override
    public void method(int num) {} // 모두 다 일치 해서 오류가 발생하지 않는다.

    /* index 2. 부모 메소드의 접근제한자와 같을 때 */
//    @Override
//    protected void protectedMethod() {} // 부모와 같은 범위는 가능하다.

    /* index 3. 더 넓은 범위로 할때 */
    @Override
    public void protectedMethod() {} // 더 넓은 범위로도 가능하다



}
