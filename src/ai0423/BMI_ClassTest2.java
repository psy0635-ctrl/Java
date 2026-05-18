package ai0423;

import java.util.Scanner;

public class BMI_ClassTest2 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);  // 문자열 입력용
        System.out.println("========= BMI =========\n");
        // 체중(kg),키(cm) - 실수값 입력 -> nextdouble()
        System.out.println("체중을 입력하세요(kg) : ");
        double weight = s.nextDouble();

        System.out.println("키를 입력하세요(cm) :");
        double height = s.nextDouble();

        System.out.println("이름을 입력하세요:");
        String name = s1.nextLine();

        // BMI를 계산한 뒤 결과값의 범위에 따라 체중 상태를 분류합니다.
        double bmi = weight / Math.pow(height/100,2);  // pow 뒤 숫자를 제곱한다.

        System.out.printf("*%s 님의 BMI 지수 결과: %.2f㎏/㎡\n",name,bmi);

        // else if는 위 조건이 거짓일 때 다음 조건을 차례대로 검사합니다.
        if(bmi >= 30)
            System.out.println("2단계 비만체중 입니다.");
        else if (bmi >= 29.9)
            System.out.println("1단계 비만체중 입니다.");
        else if (bmi >= 24.9)
            System.out.println("위험체중 입니다.");
        else if (bmi >= 22.9)
            System.out.println("정상체중 입니다.");
        else
            System.out.println("저체중 입니다.");




        s.close();
        s1.close();

    }
}
