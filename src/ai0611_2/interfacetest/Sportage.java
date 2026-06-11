package ai0611_2.interfacetest;

// Car 인터페이스를 구현한 스포티지 클래스
// K9과 달리 주요 메서드에 실제 동작 내용이 채워져 있습니다
public class Sportage implements Car {

    public static final String Carname = "스포티지";  // 이 클래스에서만 쓰는 차량 이름 상수
    public int speed;                                 // 현재 속도 (누적됨)

    @Override
    public void start() {
        System.out.println(Carname + "자동차의 시동을 건다.");
    }

    @Override
    public void stop() {
        System.out.println(Carname + "자동차를 멈춘다.");
    }

    // 속도를 올릴 때: 현재 속도에 입력값을 더합니다
    @Override
    public void upSpeed(int speed) {
        this.speed += speed;  // 누적 덧셈 (예: 현재 0 → +50 → 50)
        System.out.println(Carname + "자동차의 속도를 가속하여 현재 속도는" + this.speed + " 입니다.");
    }

    @Override
    public void downSpeed(int speed) {
        this.speed -= speed;  // 현재 속도에서 입력값만큼 뺍니다 (감속)
        System.out.println(Carname + "자동차의 속도를 감속하여 현재 속도는" + this.speed + " 입니다.");
    }

    @Override
    public void rotate(String direction) {
        System.out.println(Carname + "자동차를" + direction + " 회전한다");
    }

    // 아직 내용이 없는 메서드 (인터페이스 규칙상 선언은 반드시 해야 함)
    @Override
    public void forwardSpeed(int speed) {

    }

    // 아직 내용이 없는 메서드 (인터페이스 규칙상 선언은 반드시 해야 함)
    @Override
    public void backwardSpeed(int speed) {

    }
}
