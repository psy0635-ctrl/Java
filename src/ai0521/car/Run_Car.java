package ai0521.car;

// Run_Car 클래스는 Car 클래스를 실제로 사용해 보는 실행용 클래스입니다.
public class Run_Car {

    // main 메서드는 Java 프로그램이 시작되는 위치입니다.
    public static void main(String[] args) {

        // Car 클래스로 sonata라는 자동차 객체를 생성합니다.
        // new Car(...) 안에 넣은 값들은 Car 생성자의 매개변수로 전달됩니다.
        Car sonata = new Car("현대 자동차", "소나타", 1600, "은색", 400000000);

        // getter 메서드를 사용해서 sonata 객체 안에 저장된 값을 출력합니다.
        System.out.println("============ 자동차 정보 ==============");
        System.out.println("제조사: " + sonata.getProduct());
        System.out.println("자동차 모델명: " + sonata.getName());
        System.out.println("배기량: " + sonata.getDisplacement() + "cc");
        System.out.println("색상: " + sonata.getColor());
        System.out.println("가격: " + sonata.getPrice() + "원");

        // Car 클래스에 만들어 둔 기능 메서드들을 호출합니다.
        // 메서드를 호출하면 Car 클래스 안의 출력문이 실행됩니다.
        sonata.startOn();        // 시동 켜기
        sonata.drive();          // 주행하기
        sonata.forward();        // 전진하기
        sonata.rotate("좌회전");  // 방향을 전달해서 회전하기
        sonata.drive();          // 다시 주행하기

        Car ev6 = new Car();
        ev6.setProduct("기아자동차");
        ev6.setName("EV6");
        ev6.setDisplacement(1500);
        ev6.setColor("파랑");
        ev6.setPrice(50000000);

        System.out.println("제조사: " + ev6.getProduct());
        System.out.println("자동차 모델명: " + ev6.getName());
        System.out.println("배기량: " + ev6.getDisplacement() + "cc");
        System.out.println("색상: " + ev6.getColor());
        System.out.println("가격: " + ev6.getPrice() + "원");

    }
}
