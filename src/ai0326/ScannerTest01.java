package ai0326;

import java.util.Scanner;

public class ScannerTest01 {
    static void main(String[] args) {
        // Scanner는 키보드 입력을 프로그램 안으로 가져올 때 사용합니다.
        Scanner s = new Scanner(System.in);
        System.out.println("좋아하는 정수값을 입력하세요:");
        int num = s.nextInt();

        System.out.println("입력한 숫자는"+ num +"입니다.");

        s.close();

    }
}
