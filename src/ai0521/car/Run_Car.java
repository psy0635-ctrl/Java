package ai0521.car;

public class Run_Car {
    public static void main(String[] args) {
        Car sonata = new Car("현대 자동차" , "소나타" , 1600, "은색" , 400000000);
        System.out.println("============ 자동차 정보 ==============");
        System.out.println("제조사 : " + sonata.getProduct());
        System.out.println("자동차모델 : " + sonata.getName());
        System.out.println("배기량 : " + sonata.getDisplacement() + "cc");
        System.out.println("색상 : " + sonata.getColor());
        System.out.println("가격 : " + sonata.getPrice() + "원");

        sonata.startOn();
        sonata.drive();
        sonata.forward();
        sonata.rotate("좌회전");
        sonata.drive();
        System.out.println();

    }
}
