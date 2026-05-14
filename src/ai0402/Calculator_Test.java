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

    System.out.println(num1 +"+"+num2 +"="+(num1 + num2));
    System.out.println(num1 +"-"+num2 +"="+(num1 - num2));
    System.out.println(num1 +"x"+num2 +"="+(num1 * num2));
    System.out.println(num1 +"/"+num2 +"="+(double)num1 / num2);
    System.out.println(num1 +"%"+num2 +"="+(num1 % num2));

    s.close();
    }

}
