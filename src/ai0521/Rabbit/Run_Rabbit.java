package ai0521.Rabbit;

public class Run_Rabbit {
    public static void main(String[] args) {
        // 1. 생성자 호출 → Rabbit 객체 생성
        Rabbit r = new Rabbit(); // 참조변수 r, 생성자 호출

        // 3. setter로 값 저장
        r.setShape("원형");       // setter로 값 저장
        r.setPosition(10, 20); // 메서드로 위치 설정

        // 2. getter로 값 읽기
        System.out.println("모양: "  + r.getShape());  // 원형
        System.out.println("X위치: " + r.getxPos());  // 10
        System.out.println("Y위치: " + r.getyPos());  // 20

        // 위치 변경 후 다시 출력
        r.setxPos(50);           // xPos = 50으로 변경
        r.setyPos(100);          // yPos = 100으로 변경
        System.out.println("변경 후 X: " + r.getxPos()); // 50
        System.out.println("변경 후 Y: " + r.getyPos()); // 100
    }
}
