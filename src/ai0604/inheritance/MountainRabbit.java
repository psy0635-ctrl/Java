package ai0604.inheritance;

/*
 * =============================================
 * [자식 클래스] MountainRabbit (산토끼)
 * =============================================
 * Rabbit을 상속받은 산토끼 클래스.
 * "extends Rabbit" → Rabbit의 모든 필드와 메서드를 물려받는다.
 *
 * [물려받는 것들]
 *   - 필드: shape, xPos, yPos
 *   - 메서드: setLocation(), MoveRightTen(), moveLeftTen(), printInfo()
 *
 * [추가하는 것들]
 *   - 필드: mountainName (산토끼가 사는 산 이름)
 *   - 메서드: eatGrass() (산토끼만 하는 풀 먹기)
 * =============================================
 */
public class MountainRabbit extends Rabbit {

    // -----------------------------------------------
    // [추가 필드] 산토끼만 갖는 고유 속성
    // -----------------------------------------------
    String mountainName; // 산토끼가 사는 산의 이름 (예: "남산")


    // -----------------------------------------------
    // [추가 메서드] 산토끼만 할 수 있는 기능
    // -----------------------------------------------

    // 산에서 풀을 뜯어먹는 메서드
    // grassType: 풀의 종류를 매개변수로 전달받음 (예: "클로버")
    // mountainName: 이 객체의 mountainName 필드 값을 사용
    // 예) 남산 에서 산토끼가클로버 풀을 먹는다.
    public void eatGrass(String grassType) {
        System.out.println(mountainName + " 에서 산토끼가" + grassType + " 풀을 먹는다.");
    }
}
