package ai0416;

import java.util.Scanner;

public class OverlabIf_Test {
    public static void main(String[] args) {
        System.out.println("====== 특정 범위 숫자 판별 프로그램 ======");

        Scanner s = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = s.nextInt();

        // 첫 번째 if로 100보다 큰지 확인하고, 안쪽 if로 1000보다 작은지 다시 확인합니다.
        if (num > 100){ // num > 100 && num < 1000    // 1단계 : 100보다 큰가?
            if(num < 1000)  // 2단계 : 그 중에서 1000보다 작은가?
                System.out.printf("입력된 숫자 %d는(은) 100보다 크고 1000보다 작은 숫자이군요.\n",num);
            else            // 2단계 실패 : 1000 이상
                System.out.printf("입력된 숫자 %d는(은) 1000보다 큰 숫자이군요.\n",num);
        }else{              // 1단계 실패 : 100 이하
            System.out.printf("입력된 숫자 %d는(은)100보다 작은 숫자이군요.\n",num);
            }
    }



}

