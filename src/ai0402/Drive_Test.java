package ai0402;

import java.util.Scanner;

public class Drive_Test {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

        System.out.println("====== 운전면허필기시험 합격여부 확인 ========");
        System.out.println("필기시험 점수를 입력하세요 : ");
        int score =s.nextInt();

        String result = ""; // empty String

        // 점수가 70점 이상이면 합격, 아니면 불합격으로 판정합니다.
        if (score >= 70)
        {
            result = "합격";
        }
        else
        {
            result = "불합격";

            System.out.printf("%d점 %s입니다.", score,result);
        }
        s.close();
    }
}
