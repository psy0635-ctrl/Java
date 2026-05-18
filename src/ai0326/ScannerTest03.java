package ai0326;

import java.util.Scanner;

public class ScannerTest03 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");

        int num = s.nextInt();
        // 입력받은 정수를 자기 자신과 곱해 제곱값을 만듭니다.
        int result = num * num;

        System.out.println("정수의 제곱값 : " + result);
    }
}
