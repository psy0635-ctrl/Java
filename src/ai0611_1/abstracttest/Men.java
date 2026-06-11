package ai0611_1.abstracttest;

// Person 추상 클래스를 상속받은 남성(아들) 클래스
// Person에 추상 메서드(study)가 있으므로, 반드시 여기서 구현해야 합니다
public class Men extends Person {

    // @Override: 부모의 추상 메서드 study()를 아들 버전으로 구체적으로 구현
    // 이 클래스만의 study() 방식을 정의합니다
    @Override
    public void study() {
        System.out.println("아들이 공부를 열심히 한다.");
    }
}
