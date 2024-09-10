package com.ohgiraffers.section08.initblock;

public class Product {
    /* index 1. 필드를 초기화 하지 않으면 JVM 이 정한 기본값으로 객체 만들어짐. ex) 0,null 등등.. */

//    private String name; // 제품 이름
//    private int price; // 제품 가격
//    private static String brand; // 제품 브랜드

    /* index 2. 명시적 초기화 */
    // 선언과 동시에 값을 입력해서 넣었다는 의미
    private String name = "갤럭시";
    private int price = 2000000;
    private static String brand = "삼성";



    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price + ", brand=" + Product.brand +
                '}';
    }
}
