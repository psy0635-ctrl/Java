package ai0402;

import java.util.Scanner;

public class Pound_KG_Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("<==== 파운드/킬로그램 변환기 ====>");
        System.out.println("파운드를(lb)를 입력하세요 ==> ");
        double lb = s.nextDouble();     // 소수점 숫자(double) 입력 받기
        System.out.println(lb + "파운드(lb)는" + (lb * 0.453) + "킬로그램(kg)입니다.");
        // 파운드 --> 킬로그램 변환

        System.out.println("<==== 킬로그램/파운드 변환기 ====>");
        System.out.println("킬로그램(kg)을 입력하세요 ==>");
        double kg = s.nextDouble();
        System.out.println(kg + "킬로그램(kg)은" + (kg * 2.204) + "파운드(lb)입니다.");
        // 킬로그램 --> 파운드 변환

        s.close();  // 사용 후 scanner 해제A



    }
}

