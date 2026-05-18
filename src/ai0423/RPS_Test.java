package ai0423; // 이 파일이 속한 패키지 이름 (폴더 개념)

import java.util.Random;  // 랜덤 숫자 생성을 위한 클래스 import
import java.util.Scanner; // 키보드 입력을 받기 위한 클래스 import

public class RPS_Test { // RPS_Test 클래스 선언 (파일명과 동일해야 함)
    public static void main(String[] args) { // 프로그램 시작점 (main 메서드)

        System.out.println("======= 가위 바위 보 게임 ========"); // 게임 타이틀 출력
        Scanner s = new Scanner(System.in); // Scanner 객체 생성 → 키보드 입력 준비

        System.out.println("가위,바위,보 중 하나를 입력하세요 : "); // 입력 안내 메시지 출력
        String me = s.nextLine(); // 사용자가 입력한 문자열을 me 변수에 저장

        // 배열은 같은 종류의 값을 번호(index)로 묶어 보관할 때 사용합니다.
        String[] computer = {"가위","바위","보"}; // 컴퓨터가 선택할 수 있는 값을 배열로 선언
        // 인덱스: 가위=0, 바위=1, 보=2

        Random random = new Random(); // Random 객체 생성 → 랜덤 숫자 생성 준비

        int randNum = random.nextInt(3); // 0~2 사이 랜덤 정수 생성

        String computerChoice = computer[randNum]; // 랜덤 인덱스로 배열에서 컴퓨터 선택값 가져오기

        System.out.println("컴퓨터의 가위,바위,보 : " + computer[randNum]); // 컴퓨터 선택 출력

        String result = ""; // 최종 결과 문자열 초기화 (빈 문자열로 시작)

        // ===================== 승패 판별 로직 =====================

        // 문자열 비교는 ==가 아니라 equals()를 사용합니다.
        if(me.equals("가위")) { // 사용자가 "가위"를 선택한 경우
            if (computerChoice.equals("가위"))
                result = "비겼습니다.";      // 가위 vs 가위 → 비김
            else if (computerChoice.equals("바위"))
                result = "졌습니다.";        // 가위 vs 바위 → 짐
            else
                result = "이겼습니다.";      // 가위 vs 보  → 이김

        } else if(me.equals("바위")) { // 사용자가 "바위"를 선택한 경우
            if (computerChoice.equals("가위"))
                result = "이겼습니다.";      // 바위 vs 가위 → 이김
            else if (computerChoice.equals("바위"))
                result = "비겼습니다.";      // 바위 vs 바위 → 비김
            else
                result = "졌습니다.";        // 바위 vs 보  → 짐

        } else { // 사용자가 "보"를 선택한 경우 (가위,바위가 아니면 보로 처리)
            if (computerChoice.equals("가위"))
                result = "졌습니다.";        // 보 vs 가위 → 짐
            else if (computerChoice.equals("바위"))
                result = "이겼습니다.";      // 보 vs 바위 → 이김
            else
                result = "비겼습니다.";      // 보 vs 보  → 비김
        }

        // %s 자리에 순서대로 me, computerChoice, result 값이 들어감
        System.out.printf("나는 %s, 컴퓨터 %s 이므로 %s", me, computerChoice, result);

        s.close(); // Scanner 객체 닫기 → 입력 스트림 자원 반환 (메모리 누수 방지)

    }
}
