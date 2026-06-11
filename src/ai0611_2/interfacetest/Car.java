package ai0611_2.interfacetest;

// interface(인터페이스): 클래스가 반드시 구현해야 할 메서드 목록을 정의하는 설계도
// 추상 클래스와 달리 모든 메서드가 구현 없이 선언만 되어 있습니다
// implements 키워드로 가져다 쓰며, 가져다 쓴 클래스는 아래 모든 메서드를 반드시 구현해야 합니다
public interface Car {

    // 인터페이스의 필드는 자동으로 public static final 상수가 됩니다
    // public static final을 생략해도 JVM이 자동으로 붙여줍니다
    public static final String PRODUCT = "KIA";             // 제조사 (생략 없이 명시)
    String ADDRESS = "서울시 서초구 양재동 기아빌딩";          // 주소 (public static final 생략 버전)

    // 아래는 모두 추상 메서드: 선언만 있고 내용({ })이 없습니다
    // implements한 클래스에서 반드시 @Override로 구현해야 합니다
    public void start();                        // 시동 걸기
    public void stop();                         // 정지
    public void upSpeed(int speed);             // 속도 올리기
    public void downSpeed(int speed);           // 속도 내리기
    public void rotate(String direction);       // 방향 전환
    public void forwardSpeed(int speed);        // 전진
    public void backwardSpeed(int speed);       // 후진
}
