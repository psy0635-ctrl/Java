package ai0611_2.interfacetest;

// Sportage 객체를 생성하고 Car 인터페이스의 메서드를 실제로 호출해보는 실행 클래스
public class RunCarMain {
    public static void main(String[] args) {

        // 인터페이스는 new로 직접 객체를 만들 수 없습니다 → 아래처럼 하면 에러!
        // Car car = new Car();  // ❌ 컴파일 에러

        // Car 인터페이스를 구현한 Sportage 클래스로 객체 생성
        Sportage sportage = new Sportage();

        // 인터페이스에 선언된 상수는 "인터페이스명.상수명" 으로 접근합니다
        System.out.println(Car.PRODUCT);   // 출력: KIA
        System.out.println(Car.ADDRESS);   // 출력: 서울시 서초구 양재동 기아빌딩

        // 순서대로 시동 → 가속 → 감속 → 회전 → 정지 호출
        sportage.start();           // 시동 걸기
        sportage.upSpeed(50);       // 50 가속 → 현재 속도 50
        sportage.downSpeed(10);     // 10 감속 → 현재 속도 40
        sportage.rotate("우");      // 우회전
        sportage.stop();            // 정지
    }
}
