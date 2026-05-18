package ai0514;

public class Continue_Test {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i <=100; i++) {
           // 4의 배수는 더하지 않고 다음 반복으로 넘어갑니다.
           if(i % 4 == 0)
               continue;
            sum += i;
        }
        System.out.println("1 ~ 100까지의 합계(4의 배수를 제외한 합계) :" + sum);
    }
}
