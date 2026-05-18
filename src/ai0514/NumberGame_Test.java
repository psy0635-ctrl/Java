package ai0514;

import java.util.Random;
import java.util.Scanner;

public class NumberGame_Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // 키보드 입력을 받기 위한 Scanner 객체 생성
        int i = 1;           // 게임 회차를 나타내는 변수 (1회부터 시작)
        int num = 0;         // 사용자가 입력한 숫자를 저장하는 변수
        int computerNum = 0; // 컴퓨터가 생각한 숫자를 저장하는 변수
        Random random = new Random(); // 랜덤 숫자를 생성하기 위한 Random 객체 생성

        // 정답을 맞힐 때까지 반복되는 숫자 맞히기 게임입니다.
        while (true) // 조건 없이 무한 반복 → 맞출 때까지 계속 게임 진행
        {
            // random.nextInt(5) → 0~4 중 랜덤 숫자 생성
            // + 1 을 해서 → 1~5 범위로 변환
            computerNum = random.nextInt(5) + 1;

            // 현재 회차와 함께 문제 출력
            System.out.println("게임" + i + "회 : 컴퓨터가 생각한 숫자는 무엇 일까요?");

            // 사용자로부터 정수 입력받아 num에 저장
            num = s.nextInt();

            // 입력값과 컴퓨터 숫자가 같으면 정답이므로 반복을 종료합니다.
            if (computerNum == num) // 컴퓨터 숫자와 사용자 숫자가 같으면
            {
                System.out.println("축하합니다. 맞히셨어요~");
                break; // while 루프 탈출 → 게임 종료
            }

            // 틀렸을 경우 : 정답을 알려주고 다시 도전 유도
            System.out.println("아까워요." + computerNum + "였는데 , 다시 도전해 보세요");

            i++; // 회차 1 증가 (다음 게임은 2회, 3회 ...)
        }

        System.out.println("게임을 마칩니다."); // 게임 종료 메시지 출력
        s.close(); // Scanner 자원 반환 (메모리 누수 방지)
    }
}

