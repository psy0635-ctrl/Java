package ai0402;

import java.util.Scanner;

public class Calculator_Test02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("학생 이름을 입력하세요 : ");
        String name = s.next();
        System.out.println("국어 점수를 입력하세요 : ");
        int kor = s.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        int eng = s.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        int math = s.nextInt();

        //계산
       // 세 과목 점수로 합계, 평균, 최댓값, 최솟값을 계산합니다.
       int sum = kor + eng + math;      // 합계
       double avg = (double) sum / 3;   // 평균
       int max = Math.max(kor,Math.max(eng,math));  //최대값
       int min = Math.min(kor,Math.min(eng,math));  //최소값

        //출력
        System.out.println("이름" + name);
        System.out.println("국어" + kor);
        System.out.println("수학" + math);
        System.out.println("영어" + eng);
        System.out.println("합계" + sum);
        System.out.println("평균" + avg);
        System.out.println("최소값" + min);
        System.out.println("최대값" + max);


















    }
}
