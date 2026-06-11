package ai0611.lab.subcar;

import ai0611.lab.car.Car;

// Car 클래스를 상속받은 스쿨버스 클래스
// extends Car → Car의 speed, getSpeed() 등을 그대로 물려받습니다
public class SchoolBus extends Car {

    // 부모 클래스의 upSpeed()를 재정의한 메서드
    // 매개변수 이름을 value로 써도 의미는 동일합니다 (속도를 올릴 값)
    public void upSpeed(int value) {
        this.speed += value;  // 입력받은 값만큼 현재 속도에 더합니다
    }
}
