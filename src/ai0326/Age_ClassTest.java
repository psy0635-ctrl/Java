package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class Age_ClassTest {
    static void main(String[] args) {
        System.out.println("=== 나이계산 ====");
        Scanner s = new Scanner(System.in);
        System.out.println("출생년도를 입력하세요:");
        int birthyear = s.nextInt();

        // 현재년도 구하기
        Calendar calendar = Calendar.getInstance();
        int NowYear = calendar.get(Calendar.YEAR);

        int age = NowYear - birthyear;


        System.out.println("현재 당신의 나이는"+ age +"세 입니다.");

        s.close();
    }
}
