package com.ohgiraffers.section06;

public class Test2 {
    //노래 한곡을 나타내는 song 클래스 작성
    //title : "crazy"
    //artist : LE SSERAFIM
    //country : korea

    private String title;
    private String artist;
    private String country;
    public Test2(){
        System.out.println("기본생성자 호출됨...");
    }
    public Test2(String title, String artist, String country){
        this.title = title;
        this.artist = artist;
        this.country = country;

    }

    @Override
    public String toString() {
        return "Test2{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
