package ai0326;

import java.util.Scanner;

public class BMI_ClassTest {
    static void main(String[] args) {
        // 숫자 입력과 문자열 입력을 나누어 받기 위해 Scanner를 두 개 사용한 예제입니다.
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

        // BMI 공식: 몸무게(kg) / 키(m)의 제곱입니다.
        double bmi = weight / Math.pow(height/100,2);  // pow 뒤 숫자를 제곱한다.

        System.out.printf("*%s 님의 BMI 지수 결과: %.2f㎏/㎡\n",name,bmi);

        s.close();
        s1.close();

    }
}
