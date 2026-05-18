package ai0319;

public class variableTest5 {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 8;

        // (double)을 붙이면 정수 나눗셈이 아니라 실수 나눗셈으로 계산됩니다.
        double result = (double) n1 / n2;

        // %.2f는 소수점 둘째 자리까지 출력하라는 의미입니다.
        System.out.printf("%d ÷ %d = %.2f" , n1 , n2, result);


    }
}
