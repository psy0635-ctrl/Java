package ai0514;

public class Double_For_Test2 {
    public static void main(String[] args) {
        // i를 곱하는 수로, j를 단으로 사용해 구구단을 가로 방향으로 출력합니다.
        for (int i = 1; i <=9; i++) {
            for (int j = 2; j <=9 ; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }

    }

}

