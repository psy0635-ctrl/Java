package ai0430;

public class Lab_SetLine {
    public static void main(String[] args) {

        int fact = 1;        // 팩토리얼 결과값을 저장할 변수 (초기값 1로 시작 - 0이면 곱셈 결과가 항상 0이 됨)
        int friend_num = 5;  // 줄을 세울 학생 수 (A, B, C, D, E → 5명)

        // 1부터 friend_num(5)까지 반복하며 팩토리얼 계산
        // i = 1 → fact = 1 * 1 = 1
        // i = 2 → fact = 1 * 2 = 2
        // i = 3 → fact = 2 * 3 = 6
        // i = 4 → fact = 6 * 4 = 24
        // i = 5 → fact = 24 * 5 = 120
        for (int i = 1; i <= friend_num; i++) {
            fact = fact * i;  // 누적 곱셈: 이전 결과에 현재 i를 곱해 갱신
        }

        // 최종 결과 출력 → 5! = 120
        System.out.println("A,B,C,D,E 학생들을 순서대로 세우는 경우의 수 : " + fact);
    }
}