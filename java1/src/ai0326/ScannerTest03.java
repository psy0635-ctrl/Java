package ai0326;

import java.util.Scanner;

public class ScannerTest03 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");

        int num = s.nextInt();
        int result = num * num;

        System.out.println("정수의 제곱값 : " + result);
    }
}
