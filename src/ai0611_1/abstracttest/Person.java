package ai0611_1.abstracttest;

// abstract class(추상 클래스): 직접 객체를 만들 수 없고, 반드시 상속해서 써야 하는 클래스
// 공통 기능(eat, sleep)은 여기서 구현하고, 자식마다 다르게 구현해야 할 기능(study)은 추상 메서드로 선언합니다
public abstract class Person {

    // 사람이라면 공통으로 가지는 기본 정보 (필드)
    String name;    // 이름
    int weight;     // 몸무게
    int height;     // 키

    // 일반 메서드: 내용이 있고, 자식 클래스가 그대로 물려받아 사용합니다
    public void eat(String food) {
        System.out.println(food + "를 먹는다.");
    }

    // 일반 메서드: 내용이 있고, 자식 클래스가 그대로 물려받아 사용합니다
    public void sleep(int hour) {
        System.out.println(hour + "시간 잔다.");
    }

    // abstract 메서드: 내용이 없고, 자식 클래스에서 반드시 @Override해서 구현해야 합니다
    // study() 방식은 사람마다 다르기 때문에 추상 메서드로 선언합니다
    public abstract void study();
}
