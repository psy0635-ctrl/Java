package ai0430;

import java.util.Scanner;

public class For_Test2 {
    public static void main(String[] args) {
        // i를 1부터 100까지 1씩 증가시키며 반복합니다.
        for (int i = 1; i <= 100 ; i++)
        {
            System.out.printf("%4d",i);
            // 10의 배수마다 줄을 바꿔 10개씩 보기 좋게 출력합니다.
            if(i % 10 == 0)
             System.out.print("\n");
        }

    }
}
