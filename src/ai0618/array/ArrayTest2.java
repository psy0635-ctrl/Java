package ai0618.array;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
    String[] subjects = {"프로그래밍언어실습", "데이터베이스", "융합UI실습"};

        System.out.println("★ 현재 배열의 길이: " + subjects.length);
        System.out.println("★ 현재 배열의 내용");

        // 향상된 for문
        // subjects 배열 안에 있는 값을 하나씩 꺼내 subject 변수에 저장
        for (String subject : subjects) {
        System.out.println(subject + " ");
    }
        System.out.println();

        // 기존 배열 subjects를 복사하면서 크기를 2칸 더 늘림
        // 기존 길이 3 + 2 = 새 길이 5
        // 기존 값 3개는 그대로 유지되고, 새로 생긴 2칸은 null 상태가 됨
        subjects = Arrays.copyOf(subjects, subjects.length + 2);

        // 새로 늘어난 배열의 뒤에서 두 번째 칸에 값 저장
        // 현재 subjects.length는 5이므로 5 - 2 = 3
        // 즉, subjects[3] 위치에 저장됨
        subjects[subjects.length-2] = "영상인공지능처리";

        // 새로 늘어난 배열의 마지막 칸에 값 저장
        // 현재 subjects.length는 5이므로 5 - 1 = 4
        // 즉, subjects[4] 위치에 저장됨
        subjects[subjects.length -1] = "직업과 경력개발";

        System.out.println("★ 새로운 배열의 길이: " + subjects.length);
        System.out.println("★ 현재 배열의 내용");

        // 배열에 들어 있는 모든 과목을 다시 하나씩 출력
        for (String subject : subjects) {
        System.out.println(subject + " ");
        }
    }
}
