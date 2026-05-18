package ai0430;

public class For_Test1 {
    public static void main(String[] args) {
        String[] subjectArr = {"자바프로그래밍 언어", "데이터베이스","융합UI실습","인공지능개론"};
        // 배열의 length만큼 반복하면 모든 과목명을 순서대로 출력할 수 있습니다.
        for (int i = 0; i < subjectArr.length; i++)
        {
            System.out.println("저는 " + subjectArr[i] + "(을)를 이번에 처음 공부해요.");
        }
    }
}
