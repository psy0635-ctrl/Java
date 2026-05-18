package ai0416;

import java.util.Scanner;

public class EvenOddTest {
    public static void main(String[] args) {
        System.out.println("====== 짝수 / 홀수 판별 프로그램 ======");
        Scanner s = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");

        int num = s.nextInt();
        String result = "";  // 결과 문자열을 담을 변수 선언, 일단 빈 문자열로 초기화

        // 2로 나눈 나머지가 0이면 짝수, 아니면 홀수입니다.
        if(num % 2 == 0)
            result = "짝수";
        else
            result = "홀수";

        System.out.printf("입력된 정수 값 %d 는 %s 입니다.\n",num,result);

        System.out.println("프로그램 종료!");

        s.close();
    }
}
