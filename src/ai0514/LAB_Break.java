package ai0514;

import java.util.Random;

public class LAB_Break {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        // 세 주사위 값이 모두 같아질 때까지 계속 던집니다.
        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int dice3 = random.nextInt(6) + 1;
            count++;

            // 세 값이 모두 같으면 반복을 멈춥니다.
            if(dice1 == dice2 && dice2 == dice3){
                System.out.println("3개의 주사위는 모두 " + dice1 + "입니다.");
                System.out.println("같은 숫자가 나올 때까지 " + count + "번 던졌습니다.");
                break;
            }
        }
    }
}
