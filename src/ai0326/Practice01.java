package ai0326;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("문자를 입력하세요 : ");

        String a = s.next();

        // 입력받은 문자열을 정수로 변환해야 곱셈 계산이 가능합니다.
        int n = Integer.parseInt(a);

        System.out.println("이 정수의 제곱값은 : " + (n * n));

        s.close();
    }

}
