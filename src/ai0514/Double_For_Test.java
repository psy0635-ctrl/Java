package ai0514;

public class Double_For_Test {
    public static void main(String[] args) {
        // 바깥 for는 단, 안쪽 for는 곱하는 수를 담당하는 중첩 반복문입니다.
        for (int i = 2; i <=9; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }

    }

}
