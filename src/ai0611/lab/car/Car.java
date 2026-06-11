package ai0611.lab.car;

// 자동차의 공통 기능을 담은 부모(상위) 클래스
// SportsCar, SchoolBus 등이 이 클래스를 상속받아 사용합니다
public class Car {

    // protected: 이 클래스와 자식 클래스에서만 접근 가능한 속도 변수
    // (private이면 자식도 못 쓰고, public이면 아무나 쓸 수 있음)
    protected int speed;

    // 속도를 올리는 메서드 - 매개변수로 받은 값만큼 현재 속도에 더합니다
    // this.speed = 이 객체가 가진 speed 변수
    public void upSpeed(int speed){
        this.speed += speed;  // 현재 속도 += 입력받은 속도 (누적 증가)
    }

    // 현재 속도를 반환하는 메서드 (getter)
    public int getSpeed() {
        return speed;
    }
}
