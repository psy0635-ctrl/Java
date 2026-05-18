package ai0514;

public class Continue_Test2 {
    public static void main(String[] args) {
        int sum =0;

        for (int i = 1; i <=100; i++) {
           // 홀수는 건너뛰고 짝수만 sum에 더합니다.
           if(i % 2 == 1)
               continue;
            sum += i;
        }
        System.out.println("1 ~ 100까지의 합계(짝수의 합계만) :" + sum);
    }
}
