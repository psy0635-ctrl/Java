package ai0611_1.abstracttest;

// Men, Women 객체를 실제로 생성하고 메서드를 호출해보는 실행 클래스
public class RunPerson {
    static void main(String[] args) {

        // Person은 추상 클래스라 직접 객체 생성 불가 → 아래처럼 하면 에러!
        // Person person = new Person();  // ❌ 컴파일 에러

        // Men 객체 생성 후 필드 값 직접 설정
        Men men = new Men();
        men.name   = "김폴리";
        men.weight = 70;
        men.height = 180;

        // Women 객체 생성 후 필드 값 직접 설정
        Women women = new Women();
        women.name   = "박인순";
        women.weight = 48;
        women.height = 170;

        // men 객체 메서드 호출
        // eat(), sleep()은 Person에서 구현된 메서드를 그대로 상속받아 사용
        // study()는 Men 클래스에서 재정의한 버전이 실행됨
        men.eat("김치찌개");
        men.study();
        men.sleep(8);

        // women 객체 메서드 호출
        // study()는 Women 클래스에서 재정의한 버전이 실행됨 (men과 결과가 다름)
        women.eat("파스타");
        women.study();
        women.sleep(10);
    }
}
