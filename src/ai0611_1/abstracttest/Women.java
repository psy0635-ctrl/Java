package ai0611_1.abstracttest;

// Person 추상 클래스를 상속받은 여성(딸) 클래스
// Person에 추상 메서드(study)가 있으므로, 반드시 여기서 구현해야 합니다
public class Women extends Person {

    // @Override: 부모의 추상 메서드 study()를 딸 버전으로 구체적으로 구현
    // Men의 study()와 내용이 다른 것처럼, 자식마다 다른 동작을 구현할 수 있습니다
    @Override
    public void study() {
        System.out.println("딸이 공부를 열심히 한다.");
    }
}
