package ai0611.lab.subcar;

import ai0611.lab.car.Car;

// Car 클래스를 상속받은 스포츠카 클래스
// extends Car → Car의 speed, getSpeed() 등을 그대로 물려받습니다
public class SportsCar extends Car {

    // @Override: 부모 클래스의 upSpeed() 메서드를 자식 클래스에서 재정의(덮어쓰기)
    // 현재는 부모와 동일한 내용이지만, 나중에 스포츠카만의 특별한 가속 로직을 넣을 수 있습니다
    @Override
    public void upSpeed(int speed){
        this.speed += speed;  // 입력받은 속도만큼 현재 속도에 더합니다
    }
}
