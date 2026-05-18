package ai0423;

import java.util.Scanner;

public class Score_Test {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        System.out.print("프로그래밍 언어 실습 점수 입력 : ");
//        int score = s.nextInt();
//        char result = 0;
//
//        if (score >= 90)
//            result = 'A';
//        else if (score >= 80)
//            result = 'B';
//        else if (score >= 70)
//            result ='C';
//        else if (score >= 60)
//            result ='D';
//        else
//            result ='F';
//
//        System.out.println("프로그래밍 언어 실습 과목의 학점은 " + result + " 입니다.");
//
//        s.close();


        System.out.print("나이 입력 ===> ");

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();


        // 나이가 20세 이상인지에 따라 서로 다른 문장을 출력합니다.
        if(age >= 20)
        {
            System.out.println("즐거운 시간 보내세요.^^");
            System.out.println("협조 감사합니다.");
        }
        else
            System.out.println("미성년자이므로 입장 불가합니다.");

        s.close();



    }
}
