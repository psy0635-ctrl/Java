package ai0409;  // 이 파일이 속한 폴더(패키지)의 이름입니다.

import java.util.Scanner; // 사용자의 입력을 받기 위해 Scanner라는 도구를 가져옵니다.

public class Study_Avg_Test { // 프로그램의 이름(클래스명)입니다.
     static void main(String[] args) { // 프로그램이 시작되는 진입점입니다.
        Scanner s = new Scanner(System.in); // 키보드 입력을 읽어올 's'라는 이름의 Scanner 객체를 만듭니다.

        System.out.println("======= 기말 평균 학점 구하기 =======");

        System.out.println("자바 성적 점수 입력(학점 3) : ");
        double score1 = s.nextDouble(); // 사용자가 입력한 숫자를 double(실수) 형태로 읽어 score1에 저장합니다.

        System.out.println("모바일 성적 점수 입력(학점 2) : ");
        double score2 = s.nextDouble(); // 모바일 성적 저장

        System.out.println("엑셀 성적 점수 입력(학점 1) : ");
        double score3 = s.nextDouble(); // 엑셀 성적 저장

        // ||는 '또는(OR)'을 의미합니다.
        // 입력된 성적 중 하나라도 0보다 작거나, 4.5보다 크면 잘못된 입력으로 판단합니다.
        if (score1 < 0 || score1 > 4.5 ||score2 < 0 || score2 > 4.5 || score3 < 0 || score3 > 4.5)
        {
            System.out.println("잘못된 성적입니다. 0.0 ~ 4.5 사이로 입력하세요.");
        }
        else
        {       // 가중 평균 계산 공식: (학점 * 성적)의 합 / 총 학점의 합
            double avg = (3 * score1 + 2 * score2 + 1 * score3) / (3+2+1);
            System.out.printf("3과목 평균 학점 : %.2f\n",avg); // printf는 서식(Format)을 지정해 출력합니다.
        }

        s.close();// 사용이 끝난 Scanner를 닫아 메모리 자원을 되돌려줍니다

    }

}
