package ai0604.inheritance;

/*
 * =============================================
 * [실행 클래스] RunRabbit
 * =============================================
 * 실제로 토끼 객체를 만들고 실행하는 클래스.
 * main 메서드가 있어야 Java 프로그램의 시작점이 된다.
 * =============================================
 */
public class RunRabbit {

    // main 메서드: 프로그램이 실행될 때 가장 먼저 호출되는 메서드
    // public static void main(String[] args) 는 Java 실행의 고정 형식
    public static void main(String[] args) {

        // ==============================================
        // [집토끼 객체 생성 및 사용]
        // ==============================================

        // HouseRabbit 객체 hr1 생성
        // new HouseRabbit() → 메모리에 집토끼 객체를 만들고, hr1 변수에 저장
        // hr1은 Rabbit의 필드(shape, xPos, yPos)와 메서드도 함께 사용 가능
        HouseRabbit hr1 = new HouseRabbit();

        // 부모(Rabbit)에서 물려받은 필드에 값 저장
        hr1.shape = "동그라미"; // 토끼 모양 설정

        // 부모(Rabbit)에서 물려받은 메서드 호출
        hr1.setLocation(30, 50); // xPos=30, yPos=50 으로 위치 설정
        hr1.MoveRightTen();      // xPos += 10 → xPos가 30에서 40으로 이동
        hr1.printInfo();         // "동그라미 모양의 토끼는 (40, 50) 좌표에 위치하고 있다." 출력

        // HouseRabbit만 가진 고유 필드와 메서드 사용
        hr1.masterName = "폴리";       // 주인 이름 설정
        hr1.eatFeed("아주 좋은");      // "집토끼가 폴리 주인이 주는 아주 좋은 사료를 먹는다." 출력


        // ==============================================
        // [산토끼 객체 생성 및 사용]
        // ==============================================

        // MountainRabbit 객체 mr1 생성
        // new MountainRabbit() → 메모리에 산토끼 객체를 만들고, mr1 변수에 저장
        MountainRabbit mr1 = new MountainRabbit();

        // 부모(Rabbit)에서 물려받은 필드에 값 저장
        mr1.shape = "세모"; // 토끼 모양 설정

        // 부모(Rabbit)에서 물려받은 메서드 호출
        mr1.moveLeftTen(); // xPos -= 10 → xPos: 0 → -10
        mr1.moveLeftTen(); // xPos -= 10 → xPos: -10 → -20
        mr1.printInfo();   // "세모 모양의 토끼는 (-20, 0) 좌표에 위치하고 있다." 출력

        // MountainRabbit만 가진 고유 필드와 메서드 사용
        mr1.mountainName = "남산";     // 사는 산 이름 설정
        mr1.eatGrass("클로버");        // "남산 에서 산토끼가클로버 풀을 먹는다." 출력
    }
}
