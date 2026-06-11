package ai0611.lab;

import ai0611.lab.subcar.SchoolBus;
import ai0611.lab.subcar.SportsCar;

import java.util.Scanner;

// 스쿨버스와 스포츠카 객체를 만들고 속도를 입력받아 테스트하는 실행 클래스
public class RunCarMain {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);  // 키보드 입력을 받기 위한 Scanner 객체
        int speed = 0;                        // 사용자가 입력할 가속 속도

        SchoolBus schoolBus = new SchoolBus();   // 스쿨버스 객체 생성
        SportsCar sportsCar = new SportsCar();   // 스포츠카 객체 생성

        // -1을 입력할 때까지 계속 반복
        while (true) {

            System.out.print("가속할 속도 입력(종료는 -1 입력) : ");

            speed = s1.nextInt();  // 사용자로부터 정수 입력받기

            // -1 입력 시 반복문 탈출 → 프로그램 종료
            if (speed == -1)
                break;

            // 두 차량 모두 같은 속도로 가속
            schoolBus.upSpeed(speed);
            sportsCar.upSpeed(speed);

            // 각 차량의 현재 누적 속도 출력
            System.out.printf("스쿨버스의 현재 속도 : %d\n",
                    schoolBus.getSpeed());

            System.out.printf("스포츠카의 현재 속도 : %d\n",
                    sportsCar.getSpeed());
        }

        s1.close();  // Scanner 사용 후 닫아서 자원 반납
    }
}
