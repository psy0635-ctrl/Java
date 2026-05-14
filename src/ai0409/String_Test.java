package ai0409;

import java.util.Scanner;
public class String_Test {
    public static void main(String[] args) {

        String s = "난생처음 자바";

//        int len = s.length();     // 문자열의 길이 재기

        System.out.println("내용 : " + s);
        System.out.println("길이 : " + s.length());  // '난, 생, 처, 음, (공백), 자, 바' 총 7개이므로 7을 반환합니다.

        s = "software 입니다.";
        System.out.println("대문자로 출력 : " + s.toUpperCase()); // 모든 영문자를 대문자로 바꿉니다.
        System.out.println("원래 문자열 : " + s);
        System.out.println("소문자로 출력 : " + s.toLowerCase()); // 모든 영문자를 소문자로 바꿉니다.
        System.out.println("원래 문자열 : " + s);

        s ="                인공 지능 소프트 웨어                    ";
        System.out.println("trim 전 : " + s);
        System.out.println("trim 후 : " + s.trim()); // trim() : 양쪽 끝 공백 제거
        System.out.println("원래 문자열 출력: " + s);


    }
}
