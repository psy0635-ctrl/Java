package ai0402;

import java.util.Scanner;

public class Calculator_Test {     // Class명과 파일명이 일치해야함!!
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("<==== 사칙연산 계산기 ====>");
    System.out.print("정수1 입력하세요 : ");
    int num1 = s.nextInt();

    System.out.print("정수2 입력하세요 : ");
    int num2 = s.nextInt();

    // 입력받은 두 정수로 사칙연산과 나머지 연산을 각각 수행합니다.
    System.out.println(num1 +"+"+num2 +"="+(num1 + num2));
    System.out.println(num1 +"-"+num2 +"="+(num1 - num2));
    System.out.println(num1 +"x"+num2 +"="+(num1 * num2));
    // 나눗셈은 double로 형변환하여 소수점 결과까지 출력합니다.
    System.out.println(num1 +"/"+num2 +"="+(double)num1 / num2);
    System.out.println(num1 +"%"+num2 +"="+(num1 % num2));

    s.close();
    }

}
