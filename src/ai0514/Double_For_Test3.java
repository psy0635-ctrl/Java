package ai0514;

public class Double_For_Test3 {
    public static void main(String[] args) {
        // 2단부터 9단까지 각 단을 줄바꿈하며 출력합니다.
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
