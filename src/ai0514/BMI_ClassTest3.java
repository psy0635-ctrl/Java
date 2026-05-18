package ai0514;

import java.util.Scanner;

public class BMI_ClassTest3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        System.out.println("=============BMI 계산==============");

        // exit가 입력될 때까지 BMI 계산을 반복하는 무한 반복문입니다.
        while (true) {
            System.out.println("체중(Kg, 실수값)을 입력하세요 : ");
            double weight = s.nextDouble();
            System.out.println("키(cm, 실수값)을 입력하세요 : ");
            double height = s.nextDouble();

            System.out.println("성명 입력 : ");
            String name = s1.nextLine();

            String result1 = "";
            String result2 = "";

            // 이름에 exit를 입력하면 프로그램을 종료합니다.
            if(name.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            // BMI 공식: 몸무게(kg) / 키(m)의 제곱입니다.
            double bmi = weight / Math.pow(height / 100, 2);

            // 계산된 BMI 값의 범위에 따라 안내 문구를 다르게 저장합니다.
            if (bmi < 18.5) {
                result1 = "저체중";
                result2 = "식단과 운동을 통해 체중을 증량시켜야합니다. 생명에 위험이 있을 수도 있습니다.";
            } else if (bmi < 22.9) {
                result1 = "정상";
                result2 = "현재 체중을 유지하시기 바랍니다";
            } else if (bmi < 24.9) {
                result1 = "과";
                result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다";
            } else if (bmi < 29.9) {
                result1 = "비만";
                result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다. 성인병 유발에 원인이 될 수 있습니다";
            } else {
                result1 = "고도비만";
                result2 = "전문가의 도움을 받아 식단과 운동을 통해 체중을 감량하시기 바랍니다. 고혈압, 고지혈증, 당뇨병이 발생할 수 있습니다";
            }
            System.out.printf("* %s님의 bmi 지수 결과: %.2f㎏/㎡", name, bmi);
            System.out.printf("* %s체중은 %s\n", result1, result2);
            System.out.println();
        }


        s.close();
        s1.close();

    }
}
