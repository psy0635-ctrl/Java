package ai0611_2.interfacetest;

// Car 인터페이스를 구현한 K9 클래스
// implements Car → Car에 선언된 메서드 7개를 모두 @Override로 구현해야 합니다
// (하나라도 빠지면 컴파일 에러 발생)
public class K9 implements Car {

    // Car 인터페이스의 메서드를 모두 오버라이드했지만 아직 내용을 채우지 않은 상태입니다
    // 실제 서비스라면 각 메서드 안에 K9 차량에 맞는 동작 코드를 작성해야 합니다

    @Override
    public void start() {
        // 시동 걸기 - 추후 구현 예정
    }

    @Override
    public void stop() {
        // 정지 - 추후 구현 예정
    }

    @Override
    public void upSpeed(int speed) {
        // 가속 - 추후 구현 예정
    }

    @Override
    public void downSpeed(int speed) {
        // 감속 - 추후 구현 예정
    }

    @Override
    public void rotate(String direction) {
        // 방향 전환 - 추후 구현 예정
    }

    @Override
    public void forwardSpeed(int speed) {
        // 전진 - 추후 구현 예정
    }

    @Override
    public void backwardSpeed(int speed) {
        // 후진 - 추후 구현 예정
    }
}
