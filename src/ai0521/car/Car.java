package ai0521.car;

// Car 클래스는 "자동차" 한 대의 정보를 저장하고,
// 자동차가 할 수 있는 동작을 메서드로 표현한 설계도입니다.
public class Car {

    // 필드(field): 객체가 가지고 있는 데이터입니다.
    // private을 붙이면 클래스 바깥에서 직접 접근할 수 없습니다.
    // 그래서 아래에 있는 getter/setter 메서드를 통해 값을 읽거나 변경합니다.
    private String product;       // 제조사
    private String name;          // 자동차 이름
    private int displacement;     // 배기량(cc)
    private String color;         // 자동차 색상
    private int price;            // 자동차 가격

    // 기본 생성자(default constructor)
    // 객체만 먼저 만들고, 필드 값은 나중에 setter로 넣고 싶을 때 사용합니다.
    public Car() {
    }

    // 매개변수가 있는 생성자
    // 객체를 만들 때 제조사, 이름, 배기량, 색상, 가격을 한 번에 초기화합니다.
    public Car(String product, String name, int displacement, String color, int price) {
        // this는 "현재 만들어지고 있는 객체"를 의미합니다.
        // this.product는 필드 product이고, 오른쪽 product는 매개변수 product입니다.
        this.product = product;
        this.name = name;
        this.displacement = displacement;
        this.color = color;
        this.price = price;
    }

    // getter 메서드: private 필드에 저장된 값을 가져올 때 사용합니다.
    public String getProduct() {
        return product;
    }

    // setter 메서드: private 필드의 값을 변경할 때 사용합니다.
    public void setProduct(String product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 아래 메서드들은 자동차의 기능을 표현합니다.
    // 실제 자동차가 움직이는 것은 아니고, 동작 내용을 문장으로 출력합니다.
    public void startOn() {
        System.out.println(name + " 자동차의 시동을 켭니다.");
    }

    public void startOff() {
        System.out.println(name + " 자동차의 시동을 끕니다.");
    }

    public void drive() {
        System.out.println(name + " 자동차가 주행합니다.");
    }

    public void stop() {
        System.out.println(name + " 자동차가 멈춥니다.");
    }

    public void forward() {
        System.out.println(name + " 자동차가 전진합니다.");
    }

    public void backward() {
        System.out.println(name + " 자동차가 후진합니다.");
    }

    // direction 매개변수로 "좌회전", "우회전" 같은 방향을 전달받습니다.
    public void rotate(String direction) {
        System.out.println(name + " 자동차가 " + direction + "합니다.");
    }
}
